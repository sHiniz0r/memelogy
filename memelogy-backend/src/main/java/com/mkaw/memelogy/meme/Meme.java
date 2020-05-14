package com.mkaw.memelogy.meme;

import com.mkaw.memelogy.post.Post;

import javax.persistence.*;

@Entity
public class Meme {

    @Id
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    private Post post;

    private byte[] image;

    //Some meta-data

    protected Meme() {
    }

    public Meme(Post post, byte[] image) {
        this.post = post;
        this.image = image;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
