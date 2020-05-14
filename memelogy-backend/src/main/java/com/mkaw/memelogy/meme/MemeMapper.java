package com.mkaw.memelogy.meme;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface MemeMapper {

    MemeDto memeToMemeDto(Meme meme);
}
