package net.codejava;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {
	@Bean
	SimpleBean simpleBeanConfig() {
		return new SimpleBean("Tran Nhan");
	}
}
