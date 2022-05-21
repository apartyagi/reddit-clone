package com.example.springredditclone.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String username;
    private String password;
    private String email;
    private Instant created;
    private boolean enabled;
    private String mobile;
    @Lob
    private String background;
    @Lob
    private  String profile;
    @Lob
    private String banner;
    @OneToMany(mappedBy = "username",cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Post>post=new ArrayList<>();

    public User() {
    }

    public User(int id, String username, String password, String email, Instant created, boolean enabled, String mobile, String background, String profile, String banner, List<Post> post) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.created = created;
        this.enabled = enabled;
        this.mobile = mobile;
        this.background = background;
        this.profile = profile;
        this.banner = banner;
        this.post = post;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Instant getCreated() {
        return created;
    }

    public void setCreated(Instant created) {
        this.created = created;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public List<Post> getPost() {
        return post;
    }

    public void setPost(List<Post> post) {
        this.post = post;
    }
}
