package riwi.com.apigetway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ApigetwayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApigetwayApplication.class, args);
    }

}
