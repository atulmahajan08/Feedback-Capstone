package com.cts.feedback.apiconfiguration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.cts.feedback.entity.User;
import com.cts.feedback.repository.UserRepository;


@Service
public class AppUserDetailsService implements UserDetailsService {
	
	public static final Logger LOGGER = LoggerFactory.getLogger(AppUserDetailsService.class);
	
	@Autowired  //creating objects of repository
	private UserRepository userRepository;
	

	public AppUserDetailsService(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		 LOGGER.info("Start");
		 
		 LOGGER.info(" "+userRepository.findByEmpId(username));
	        User user = userRepository.findByEmpId(username).block();
	        
	        if (user == null) {
	            throw new UsernameNotFoundException(username);
	        }
	        	        
	        AppUser ap = new AppUser(user);
	        LOGGER.info("user name is "+ap.getUsername());
	        LOGGER.info("End");
	        return ap;
}
}
