package src.com.kelly3d.main.java.com.kelly3d.spring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@Slf4j
@SpringBootApplication
@EnableAutoConfiguration(exclude={MongoAutoConfiguration.class})
public class AppStartupRunner {

    public static void main(String[] args) {
        SpringApplication.run(AppStartupRunner.class, args);
    }

}
