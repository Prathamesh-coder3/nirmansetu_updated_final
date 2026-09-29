package com.nirmaansetu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NirmaanSetuApplication {

    public static void main(String[] args) {
        // Vercel/container-safe startup: use PORT/server.port configuration
        // and never try to select local ports or open a browser.
        SpringApplication.run(NirmaanSetuApplication.class, args);
    }
}
