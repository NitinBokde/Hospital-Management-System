package com.nitin.spring_data_jpa.service;

import com.nitin.spring_data_jpa.auth.dto.LoginUserDto;
import com.nitin.spring_data_jpa.auth.dto.RegisterUserDto;
import com.nitin.spring_data_jpa.entity.Role;
import com.nitin.spring_data_jpa.entity.User;
import com.nitin.spring_data_jpa.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AuthenticationService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;

    public User signup(RegisterUserDto input) {
        System.out.println("inside signup service =======================");
        System.out.println("input: " + input.getFullName() + " " + input.getEmail());
        User user = User.builder()
                .fullName(input.getFullName())
                .email(input.getEmail())
                .password(passwordEncoder.encode(input.getPassword()))
                .userName(input.getUserName())
                .role(Role.ADMIN)
                //.role(Role.USER) // don't forget to set the role
                .build();

        System.out.println("Input User : " + user.toString());

        System.out.println("user built: " + user.getEmail());
        User saved =  userRepository.save(user);
        System.out.println("user saved with id: " + saved.getUserId());
        return saved;
    }

    public User authenticate(LoginUserDto input) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        input.getEmail(),
                        input.getPassword()
                )
        );

        return userRepository.findByEmail(input.getEmail())
                .orElseThrow();
    }
}
