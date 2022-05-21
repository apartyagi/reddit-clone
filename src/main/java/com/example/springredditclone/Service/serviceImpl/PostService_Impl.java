package com.example.springredditclone.Service.serviceImpl;

import com.example.springredditclone.Model.Post;
import com.example.springredditclone.Model.User;
import com.example.springredditclone.Repo.PostRepo;
import com.example.springredditclone.Repo.UserRepo;
import com.example.springredditclone.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

@Service
public class PostService_Impl implements PostService {

    @Autowired
    private PostRepo postRepo;

    @Autowired
    private UserRepo userRepo;

    @Override
    public Post ADD_POST(Post post) {
        post.setDate(Instant.now());
        return postRepo.save(post);
    }

    @Override
    public List<Post> GET_ALL_POST_WITH_USERID(User userid) {
        return postRepo.findByUsername(userid);

    }

    @Override
    public List<Post> GET_ALL_POSTS() {
        return postRepo.findAll();
    }

    @Override
    public List<Post> GET_BY_CATEGORY(String name) {
        List<Post> byTag = postRepo.findByTag(name);
        return byTag;
    }

    @Override
    public List<Post> GET_TOP_POST() {

        return null;
    }

    @Override
    public List<Post> GET_NEW_POST() {
        List<Post> allByOrderByDateAsc;
        allByOrderByDateAsc = postRepo.findAllByOrderByDateDesc();
        return allByOrderByDateAsc;
    }

    @Override
    public List<Post> GET_ALL_POST_WITH_USERNAME(String user) {
        try{
            User byUsername = userRepo.findByUsername(user);
            System.out.println(byUsername);
            return postRepo.findByUsername(byUsername);
        }
        catch (Exception excepti){
            throw new UsernameNotFoundException("no details");
        }

    }

    @Override
    public Post GET_A_SINGLE_POST(int id) {
        Optional<Post> byId = postRepo.findById(id);
        return byId.get();

    }

}