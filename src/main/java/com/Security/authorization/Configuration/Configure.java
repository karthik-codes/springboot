package com.Security.authorization.Configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.SecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.SpringSecurityMessageSource;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.server.authentication.HttpBasicServerAuthenticationEntryPoint;

@Configuration
//@EnableWebSecurity
public class Configure {

//	// Authentication
//	@Bean
//	public UserDetailsService uService(PasswordEncoder encoder) {
//
//		UserDetails admin = User.withUsername("karthik").password(encoder.encode("pwd1")).roles("ADMIN", "USER")
//				.build();
//
//		UserDetails user = User.withUsername("keerthan").password(encoder.encode("pwd2")).roles("USER").build();
//
//		return new InMemoryUserDetailsManager(admin, user);
//	}
//
//	@Bean
//	public PasswordEncoder encryptPassword() {
//		return new BCryptPasswordEncoder();
//	}
//
////authorization
//	@Bean
//	public SecurityFilterChain securityFilter(HttpSecurity http) throws Exception {
//		return http.csrf().disable().authorizeHttpRequests().requestMatchers("/auth/fetch").permitAll().and()
//				.authorizeHttpRequests().requestMatchers("/auth/**").authenticated().and().formLogin()
//				.and().build();
//	}
	
	 @Bean
	    public PasswordEncoder encoder(){
	        return new BCryptPasswordEncoder();
	    }
	 
	@Bean
    public InMemoryUserDetailsManager userDetailsService() {
        UserDetails user1 = User.builder()
                .username("karthik")
                .password(encoder().encode("pwd1"))
                .roles("ADMIN", "USER")
                .build();
        UserDetails user2 = User.builder()
                .username("Keerthan")
                .password(encoder().encode("pwd2"))
                .roles("USER")
                .build();
        return new InMemoryUserDetailsManager(user1, user2);
    }
	@Bean
	public SecurityFilterChain securityFilter(HttpSecurity http) throws Exception {
		http
        .csrf().disable()
        .cors().and()
        .authorizeHttpRequests((authz) -> authz
                .requestMatchers("/auth/fetch").hasRole("ADMIN")
                .requestMatchers("/auth/**").hasRole("USER")
                .anyRequest().authenticated()
        )
        .httpBasic(Customizer.withDefaults());
return http.build();
	
}
}