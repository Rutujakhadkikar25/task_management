package com.tech.service;

import java.util.List;
import java.util.Optional;

import com.tech.model.User;

public interface UserService {
	User saveUser(User user);
	Optional<User> getUserById(Long id);
	List <User> getAllUsers();
	void deleteUser(Long id);
	
}
