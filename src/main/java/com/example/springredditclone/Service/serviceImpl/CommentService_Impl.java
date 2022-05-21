package com.example.springredditclone.Service.serviceImpl;

import com.example.springredditclone.Model.Comment;
import com.example.springredditclone.Model.Post;
import com.example.springredditclone.Repo.CommentRepo;
import com.example.springredditclone.Service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
public class CommentService_Impl implements CommentService {

    @Autowired
    private CommentRepo commentRepo;

    @Override
    public Comment ADD_COMMENT(Comment comment) {
        comment.setInstant(Instant.now());
        return commentRepo.save(comment);
    }

    @Override
    public List<Comment> FETCH_COMMENTS_OF_GIVEn_POST(Post post) {
        return commentRepo.findByPost(post);

    }
}
