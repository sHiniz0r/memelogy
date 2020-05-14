package com.mkaw.memelogy.tag;

import com.mkaw.memelogy.post.Post;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToMany(mappedBy = "tags")
    private Set<Post> posts = new HashSet<>();

    private String description;


    protected Tag() {
    }

    public Tag(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public Set<Post> getPosts() {
        return posts;
    }

    public String getDescription() {
        return description;
    }
}
