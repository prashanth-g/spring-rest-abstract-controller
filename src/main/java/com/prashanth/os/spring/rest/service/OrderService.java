package com.prashanth.os.spring.rest.service;

import com.prashanth.os.spring.rest.model.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@Slf4j
public class OrderService {
    public Order create(String orderName) {
        log.info("Order created!");
        return new Order(orderName);
    }

    public Order get(String orderId) {
        log.info("Getting orders.");
        return new Order("random-order-" + orderId + "-" + new Random().nextInt());
    }
}