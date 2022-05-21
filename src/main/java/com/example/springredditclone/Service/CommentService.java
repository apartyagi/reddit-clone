package com.example.springredditclone.Service;

import com.example.springredditclone.Model.Comment;
import com.example.springredditclone.Model.Post;

import java.util.List;

public interface CommentService {
    public Comment ADD_COMMENT(Comment comment);
    public List<Comment> FETCH_COMMENTS_OF_GIVEn_POST(Post post);
}
