package com.mkaw.memelogy.comment;

import org.springframework.stereotype.Service;

@Service
public class CommentService {

    private final CommentRepository commentRepository;
    private final CommentMapper commentMapper;

    public CommentService(CommentRepository commentRepository, CommentMapper commentMapper) {
        this.commentRepository = commentRepository;
        this.commentMapper = commentMapper;
    }

    public CommentDto findById(Long id) {
        Comment one = commentRepository.getOne(id);
        return commentMapper.commentToCommentDto(one);
    }
}
