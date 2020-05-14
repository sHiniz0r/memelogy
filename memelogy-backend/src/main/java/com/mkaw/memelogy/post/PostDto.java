package com.mkaw.memelogy.post;

import com.mkaw.memelogy.comment.CommentDto;
import com.mkaw.memelogy.meme.MemeDto;
import com.mkaw.memelogy.tag.TagDto;
import com.mkaw.memelogy.user.UserDto;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class PostDto {

    private Long id;

    private UserDto author;

    private MemeDto image;

    private Set<CommentDto> comments = new HashSet<>();

    private Set<TagDto> tags = new HashSet<>();

    private LocalDateTime datePosted;

    private Long upvotes;

    private Long downvotes;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserDto getAuthor() {
        return author;
    }

    public void setAuthor(UserDto author) {
        this.author = author;
    }

    public MemeDto getImage() {
        return image;
    }

    public void setImage(MemeDto image) {
        this.image = image;
    }

    public Set<CommentDto> getComments() {
        return comments;
    }

    public void setComments(Set<CommentDto> comments) {
        this.comments = comments;
    }

    public Set<TagDto> getTags() {
        return tags;
    }

    public void setTags(Set<TagDto> tags) {
        this.tags = tags;
    }

    public LocalDateTime getDatePosted() {
        return datePosted;
    }

    public void setDatePosted(LocalDateTime datePosted) {
        this.datePosted = datePosted;
    }

    public Long getUpvotes() {
        return upvotes;
    }

    public void setUpvotes(Long upvotes) {
        this.upvotes = upvotes;
    }

    public Long getDownvotes() {
        return downvotes;
    }

    public void setDownvotes(Long downvotes) {
        this.downvotes = downvotes;
    }
}
