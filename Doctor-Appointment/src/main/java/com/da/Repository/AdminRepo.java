package com.da.Repository;

import com.da.Model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepo extends JpaRepository<Admin, Integer> {
    public Admin findById(int id);
    public Admin findByUsername(String username);
}
