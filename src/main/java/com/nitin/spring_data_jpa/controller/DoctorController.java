package com.nitin.spring_data_jpa.controller;

import com.nitin.spring_data_jpa.entity.Doctor;
import com.nitin.spring_data_jpa.service.DoctorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class DoctorController {

    private final DoctorService doctorService;

    @GetMapping("/api/doctors")
    public ResponseEntity<List<Doctor>> getAllDoctors(){
        List<Doctor> doctors = doctorService.findAllDoctor();
        return ResponseEntity.ok(doctors);
    }



}
