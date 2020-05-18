package com.mkaw.memelogy.post;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PostService {

    private final PostRepository postRepository;
    private final PostMapper postMapper;

    public PostService(PostRepository postRepository, PostMapper postMapper) {
        this.postRepository = postRepository;
        this.postMapper = postMapper;
    }

    @Transactional(readOnly = true)
    public PostDto findById(long id) {
        Post post = postRepository.getOne(id);
        return postMapper.postToPostDto(post);
    }
}
