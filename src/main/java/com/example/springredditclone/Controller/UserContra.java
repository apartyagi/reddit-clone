package com.example.springredditclone.Controller;

import com.example.springredditclone.Model.User;
import com.example.springredditclone.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@CrossOrigin("*")
public class UserContra {

    @Autowired
    private UserRepo userDetailService;

    @GetMapping("/current-user")
    public ResponseEntity<?> get_current_user(Principal principal){
        String name = principal.getName();
        User byUsername = userDetailService.findByUsername(name);
        if(byUsername==null){
            throw new UsernameNotFoundException("no current user found");
        }
        return ResponseEntity.ok(byUsername);
    }
}
