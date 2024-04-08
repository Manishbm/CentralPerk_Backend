//package com.centralperk.security;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@Configuration
//public class UserDetailsConfig {
//
//    @Autowired
//    private PasswordEncoder passwordEncoder;
//    
//    public UserDetailsConfig (PasswordEncoder passwordEncoder) {
//    	this.passwordEncoder=passwordEncoder;
//    }
//
//    @Bean(name = "customUserDetailsService")
//    public UserDetailsService userDetailsService() {
//        return new UserDetailsServiceImpl(passwordEncoder);
//    }
//
//    private static class UserDetailsServiceImpl implements UserDetailsService {
//
//        private final PasswordEncoder passwordEncoder;
//
//        public UserDetailsServiceImpl(PasswordEncoder passwordEncoder) {
//            this.passwordEncoder = passwordEncoder;
//        }
//
//        @Override
//        public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//            // Retrieve user details from a database or other source
//            // For simplicity, hard-coding user details here
//            if ("user".equals(username)) {
//                return org.springframework.security.core.userdetails.User
//                        .withUsername("user")
//                        .password(passwordEncoder.encode("password"))
//                        .roles("USER")
//                        .build();
//            } else if ("admin".equals(username)) {
//                return org.springframework.security.core.userdetails.User
//                        .withUsername("admin")
//                        .password(passwordEncoder.encode("admin"))
//                        .roles("ADMIN")
//                        .build();
//            } else {
//                throw new UsernameNotFoundException("User not found with username: " + username);
//            }
//        }
//    }
//}
