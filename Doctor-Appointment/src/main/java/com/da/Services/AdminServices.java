package com.da.Services;

import com.da.Model.Admin;

import java.util.Set;

public interface AdminServices{

    public Admin createAdmin(Admin user);

    public Admin updateAdmin(Admin user);

    public Admin getAdmin(int id);

    public void deleteAdmin(int id);

    public Set<Admin> getAllAdmin();

}
