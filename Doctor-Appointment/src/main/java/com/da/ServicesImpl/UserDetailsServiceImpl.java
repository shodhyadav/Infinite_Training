package com.da.ServicesImpl;

import com.da.Model.Admin;
import com.da.Model.Doctor;
import com.da.Model.User;
import com.da.Repository.AdminRepo;
import com.da.Repository.DoctorRepo;
import com.da.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepo;
    @Autowired
    private DoctorRepo doctorRepo;
    @Autowired
    private AdminRepo adminRepo;


    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = this.userRepo.findByUsername(username);
        Doctor doctor =this.doctorRepo.findByUsername(username);
        Admin admin=this.adminRepo.findByUsername(username);

        if (user == null && doctor==null && admin==null) {
            System.out.print("User Not Found");
            throw new UsernameNotFoundException("User is not Available");
        }else if(user==null && doctor!=null && admin==null) return doctor;
        else if(user==null && doctor==null && admin!=null) return admin;
        return user;

    }


}
