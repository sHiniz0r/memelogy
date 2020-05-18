package com.mkaw.memelogy.user;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(builder = ImmutableUserDto.Builder.class)
public interface UserDto {
    String username();
    String email();
    byte[] avatar();
}