package com.mkaw.memelogy.post;

import com.mkaw.memelogy.comment.CommentMapper;
import com.mkaw.memelogy.meme.MemeMapper;
import com.mkaw.memelogy.tag.TagMapper;
import com.mkaw.memelogy.user.UserMapper;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(uses = {UserMapper.class, MemeMapper.class, TagMapper.class, CommentMapper.class},
        componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface PostMapper {

    PostDto postToPostDto(Post post);
}
