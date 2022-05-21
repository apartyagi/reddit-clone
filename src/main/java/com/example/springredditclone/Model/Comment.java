package com.example.springredditclone.Model;

import javax.persistence.*;
import java.time.Instant;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String content;
    private Instant instant;
    @ManyToOne
    private Post post;
    @ManyToOne
    private  User user;

    public Comment(int id, String content, Instant instant, Post post, User user) {
        this.id = id;
        this.content = content;
        this.instant = instant;
        this.post = post;
        this.user = user;
    }

    public Comment() {
    }

    public Instant getInstant() {
        return instant;
    }

    public void setInstant(Instant instant) {
        this.instant = instant;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
