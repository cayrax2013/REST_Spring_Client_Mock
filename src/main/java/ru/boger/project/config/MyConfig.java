package ru.boger.project.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@ComponentScan("ru.boger.project")
public class MyConfig {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
