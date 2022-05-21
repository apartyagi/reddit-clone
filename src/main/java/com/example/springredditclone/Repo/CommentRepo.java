package com.example.springredditclone.Repo;

import com.example.springredditclone.Model.Comment;
import com.example.springredditclone.Model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepo extends JpaRepository<Comment,Integer> {
    public List<Comment> findByPost(Post post);

}
