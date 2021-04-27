package com.pruebas.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebas.entity.User;
import com.pruebas.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository repository;
	 
	@Override
	public Iterable<User> getAllUsers() {
		return repository.findAll();
	}

}
