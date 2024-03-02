package com.springsecurity.config;


import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class ProjectSecurityConfiguration {

	@Bean
	SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
		http.csrf(csrf-> csrf.disable())
      .authorizeHttpRequests(authorize -> authorize
          .requestMatchers("/my-balance","/my-loan","/my-acount","/my-cards").authenticated()
          .requestMatchers("/notice","/contact","/register").permitAll()
          .requestMatchers("/admin").denyAll()
      )
      .httpBasic(Customizer.withDefaults())
      .formLogin(Customizer.withDefaults());
		
//		For denying request
		
/*		http
      .authorizeHttpRequests(authorize -> authorize
          .requestMatchers("/admin").denyAll()
      )
      .httpBasic(Customizer.withDefaults())
      .formLogin(Customizer.withDefaults());
		*/
//		For Allowing All request
/*		http
	      .authorizeHttpRequests(authorize -> authorize
	     	.permitAll()
	      )
	      .httpBasic(Customizer.withDefaults())
	      .formLogin(Customizer.withDefaults());
			*/
    return http.build();
	}	
	
	@Bean
	public BCryptPasswordEncoder encoder() {
		return new BCryptPasswordEncoder();
	}
	
}
