//package com.boot.react.services;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import com.boot.react.entity.MyUserDetail;
//import com.boot.react.entity.User;
//import com.boot.react.repository.UserRepository;
//@Service
//public class UserDetailsServiceImp implements UserDetailsService {
//
//	@Autowired
//	private UserRepository userRepository;
//	
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		User user = userRepository.getUserByUserName(username);
//		if (user == null) {
//			throw new UsernameNotFoundException("could not find user");
//		}
//		return new MyUserDetail(user);
//	}
//
//}
