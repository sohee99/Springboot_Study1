package com.estsoft.springbootwebservice1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing //JPA Auditing 활성화
@SpringBootApplication
public class SpringbootWebservice1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootWebservice1Application.class, args);
    }

}
