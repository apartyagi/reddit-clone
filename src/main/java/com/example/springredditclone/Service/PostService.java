package com.example.springredditclone.Service;

import com.example.springredditclone.Model.Post;
import com.example.springredditclone.Model.User;

import java.util.List;

public interface PostService {
    public Post ADD_POST(Post post);
    public List<Post> GET_ALL_POST_WITH_USERID(User userid);
    public List<Post> GET_ALL_POSTS();
    public List<Post> GET_BY_CATEGORY(String name);
    public List<Post> GET_TOP_POST();
    public List<Post> GET_NEW_POST(); //return desc order post
    public List<Post> GET_ALL_POST_WITH_USERNAME(String user);
    public Post GET_A_SINGLE_POST(int id);



}
