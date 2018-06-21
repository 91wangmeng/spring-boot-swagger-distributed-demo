package w.m.vker.demo.eureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekalServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekalServerApplication.class, args);
    }
}
