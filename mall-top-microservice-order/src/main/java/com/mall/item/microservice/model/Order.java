package com.mall.item.microservice.model;

import lombok.*;

import java.util.Date;
import java.util.List;

/**
 * Order
 *
 * @author : Administrator
 * @since : 2018-01-13
 */
@Data
@NoArgsConstructor
public class Order {

    private String orderId;

    private Long userId;

    private Date createDate;

    private Date updateDate;

    private List<OrderDetail> orderDetails;

    public Order(String orderId, Long userId, Date createDate, Date updateDate) {
        this.orderId = orderId;
        this.userId = userId;
        this.createDate = createDate;
        this.updateDate = updateDate;
    }

}
