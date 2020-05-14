package com.mkaw.memelogy.comment;

import com.mkaw.memelogy.user.UserMapper;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(uses = {UserMapper.class}, componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface CommentMapper {

    CommentDto commentToCommentDto(Comment comment);
}
