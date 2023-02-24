package com.example.backendstatelessjwtauthentication.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserApi {

    @PostMapping("/auth/login")
    public String get(@RequestBody AuthRequest authRequest){
        return "";
    }
}
