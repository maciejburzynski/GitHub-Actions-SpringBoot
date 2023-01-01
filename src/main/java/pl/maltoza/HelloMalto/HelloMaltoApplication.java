package pl.maltoza.HelloMalto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloMaltoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloMaltoApplication.class, args);
		System.out.println("Hello World");
	}

}
