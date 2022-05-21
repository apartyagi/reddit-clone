package com.example.springredditclone.Controller;

import com.example.springredditclone.Model.Post;
import com.example.springredditclone.Model.User;
import com.example.springredditclone.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class PostContra {

    @Autowired
    private PostService postService;

    @PostMapping("/add-post")
    public ResponseEntity<?> add_post(@RequestBody Post post){
        Post post1 = postService.ADD_POST(post);
        return ResponseEntity.ok(post1);
    }


    @GetMapping("/get-all/{id}")
    public ResponseEntity<?> get_posts(@PathVariable("id") int id){
        User user=new User();
        user.setId(id);
        List<Post> posts = postService.GET_ALL_POST_WITH_USERID(user);
        return ResponseEntity.ok(posts);
    }
    @GetMapping("/get-alls/{name}")
    public ResponseEntity<?> get_posts_by_username(@PathVariable("name") String name){
        List<Post> posts = postService.GET_ALL_POST_WITH_USERNAME(name);
        return ResponseEntity.ok(posts);
    }


    @GetMapping("/all")
    public ResponseEntity<?> getAll(){
        List<Post> posts = postService.GET_ALL_POSTS();
        return ResponseEntity.ok(posts);
    }

    @GetMapping("/cat/{name}")
    public ResponseEntity<?> get_post_by_category(@PathVariable("name") String name){
        List<Post> posts = postService.GET_BY_CATEGORY(name);
        return  ResponseEntity.ok(posts);
    }

    @GetMapping("/new")
    public ResponseEntity<?> get_new_reddit(){
        List<Post> posts = postService.GET_NEW_POST();
        return  ResponseEntity.ok(posts);
    }
    @GetMapping("/top")
    public ResponseEntity<?> get_top_reddit(){
        List<Post> posts = postService.GET_TOP_POST();
        return  ResponseEntity.ok(posts);
    }

    @GetMapping("/get-post/{id}")
    public ResponseEntity<?> get_single_post(@PathVariable("id") int id)
    {
        Post posts = postService.GET_A_SINGLE_POST(id);
        return  ResponseEntity.ok(posts);
    }



}
