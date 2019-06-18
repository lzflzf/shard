package com.dalaoyang.database;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;



/**
 * @author yangyang
 * @date 2019/1/30
 */

@ConfigurationProperties(prefix = "database1")
@Component
public class Database1Config extends Database{

}