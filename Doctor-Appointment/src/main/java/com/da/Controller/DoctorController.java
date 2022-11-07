package com.da.Controller;

import com.da.Model.Doctor;
import com.da.Repository.DoctorRepo;
import com.da.ServicesImpl.DoctorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/doctor")
@CrossOrigin("*")
public class DoctorController {

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private DoctorServiceImpl userService;
    @Autowired
    private DoctorRepo userRepo;

    @PostMapping("/")
    public Doctor createUser(@RequestBody Doctor user) {
        user.setPassword(this.bCryptPasswordEncoder.encode(user.getPassword()));
        return this.userService.createDoctor(user);
    }

    @PutMapping("/update")
    public Doctor updateUser(@RequestBody Doctor user) {
        user.setPassword(this.bCryptPasswordEncoder.encode(user.getPassword()));
        return this.userRepo.save(user);
    }

    @GetMapping("/{id}")
    public Doctor getUser(@PathVariable("id") int id) {
        return this.userService.getDoctor(id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") int id) {
        this.userService.deleteDoctor(id);

    }

    /// Getting all User
    @GetMapping("/getAllUser")
    public Set<Doctor> getAllUser() {
        return this.userService.getAllDoctor();
    }
}
