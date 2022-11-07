package com.da.Controller;
import com.da.Model.Admin;
import com.da.Repository.AdminRepo;
import com.da.ServicesImpl.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/admin")
@CrossOrigin("*")
public class AdminController {

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private AdminServiceImpl userService;
    @Autowired
    private AdminRepo userRepo;

    @PostMapping("/")
    public Admin createAdmin(@RequestBody Admin user) {
        user.setPassword(this.bCryptPasswordEncoder.encode(user.getPassword()));
        return this.userService.createAdmin(user);
    }

    @PutMapping("/update")
    public Admin updateAdmin(@RequestBody Admin user) {
        user.setPassword(this.bCryptPasswordEncoder.encode(user.getPassword()));
        return this.userRepo.save(user);
    }

    @GetMapping("/{id}")
    public Admin getAdmin(@PathVariable("id") int id) {
        return this.userService.getAdmin(id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") int id) {
        this.userService.deleteAdmin(id);

    }

    /// Getting all User
    @GetMapping("/getAllUser")
    public Set<Admin> getAllAdmin() {
        return this.userService.getAllAdmin();
    }
}
