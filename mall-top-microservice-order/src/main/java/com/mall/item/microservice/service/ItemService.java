package com.mall.item.microservice.service;

import com.mall.item.microservice.config.OrderModuleProperties;
import com.mall.item.microservice.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * ItemService
 *
 * @author : Administrator
 * @since : 2018-01-14
 */
public class ItemService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private OrderModuleProperties properties;

    @Autowired
    private DiscoveryClient discoveryClient;

    public Item queryItemById(Long id){

        String serviceId = "mall-top-microservice-item";

        //url 拼装
        String allUrl = "http://" + serviceId + "/item/" + id;
        //再次拼装通过RestTemplate发送请求获取对象

        return this.restTemplate.getForObject(allUrl,Item.class);
    }

//    public Item queryItemById(Long id){
//        String serviceId = "mall-top-microservice-item";
//        List<ServiceInstance> instances = this.discoveryClient.getInstances(serviceId);
//        if(instances.isEmpty()){
//            return null;
//        }
//        //获取第一个服务
//        ServiceInstance serviceInstance = instances.get(0);
//        //获取主机名和端口号做简单url初步拼装
//        String simpleUrl = serviceInstance.getHost()+ ":" + serviceInstance.getPort();
//
//        //完整url
//        String allUrl = "http://" + simpleUrl + "/item/" + id;
//        //再次拼装通过RestTemplate发送请求获取对象
//
//        return this.restTemplate.getForObject(allUrl,Item.class);
//    }


//    @Value("${mall-top.item.url}")
//    private String mallTopItemUrl;

//    public Item getItemById(Long id) {
//
////       String url = this.mallTopItemUrl + id;
//        String url = this.properties.getItem().getUrl() + id ;
//        return restTemplate.getForObject(url,Item.class);
//    }


}
