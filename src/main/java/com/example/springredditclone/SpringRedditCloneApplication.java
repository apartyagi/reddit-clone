package com.example.springredditclone;

import com.example.springredditclone.Model.User;
import com.example.springredditclone.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.time.Instant;

@SpringBootApplication
public class SpringRedditCloneApplication implements CommandLineRunner {
//    @Autowired
//    UserRepo userRepo;
//
//    @Autowired
//    BCryptPasswordEncoder passwordEncoder;

    public static void main(String[] args) {
        SpringApplication.run(SpringRedditCloneApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        User user=new User();
//        user.setUsername("tester");
//        user.setCreated(Instant.now());
//        user.setPassword(passwordEncoder.encode("123456"));
//        user.setEnabled(true);
//        user.setEmail("abc@gmaiol.com");
//
//        User user2=new User();
//        user2.setUsername("testerbbc");
//        user2.setCreated(Instant.now());
//        user2.setPassword(passwordEncoder.encode("123456"));
//        user2.setEnabled(true);
//        user2.setEmail("bbc@gmaiol.com");
//
//        userRepo.save(user);
//        userRepo.save((user2));
    }
}
