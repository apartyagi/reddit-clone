package com.example.springredditclone.Controller;

import com.example.springredditclone.Model.Comment;
import com.example.springredditclone.Model.Post;
import com.example.springredditclone.Service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class CommentContra {

    @Autowired
    private CommentService commentService;

    @PostMapping("/add-comment")
    public ResponseEntity<?> add_comment(@RequestBody Comment comment){
        Comment comment1 = commentService.ADD_COMMENT(comment);
        return ResponseEntity.ok(comment1);
    }
    @GetMapping("/comm/{id}")
    public ResponseEntity<?> get_all_comment_by_post(@PathVariable("id") int id){
        Post post=new Post();
        post.setId(id);
        List<Comment> comments = commentService.FETCH_COMMENTS_OF_GIVEn_POST(post);
        return ResponseEntity.ok(comments);
    }
}
