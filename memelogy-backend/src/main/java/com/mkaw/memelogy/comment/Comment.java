package com.mkaw.memelogy.comment;

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

    @Column(name = "post_id")
    private Long postId;

    private String content;

    private LocalDateTime datePosted;

    protected Comment() {
    }

    public Comment(User author, Long postId, String content) {
        this.author = author;
        this.postId = postId;
        this.content = content;
        this.datePosted = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public User getAuthor() {
        return author;
    }

    public Long getPostId() {
        return postId;
    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getDatePosted() {
        return datePosted;
    }
}
