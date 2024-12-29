package com.itranswarp.exchange;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring config server. This project is only used to serve config files.
 *
 * NOTE the default port of config server is 8888.
 */
@SpringBootApplication
public class TradingApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(TradingApiApplication.class, args);
    }
}
