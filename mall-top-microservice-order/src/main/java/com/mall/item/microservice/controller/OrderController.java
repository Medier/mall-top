package com.mall.item.microservice.controller;

import com.mall.item.microservice.model.Order;
import com.mall.item.microservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * OrderController
 *
 * @author : Administrator
 * @since : 2018-01-13
 */
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/order/{orderId}")
    public Order queryOrderById(@PathVariable("orderId") String orderId){
       return orderService.queryOrderById(orderId);
    }
}
