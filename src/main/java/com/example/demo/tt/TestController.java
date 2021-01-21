package com.example.demo.tt;

import java.util.Objects;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("test")
@RequiredArgsConstructor
public class TestController {

    private final UserMapper userMapper;

    @GetMapping
    public User get(Long id) {
        Objects.requireNonNull(id);
        return userMapper.getOne(id);
    }
}
