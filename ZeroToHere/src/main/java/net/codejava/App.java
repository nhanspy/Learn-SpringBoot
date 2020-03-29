package net.codejava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
	public static void main(String[] args) {
		org.springframework.context.ApplicationContext context = SpringApplication.run(App.class, args);
		
		SimpleBean simpleBean = (SimpleBean) context.getBean("simpleBeanConfig");
		System.out.println("Bean is : .. " + simpleBean.toString());
		
//		outfit of = context.getBean(Bikini.class);
//		  System.out.println("Instance: " + of);
//	        // xài hàm wear()
//	        of.wear();
	}
}
