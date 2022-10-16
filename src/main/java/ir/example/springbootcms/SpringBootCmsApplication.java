package ir.example.springbootcms;

import ir.example.springbootcms.service.UserService;
import ir.example.springbootcms.service.impl.UserServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootCmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootCmsApplication.class, args);

    }

}
