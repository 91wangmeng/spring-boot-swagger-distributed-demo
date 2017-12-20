package w.m.vker.demo.paymentserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableEurekaClient
public class PaymentServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentServerApplication.class, args);
	}
}
