package cn.young;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Young
 * @Date: 2018-06-09 22:01
 * @Description:
 */

@SpringBootApplication
@EnableEurekaClient
@RestController
public class Client2Application {

    public static void main(String[] args) {
        SpringApplication.run(Client2Application.class, args);
    }

    @Value("${server.port}")
    String port;

    @RequestMapping("/client")
    public String client() {
        return "hello world from port " + port;
    }
}
