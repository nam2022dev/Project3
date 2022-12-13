package jmaster.io.btvnproject3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BtvnProject3Application {

    public static void main(String[] args) {
        SpringApplication.run(BtvnProject3Application.class, args);
    }

}
