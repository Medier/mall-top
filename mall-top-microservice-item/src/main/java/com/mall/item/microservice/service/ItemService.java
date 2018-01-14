package com.mall.item.microservice.service;

import com.mall.item.microservice.model.Item;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * ItemService
 *
 * @author : Administrator
 * @since : 2018-01-13
 */
@Service
public class ItemService {

    private static final Map<Long, Item> ITEM_MAP = new HashMap<>();

    static {
        ITEM_MAP.put(1L, new Item(1L, "商品标题1", "商品图片1", "商品描述1", 100L));
        ITEM_MAP.put(2L, new Item(2L, "商品标题2", "商品图片2", "商品描述2", 200L));
        ITEM_MAP.put(3L, new Item(3L, "商品标题3", "商品图片3", "商品描述3", 300L));
        ITEM_MAP.put(4L, new Item(4L, "商品标题4", "商品图片4", "商品描述4", 400L));
        ITEM_MAP.put(5L, new Item(5L, "商品标题5", "商品图片5", "商品描述5", 500L));
        ITEM_MAP.put(6L, new Item(6L, "商品标题6", "商品图片6", "商品描述6", 600L));
        ITEM_MAP.put(7L, new Item(7L, "商品标题7", "商品图片7", "商品描述7", 700L));
        ITEM_MAP.put(8L, new Item(8L, "商品标题8", "商品图片8", "商品描述8", 800L));
        ITEM_MAP.put(9L, new Item(9L, "商品标题9", "商品图片9", "商品描述9", 900L));
        ITEM_MAP.put(10L, new Item(10L, "商品标题10", "商品图片10", "商品描述10", 1000L));


    }

    public Item getItemById(Long id){
        return ITEM_MAP.get(id);
    }
}
