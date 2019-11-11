package com.prashanth.os.spring.rest.service;

import com.prashanth.os.spring.rest.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@Slf4j
public class UserService {
    public User create(String userName) {
        log.info("User created!");
        return new User(userName);
    }

    public User get(String userName) {
        log.info("Getting users.");
        return new User("random-user-" + userName + "-" + new Random().nextInt());
    }
}