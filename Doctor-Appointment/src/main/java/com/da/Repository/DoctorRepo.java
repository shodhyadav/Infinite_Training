package com.da.Repository;

import com.da.Model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepo extends JpaRepository<Doctor, Integer> {
    public Doctor findById(int id);
    public Doctor findByUsername(String username);
}
