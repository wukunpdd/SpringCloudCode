package wukun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * 如果我们要使用 Feign 声明式 HTTP 客户端，必须要在启动类加入这个注解，以开启 Feign。
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class EurekaFeignApplication {

    public static void main(String[] args){
        SpringApplication.run(EurekaFeignApplication.class, args);
    }
}
