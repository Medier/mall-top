package com.mall.item.microservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Item
 *
 * @author : Administrator
 * @since : 2018-01-13
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {

    private Long id;

    private  String title;

    private String pic;

    private String desc;

    private Long price;
}
