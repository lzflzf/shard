package com.dalaoyang.database;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@ConfigurationProperties(prefix = "database2")
@Component
public class Database2Config extends Database{

}