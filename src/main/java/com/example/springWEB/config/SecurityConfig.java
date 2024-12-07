//package com.example.springWEB.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
//import org.springframework.security.web.firewall.HttpFirewall;
//import org.springframework.security.web.firewall.StrictHttpFirewall;
//
//import jakarta.servlet.DispatcherType;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//
//        @Bean
//        public HttpFirewall httpFirewall() {
//                StrictHttpFirewall firewall = new StrictHttpFirewall();
//                firewall.setAllowSemicolon(true); // Cho phép ký tự ;
//                firewall.setAllowUrlEncodedDoubleSlash(true); // Cho phép //
//                return firewall;
//        }
//
//        @Bean
//        SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//                http
//                                .authorizeHttpRequests(authorize -> authorize
//                                                .dispatcherTypeMatchers(DispatcherType.FORWARD,
//                                                                DispatcherType.INCLUDE)
//                                                .permitAll()
//
//                                                .requestMatchers("/", "/student/login",
//                                                                "/css/**", "/images/**")
//                                                .permitAll()
//
//                                                .requestMatchers("/student/home").hasRole("SV")
//                                                .anyRequest().authenticated())
//
//                                .formLogin(formLogin -> formLogin
//                                                .loginPage("/student/login")
//                                                .failureUrl("/login?error")
//                                                .permitAll())
//
////                                .exceptionHandling(ex -> ex.accessDeniedPage("/access-deny")) // page not allowed
//                                .rememberMe(reM -> reM.key("uniqueAndSecret").tokenValiditySeconds(86400))
//                                .logout(logout -> logout.deleteCookies("JSESSIONID"));
//
//                return http.build();
//        }
//
//
//}
