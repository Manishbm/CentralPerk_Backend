package com.cafe.centralPerk;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;



@RestController
public class SignIn {
//@GetMapping("/login")
//public String login() {
//    return "login";
//}
@GetMapping("/")
public String home() {
    return "Welcome to the home page!";
}

//@GetMapping("/public")
//public String publicPage() {
//    return "This is a public page.";
//}
//
//@GetMapping("/user")
//@PreAuthorize("hasRole('USER')")
//public String userPage() {
//    return "This is a user page.";
//}
//
//@GetMapping("/admin")
//@PreAuthorize("hasRole('ADMIN')")
//public String adminPage() {
//    return "This is an admin page.";
//}
}
