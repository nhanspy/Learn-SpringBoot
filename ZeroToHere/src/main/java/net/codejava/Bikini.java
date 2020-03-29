package net.codejava;

import org.springframework.stereotype.Component;

@Component
public class Bikini implements outfit {
	public void wear() {
		System.out.println("Bikini .. ");
	}
}
