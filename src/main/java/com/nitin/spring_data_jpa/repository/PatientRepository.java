package com.nitin.spring_data_jpa.repository;

import com.nitin.spring_data_jpa.entity.Patient;
import org.hibernate.annotations.processing.SQL;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface PatientRepository extends JpaRepository<Patient,Long> {
    Patient findByName(String name);

    @Query("select p from Patient p where p.birthDate > :birthDate")
    List<Patient> getPatientBeforeBirthDate(@Param("birthDate")LocalDate birthDate);

    List<Patient> getPatientByBirthDateBefore(LocalDate birthDate);

    List<Patient> getPatientByBirthDateAfter(LocalDate birthDate);

    long countByGender(String gender);

    List<Patient> findByNameContaining(String prefix);

    int countByNameContaining(String prefix);

    @Query("select p.name from Patient p")
    List<String> findAllPatientName();
}
