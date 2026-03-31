package com.nitin.spring_data_jpa.auth.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterUserDto {

    private String fullName;

    private String userName;

    private String email;

    private String password;
}
