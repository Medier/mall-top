package com.mall.item.microservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * OrderDetail
 *
 * @author : Administrator
 * @since : 2018-01-13
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetail {

    private String orderId;

    private Item item = new Item();

}
