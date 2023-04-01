package com.hha.services.impl;

import com.hha.entities.User;
import com.hha.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{
	@Autowired
	private UserRepository userRepo;
	@Override
	@Transactional
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepo.findByUserName(username).orElseThrow(()->new UsernameNotFoundException("User name:"+username+" NOT FOUND"));
		return UserDetailsImpl.build(user);
	}

}
