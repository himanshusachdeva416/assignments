package ess.boot.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SeurityConfig {
	
	@Bean
	public UserDetailsService userDetails() {
		
		var userDetailsService = new InMemoryUserDetailsManager();
		
		var user=User.withUsername("himanshu").password("sachdeva").authorities("doSomething").build();
		
		userDetailsService.createUser(user);
		
		return userDetailsService;
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
	

}
