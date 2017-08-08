package com.test.springsecurity.filterquestion.orders;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 8/7/17.
 */
@RestController
@RequestMapping("/api/order")
public class OrderResource {

    @RequestMapping(method = RequestMethod.GET)
    public List<String> getOrders() {
        System.out.println("Getting orders");
        return new ArrayList<>();
    }
}
