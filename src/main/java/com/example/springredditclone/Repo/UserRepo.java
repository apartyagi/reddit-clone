package com.example.springredditclone.Repo;

import com.example.springredditclone.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> {
    public User findByUsername(String name);
}
