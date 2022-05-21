package com.example.springredditclone.Service.serviceImpl;

import com.example.springredditclone.Model.User;
import com.example.springredditclone.Repo.UserRepo;
import com.example.springredditclone.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
public class UserService_Impl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public User createUser(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setEnabled(false);
        user.setCreated(Instant.now());
        return userRepo.save(user);
    }

    @Override
    public User Load_user(String name) {
        return userRepo.findByUsername(name);
    }
}
