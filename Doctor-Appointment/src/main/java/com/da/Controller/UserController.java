package com.da.Controller;

import com.da.Model.User;
import com.da.Repository.UserRepository;
import com.da.ServicesImpl.UserservicesImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Autowired
	private UserservicesImp userService;
	@Autowired
	private UserRepository userRepo;

	@PostMapping("/")
	public User createUser(@RequestBody User user) {
		user.setPassword(this.bCryptPasswordEncoder.encode(user.getPassword()));
		return this.userService.createUser(user);
	}

	@PutMapping("/update")
	public User updateUser(@RequestBody User user) {
		user.setPassword(this.bCryptPasswordEncoder.encode(user.getPassword()));
		return this.userRepo.save(user);
	}

	@GetMapping("/{id}")
	public User getUser(@PathVariable("id") int id) {
		return this.userService.getUser(id);
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") int id) {
		this.userService.deleteUser(id);

	}

	/// Getting all User
	@GetMapping("/getAllUser")
	public Set<User> getAllUser() {
		return this.userService.getAllUser();
	}
}
