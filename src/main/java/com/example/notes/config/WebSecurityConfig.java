//package com.example.notes.config;
//
//import com.example.notes.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//
///**
// * @author Ivan 16.01.2023
// */
//@Configuration
//@EnableWebSecurity
//public class WebSecurityConfig{
//    @Autowired
//    UserService userService;
//
//    @Bean
//    public BCryptPasswordEncoder bCryptPasswordEncoder(){
//        return new BCryptPasswordEncoder();
//    }
//
//    @Bean
//    public void filterChain(HttpSecurity httpSecurity) throws Exception{
//        httpSecurity.csrf().disable()
//                //доступ только для незарегистрированных пользователей
//                .authorizeHttpRequests().requestMatchers("/registration").fullyAuthenticated()
//                //только для админа
//                .requestMatchers("/admin/**").hasRole("ADMIN")
//                //только для зарегистрированных пользователей
//                .requestMatchers("/index").hasRole("USER")
//                .requestMatchers("/", "/resources/**").permitAll()
//                .anyRequest().authenticated()
//                .and()
//                .formLogin()
//                .loginPage("/login")
//                .defaultSuccessUrl("/main")
//                .permitAll()
//                .and()
//                .logout()
//                .permitAll()
//                .logoutSuccessUrl("/main");
//    }
//
//    @Autowired
//    protected void configureGlobal(AuthenticationManagerBuilder managerBuilder) throws Exception{
//        managerBuilder.userDetailsService(userService).passwordEncoder(bCryptPasswordEncoder());
//    }
//}
