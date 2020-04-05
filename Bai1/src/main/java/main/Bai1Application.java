package main;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@ComponentScan({"main.controller","main.Database","main.DTO","main.jpaRepository","main.Mapper","main.model","main.service"})
//@ComponentScan("main")
//@EntityScan("main.model")
//@EnableJpaRepositories("main.jpaRepository")
@SpringBootApplication(scanBasePackages = {"main.controller","main.Database","main.DTO","main.jpaRepository","main.Mapper","main.model","main.service"})
public class Bai1Application {
	public static void main(String[] args) {
		SpringApplication.run(Bai1Application.class, args);
//		createDatabase create = new createDatabase();
	}

}
