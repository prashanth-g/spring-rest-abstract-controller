package com.prashanth.os.spring.rest.controller;

import com.prashanth.os.spring.rest.model.Order;
import com.prashanth.os.spring.rest.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController extends AbstractRestController {

    @Autowired
    OrderService orderService;

    @GetMapping("/add/{name}")
    public Order createOrder(@PathVariable String name) {
        return create(name,
                nameStr -> nameStr.toUpperCase(),
                orderService::create);
    }

    @GetMapping("/{name}")
    public Object getOrders(@PathVariable String name) {
        return get(name,
                nameStr -> nameStr.toLowerCase(),
                orderService::get);
    }
}
