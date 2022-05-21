package com.example.springredditclone.Service;

import com.example.springredditclone.Model.User;

public interface UserService {

    public User createUser(User user);
    public User Load_user(String name);
}
