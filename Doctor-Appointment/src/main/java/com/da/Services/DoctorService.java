package com.da.Services;

import com.da.Model.Doctor;

import java.util.Set;

public interface DoctorService{

    public Doctor createDoctor(Doctor user);

    public Doctor updateDoctor(Doctor user);

    public Doctor getDoctor(int id);

    public void deleteDoctor(int id);

    public Set<Doctor> getAllDoctor();

}
