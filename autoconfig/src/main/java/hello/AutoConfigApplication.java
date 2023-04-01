package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
public class AutoConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(AutoConfigApplication.class, args);
    }

}
