//package com.example.springWEB.service;
//
//import java.util.Collections;
//
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import com.example.springWEB.domain.Users;
//
//@Service
//public class CustomUserDetailsService implements UserDetailsService {
//
//    private UserService userService;
//
//    public CustomUserDetailsService(UserService userService) {
//        this.userService = userService;
//    }
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        Users users = this.userService.findUserByMa((username));
//
//        if (users == null) {
//            throw new UsernameNotFoundException("this user is not exist");
//        }
//
//        return new User(
//                users.getMa() ,
//                "{noop}"+users.getPassword(),
//                Collections.singletonList(new SimpleGrantedAuthority("ROLE_" + users.getRoles().getName())));
//    }
//
//}