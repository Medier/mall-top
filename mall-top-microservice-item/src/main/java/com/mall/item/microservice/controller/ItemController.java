package com.mall.item.microservice.controller;

import com.mall.item.microservice.model.Item;
import com.mall.item.microservice.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * ItemController
 *
 * @author : Administrator
 * @since : 2018-01-13
 */
@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping("/item/{id}")
    public Item queryItemById(@PathVariable("id") Long id){
        return itemService.getItemById(id);
    }
}
