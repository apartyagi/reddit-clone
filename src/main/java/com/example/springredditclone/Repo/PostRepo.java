package com.example.springredditclone.Repo;

import com.example.springredditclone.Model.Post;
import com.example.springredditclone.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PostRepo extends JpaRepository<Post,Integer> {

    public List<Post> findByUsername(User user);
    public List<Post> findByTag(String tag);
    public List<Post> findAllByOrderByDateDesc();
}
