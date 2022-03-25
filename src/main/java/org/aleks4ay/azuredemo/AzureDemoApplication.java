package org.aleks4ay.azuredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class AzureDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(AzureDemoApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello Anatol from Aleksei using Azure site!" + System.lineSeparator() + "<br>";
    }
}
