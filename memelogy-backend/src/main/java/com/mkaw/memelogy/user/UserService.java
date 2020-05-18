package com.mkaw.memelogy.user;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserService(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Transactional(readOnly = true)
    public UserDto findUserById(Long id) {
        User one = userRepository.getOne(id);
        return userMapper.userToUserDto(one);
    }

    public UserDto save(UserDto userDto) {
        User save = userRepository.save(userMapper.userDtoToUser(userDto));
        return userMapper.userToUserDto(save);
    }
}
