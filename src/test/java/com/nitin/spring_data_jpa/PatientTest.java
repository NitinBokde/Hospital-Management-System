package com.nitin.spring_data_jpa;

import com.nitin.spring_data_jpa.entity.Patient;
import com.nitin.spring_data_jpa.repository.PatientRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;

@SpringBootTest
public class PatientTest {

    @Autowired
    private PatientRepository patientRepository;

    @Test
    public void testPatientRepository(){
        List<Patient> patientList =  patientRepository.findAll();
        System.out.println("patient list" +patientList);
    }

    @Test
    public void addPatient(){
        Patient patient1 = new Patient(
                null,
                "Rahul Sharma",
                LocalDate.of(1995, 5, 20),
                "rahul.sharma@gmail.com",
                "Male"
        );

        Patient patient2 = new Patient(
                null,
                "Priya Verma",
                LocalDate.of(1998, 8, 12),
                "priya.verma@gmail.com",
                "Female"
        );
        patientRepository.save(patient1);
        patientRepository.save(patient2);

    }
}
