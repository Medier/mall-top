package com.mall.item.microservice.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * OrderModuleProperties
 *
 * @author : Administrator
 * @since : 2018-01-14
 */
@Component
@ConfigurationProperties(prefix = "mall-top")
public class OrderModuleProperties {

    @Getter @Setter
    private ItemProperties item = new ItemProperties();
}
