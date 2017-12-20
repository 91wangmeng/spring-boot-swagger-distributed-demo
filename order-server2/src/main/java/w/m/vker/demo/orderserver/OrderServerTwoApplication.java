package w.m.vker.demo.orderserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OrderServerTwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderServerTwoApplication.class, args);
    }
}
