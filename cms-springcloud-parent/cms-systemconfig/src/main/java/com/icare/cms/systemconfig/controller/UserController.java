package com.icare.cms.systemconfig.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.icare.cms.systemconfig.dao.UserDao;
import com.icare.cms.systemconfig.entity.TUser;

@RestController
public class UserController {

	@Autowired
	private UserDao userRepository;

	@GetMapping("/simple/{id}")
	public TUser findById(@PathVariable Long id) {
		return this.userRepository.findOne(id);
	}

}
