package com.prashanth.os.spring.rest.controller;

import com.prashanth.os.spring.rest.model.User;
import com.prashanth.os.spring.rest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController extends AbstractRestController {

    @Autowired
    UserService userService;

    @GetMapping("/add/{name}")
    public User createUser(@PathVariable String name) {
        return create(name,
                nameStr -> nameStr.toUpperCase(),
                userService::create);
    }

    @GetMapping("/{name}")
    public User getUsers(@PathVariable String name) {
        return get(name,
                nameStr -> nameStr.toLowerCase(),
                userService::get);
    }
}
