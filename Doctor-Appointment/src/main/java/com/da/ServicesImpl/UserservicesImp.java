package com.da.ServicesImpl;


import com.da.Model.User;
import com.da.Repository.UserRepository;
import com.da.Services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

@Component
public class UserservicesImp implements UserServices {

    @Autowired
    private UserRepository userRepo;
    @Override
    public User createUser(User user) {
        User local = userRepo.findByUsername(user.getUsername());
        if (Objects.nonNull(local)) {
            System.out.println("User is already registered");
        } else {
            return this.userRepo.save(user);
        }
        return null;
    }
    @Override
    public User updateUser(User user) {

        return this.userRepo.save(user);
    }
    @Override
    public User getUser(int id) {

        return this.userRepo.findById(id);
    }
    @Override
    public void deleteUser(int id) {

        this.userRepo.deleteById(id);
    }

    @Override
    public Set<User> getAllUser() {

        return new LinkedHashSet<>(this.userRepo.findAll());
    }




}
