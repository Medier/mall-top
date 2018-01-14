package com.mall.item.microservice.service;

import com.mall.item.microservice.model.Item;
import com.mall.item.microservice.model.Order;
import com.mall.item.microservice.model.OrderDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * OrderService
 *
 * @author : Administrator
 * @since : 2018-01-13
 */
@Service
public class OrderService {

    @Autowired
    private ItemService itemService;

    private static final Map<String, Order> ORDER_MAP = new HashMap<>();

    static {
        Order order = new Order("8001", 1L,
                new Date(System.currentTimeMillis() - 1998L), new Date(System.currentTimeMillis()));
        List<OrderDetail> orderDetails = new ArrayList<>();

        Item item = new Item();

        item.setId(3L);
        orderDetails.add(new OrderDetail(order.getOrderId(), item));

        item = new Item();
        item.setId(5L);
        orderDetails.add(new OrderDetail(order.getOrderId(), item));

        order.setOrderDetails(orderDetails);

        ORDER_MAP.put(order.getOrderId(), order);
    }

    public Order queryOrderById(String id) {

        Order order = ORDER_MAP.get(id);
        if (null == order) {
            return null;
        }
        List<OrderDetail> orderDetailInfo = order.getOrderDetails();

        for (OrderDetail orderDetail : orderDetailInfo) {

            Long itemId = orderDetail.getItem().getId();
            Item item = itemService.queryItemById(itemId);

            if (null == item){
                continue;
            }
            orderDetail.setItem(item);
        }
        return order;
    }
}
