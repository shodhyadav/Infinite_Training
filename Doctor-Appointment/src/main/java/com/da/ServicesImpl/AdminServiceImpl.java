package com.da.ServicesImpl;

import com.da.Model.Admin;
import com.da.Repository.AdminRepo;
import com.da.Services.AdminServices;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.LinkedHashSet;
import java.util.Set;

public class AdminServiceImpl implements AdminServices {

    @Autowired
    private AdminRepo adminRepo;


    @Override
    public Admin createAdmin(Admin admin) {
        return this.adminRepo.save(admin);
    }

    @Override
    public Admin updateAdmin(Admin admin) {
        return this.adminRepo.save(admin);
    }

    @Override
    public Admin getAdmin(int id) {
        return this.adminRepo.findById(id);
    }

    @Override
    public void deleteAdmin(int id) {
      this.adminRepo.deleteById(id);
    }

    @Override
    public Set<Admin> getAllAdmin() {
        return new LinkedHashSet<>(this.adminRepo.findAll());
    }
}
