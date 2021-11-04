package com.survivingcodingbootcamp.blog.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Hashtag {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    @ManyToMany
    private Collection<Post> posts;

    public Hashtag(String name) {
        this.name = name;
        this.posts = new ArrayList<>();

    }

    public Hashtag(){}

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Collection<Post> getPosts() {
        return posts;
    }
    public void setPost(Post post) {
        this.posts.add(post);
    }