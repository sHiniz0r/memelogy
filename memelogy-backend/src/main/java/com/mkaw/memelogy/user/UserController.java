package com.mkaw.memelogy.user;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private final UserRepository userRepository;
    private final UserService userService;

    public UserController(UserRepository userRepository, UserService userService) {
        this.userRepository = userRepository;
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/users/{id}")
    public UserDto getUserById(@PathVariable Long id) {
//        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("Coś się zjebało"));
        return userService.findUserById(id);
    }

    @PostMapping("users/new")
    public UserDto createUser(@RequestBody UserDto newUser) {
        return userService.save(newUser);
    }
}
