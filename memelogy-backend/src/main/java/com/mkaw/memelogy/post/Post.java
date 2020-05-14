package com.mkaw.memelogy.post;

import com.mkaw.memelogy.comment.Comment;
import com.mkaw.memelogy.meme.Meme;
import com.mkaw.memelogy.tag.Tag;
import com.mkaw.memelogy.user.User;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private User author;

    @OneToOne(mappedBy = "post", cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false)
    private Meme image;

    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL)
    private Set<Comment> comments = new HashSet<>();

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "post_tag",
            joinColumns = @JoinColumn(name = "post_id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id"))
    private Set<Tag> tags = new HashSet<>();

    private LocalDateTime datePosted;

    private Long upvotes;

    private Long downvotes;

    protected Post() {
    }

    public Post(User author, Meme image, Long upvotes, Long downvotes) {
        this.author = author;
        this.image = image;
        this.datePosted = LocalDateTime.now();
        this.upvotes = upvotes;
        this.downvotes = downvotes;
    }

    public Long getId() {
        return id;
    }

    public User getAuthor() {
        return author;
    }

    public Meme getImage() {
        return image;
    }

    public Set<Comment> getComments() {
        return comments;
    }

    public Set<Tag> getTags() {
        return tags;
    }

    public LocalDateTime getDatePosted() {
        return datePosted;
    }

    public Long getUpvotes() {
        return upvotes;
    }

    public Long getDownvotes() {
        return downvotes;
    }
}
