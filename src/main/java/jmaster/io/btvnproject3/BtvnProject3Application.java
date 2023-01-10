package jmaster.io.btvnproject3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.kafka.support.converter.JsonMessageConverter;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@EnableJpaAuditing
@EnableScheduling
@EnableCaching
@EnableAsync
public class BtvnProject3Application implements WebMvcConfigurer {

    public static void main(String[] args) {
        SpringApplication.run(BtvnProject3Application.class, args);
    }

    @Bean
    JsonMessageConverter converter() {
        return new JsonMessageConverter();
    }

}
