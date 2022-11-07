package com.da.Services;

import com.da.Model.User;

import java.util.Set;

public interface UserServices {
  
	public User createUser(User user);
	
	public User updateUser(User user);
	
	public User getUser(int id);
	
	public void deleteUser(int id);
	
	public Set<User> getAllUser();

}
