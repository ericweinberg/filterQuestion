package com.test.springsecurity.filterquestion.user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on 8/7/17.
 */
@RequestMapping("api/user")
@RestController
public class UserResource {

    @RequestMapping(method = RequestMethod.POST)
    public void createUser(User user) {

        System.out.println("creating new user");

    }
}
