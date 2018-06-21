package w.m.vker.demo.pay_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PayServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PayServerApplication.class, args);
    }
}
