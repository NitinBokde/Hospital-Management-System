package com.nitin.spring_data_jpa.service;

import com.nitin.spring_data_jpa.entity.Doctor;
import com.nitin.spring_data_jpa.repository.DoctorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class DoctorService {
    private final DoctorRepository doctorRepository;

    public Doctor findDocterById(Long id){
        return doctorRepository.findById(id).orElseThrow(()->new RuntimeException("doctor with id " + id + "not found"));
    }

    public List<Doctor> findAllDoctor(){
        List<Doctor> doctorList= doctorRepository.findAll();
        return doctorList;
    }

    public void saveDoctor(Doctor doctor){
        doctorRepository.save(doctor);
    }

}
