package com.mkaw.memelogy.comment;

import com.mkaw.memelogy.post.Post;
import com.mkaw.memelogy.user.User;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private User author;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id")
    private Post post;

    private String content;

    private LocalDateTime datePosted;

    protected Comment() {
    }

    public Comment(User author, Post post, String content) {
        this.author = author;
        this.post = post;
        this.content = content;
        this.datePosted = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public User getAuthor() {
        return author;
    }

    public Post getPost() {
        return post;
    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getDatePosted() {
        return datePosted;
    }
}
