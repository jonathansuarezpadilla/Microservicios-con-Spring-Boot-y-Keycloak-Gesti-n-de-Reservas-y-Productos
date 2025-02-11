package riwi.com.springconfigurationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringConfigurationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringConfigurationServiceApplication.class, args);
    }

}
