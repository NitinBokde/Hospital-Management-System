package com.nitin.spring_data_jpa.runner;

import com.nitin.spring_data_jpa.repository.DoctorRepository;
import com.nitin.spring_data_jpa.service.DoctorService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class DoctorRunner implements CommandLineRunner {
    final private DoctorService doctorService;
    final private DoctorRepository doctorRepository;
    @Override
    public void run(String... args) throws Exception {
//        System.out.println(" List of doctors "+doctorService.findAllDoctor());
//        System.out.println("coount of records : " + doctorRepository.count());
//        System.out.println("hello world");
    }

}
