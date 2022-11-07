package com.da.ServicesImpl;

import com.da.Model.Doctor;
import com.da.Model.User;
import com.da.Repository.DoctorRepo;
import com.da.Services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.LinkedHashSet;
import java.util.Set;

public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorRepo doctorRepo;

    @Override
    public Doctor createDoctor(Doctor user) {
        return this.doctorRepo.save(user);
    }

    @Override
    public Doctor updateDoctor(Doctor user) {
        return this.doctorRepo.save(user);
    }

    @Override
    public Doctor getDoctor(int id) {
        return this.doctorRepo.findById(id);
    }

    @Override
    public void deleteDoctor(int id) {
       this.doctorRepo.deleteById(id);
    }

    @Override
    public Set<Doctor> getAllDoctor() {
        return new LinkedHashSet<>(this.doctorRepo.findAll());
    }
}
