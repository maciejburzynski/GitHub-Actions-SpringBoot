package pl.maltoza.HelloMalto;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.maltoza.HelloMalto.service.MailService;

@SpringBootApplication
public class HelloMaltoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloMaltoApplication.class, args);
	}
}
