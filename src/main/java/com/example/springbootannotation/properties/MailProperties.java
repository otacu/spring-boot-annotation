package com.example.springbootannotation.properties;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Data
@Component
@ConfigurationProperties(ignoreUnknownFields = false, prefix = "mail")
public class MailProperties {

    // 使用一些松的规则来绑定属性到@ConfigurationProperties

    private String name;
    private String password;
}
