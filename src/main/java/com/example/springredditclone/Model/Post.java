package com.example.springredditclone.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Lob
    private String name;
    @Lob
    private String description;
    private Integer voteCount;
    private Instant date;
    private String tag;
    @Lob
    private String image;
    @ManyToOne()
    private User username;
    @OneToMany(mappedBy = "post")
    @JsonIgnore
    private List<Comment> comment=new ArrayList<>();

    public Post(int id, String name, String description, Integer voteCount, Instant date, String tag, String image, User username, List<Comment> comment) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.voteCount = voteCount;
        this.date = date;
        this.tag = tag;
        this.image = image;
        this.username = username;
        this.comment = comment;
    }

    public Post() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(Integer voteCount) {
        this.voteCount = voteCount;
    }

    public Instant getDate() {
        return date;
    }

    public void setDate(Instant date) {
        this.date = date;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public User getUsername() {
        return username;
    }

    public void setUsername(User username) {
        this.username = username;
    }

    public List<Comment> getComment() {
        return comment;
    }

    public void setComment(List<Comment> comment) {
        this.comment = comment;
    }
}
