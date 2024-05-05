package jhoward14ST.YesChef;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
@ComponentScan({
	"com.jhoward14ST.YesChef", 
	"com.jhoward14ST.controller", 
	"com.jhoward14ST.service", 
	"com.jhoward14ST.repository"})
public class YesChefApplication {

    public static void main(String[] args) {
        SpringApplication.run(YesChefApplication.class, args);
    }
}