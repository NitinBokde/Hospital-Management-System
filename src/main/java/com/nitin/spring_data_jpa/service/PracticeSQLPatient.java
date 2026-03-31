package com.nitin.spring_data_jpa.service;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.nitin.spring_data_jpa.entity.Patient;
import com.nitin.spring_data_jpa.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PracticeSQLPatient {
    @Autowired
    private PatientRepository patientRepository;

    public Long TotalNumberOfPatient(){
        Long answer = patientRepository.count();
        System.out.println("total number of rows : " + answer);
        return answer;
    }
    public Patient GetPatientByName(){
        Patient patient = patientRepository.findByName("Amit Sharma");
        System.out.println("patient info Amit Sharma : " + patient);
        return patient;
    }
//    findByBirthDateBefore
//        findByNameContaining
//        countByGender
    public List<Patient> GetPatientBirthDateBefore (LocalDate localDate){
        List<Patient> patientList = patientRepository.getPatientByBirthDateBefore(LocalDate.of(2000,07,11));
        return patientList;
    }

    public List<Patient> GetPatientAfterBirthDate(LocalDate localDate){
        List<Patient> patientList = patientRepository.getPatientByBirthDateAfter(LocalDate.of(1995,1,1));
        System.out.println("Patient After Birthdate 1995-1-1 : "+patientList);
        return patientList;
    }

    public long countByGender(String gender){
        long answer = patientRepository.countByGender(gender);
        return answer;
    }

    public List<Patient> findByNameContaining(String prefix){

        int count = patientRepository.countByNameContaining(prefix);
        List<Patient> patientList = patientRepository.findByNameContaining(prefix);
        System.out.println("total number of patient containing " + prefix + " " + count);
        return patientList;
    }

    public void printAllPatientName(){
        List<Patient> patientList = patientRepository.findAll();
        List<String> answer = patientList.stream().map(n->n.getName()).collect(Collectors.toList());
        System.out.println("List of name of patient" + answer);
    }

    public void printAllPatientNameUsingJPQL(){
        List<String> answer = patientRepository.findAllPatientName();
        System.out.println("list of all patient name : " + answer);
    }




}
