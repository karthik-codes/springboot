package Excercise.Login.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;


@Configuration

public class Configure{


	
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
     .authorizeHttpRequests((authz) -> authz
             .requestMatchers("/auth/fetch").hasRole("ADMIN")
             .requestMatchers("/auth/**").hasRole("USER")
             .anyRequest().authenticated()
     )
     .httpBasic(Customizer.withDefaults());
return http.build();
	
	
}
}