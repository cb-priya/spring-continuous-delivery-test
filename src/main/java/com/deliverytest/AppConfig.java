package com.deliverytest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
@EntityScan("com.deliverytest.*")
public class AppConfig {

    @Autowired
    private Environment env;

}