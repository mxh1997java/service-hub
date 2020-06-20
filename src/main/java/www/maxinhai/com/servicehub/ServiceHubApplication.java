package www.maxinhai.com.servicehub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class ServiceHubApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceHubApplication.class, args);
    }

}
