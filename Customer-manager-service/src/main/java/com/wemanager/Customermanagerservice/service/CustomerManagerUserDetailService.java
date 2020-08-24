package com.wemanager.Customermanagerservice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.wemanager.Customermanagerservice.model.CustomerManagerUserDetails;
import com.wemanager.Customermanagerservice.model.User;
import com.wemanager.Customermanagerservice.repository.UserRepository;


@Service
public class CustomerManagerUserDetailService implements UserDetailsService{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		Optional<User> user = userRepository.findByUserName(userName);
		
		user.orElseThrow(() -> new UsernameNotFoundException("Not found: " + userName));		
		
		return user.map(CustomerManagerUserDetails::new).get();		
	}	

}
