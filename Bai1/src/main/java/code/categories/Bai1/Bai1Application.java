package code.categories.Bai1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class Bai1Application {
	public static void main(String[] args) {
		SpringApplication.run(Bai1Application.class, args);
		
//		createDatabase create = new createDatabase();
	}

}
