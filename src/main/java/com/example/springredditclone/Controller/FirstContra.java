package com.example.springredditclone.Controller;

import com.example.springredditclone.Model.User;
import com.example.springredditclone.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class FirstContra {

    @Autowired
    private UserService userService;

    @GetMapping("/pop")
    public ResponseEntity<?> get_checker(){
        return ResponseEntity.ok("Hello i am working....");
    }

    @PostMapping("/add-user")
    public User adduser(@RequestBody User user){
        return userService.createUser(user);

    }
    @GetMapping("/get/{name}")
    public ResponseEntity<?> getUser(@PathVariable("name") String name){
        return ResponseEntity.ok(userService.Load_user(name));
    }


}
