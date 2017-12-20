package com.sf.game;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class GameApplication extends SpringBootServletInitializer {
    private static Logger logger = LoggerFactory.getLogger(GameApplication.class);

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(GameApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(GameApplication.class, args);
        logger.info("服务器启动!");
    }
}
