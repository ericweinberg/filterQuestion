package com.test.springsecurity.filterquestion.user;

/**
 * Created on 8/7/17.
 */
public class User {

    private String name;

    protected User() {
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
