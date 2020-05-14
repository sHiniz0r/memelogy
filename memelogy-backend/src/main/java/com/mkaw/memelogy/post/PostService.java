package com.mkaw.memelogy.post;

import org.springframework.stereotype.Service;

@Service
public class PostService {

    private final PostRepository postRepository;
    private final PostMapper postMapper;

    public PostService(PostRepository postRepository, PostMapper postMapper) {
        this.postRepository = postRepository;
        this.postMapper = postMapper;
    }

    public PostDto findById(Long id) {
        Post post = postRepository.getOne(id);
        return postMapper.postToPostDto(post);
    }
}
