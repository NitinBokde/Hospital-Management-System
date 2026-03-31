//package com.nitin.spring_data_jpa.runner;
//
//import com.nitin.spring_data_jpa.entity.Patient;
//import com.nitin.spring_data_jpa.service.PracticeSQLPatient;
//import lombok.AllArgsConstructor;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import java.sql.SQLOutput;
//import java.time.LocalDate;
//import java.util.List;
//
//@Component
//@AllArgsConstructor
//public class PatientRunner implements CommandLineRunner {
//
//    private final PracticeSQLPatient practiceSQLPatient;
//
//    @Override
//    public void run(String... args) throws Exception {
//
//
//        System.out.println("Total Patients: " + practiceSQLPatient.TotalNumberOfPatient());
////        findByName
//        System.out.println("patient with name Amit Sharma: " + practiceSQLPatient.GetPatientByName());
//
////        findByGender
////        findByBirthDateBefore
//        System.out.println("list of patient before BirthDate : " + LocalDate.of(2000, 07, 11) + " : "
//                + practiceSQLPatient.GetPatientBirthDateBefore(LocalDate.of(2000, 07, 11)));
////        findByNameContaining
////        countByGender
//        System.out.println("list of patient after BirthDate : " + LocalDate.of(1995,1,1) +
//        practiceSQLPatient.GetPatientAfterBirthDate(LocalDate.of(1995,1,1)));
//
//
//        System.out.println("count by gender");
//        System.out.println("male Patient : " + practiceSQLPatient.countByGender("Male"));
//        System.out.println("female Patient : " + practiceSQLPatient.countByGender("Female"));
//
//        System.out.println("patient name containing sharma :" + practiceSQLPatient.findByNameContaining("sharma"));
//
//        long t1 = System.currentTimeMillis();
//        practiceSQLPatient.printAllPatientName();
//        long t2 = System.currentTimeMillis();
//        System.out.println(t2 - t1);
//
//        long t3 = System.currentTimeMillis();
//        practiceSQLPatient.printAllPatientNameUsingJPQL();
//        long t4 = System.currentTimeMillis();
//        System.out.println(t4 - t3);
//
//
//    }
//}
