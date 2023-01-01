package pl.maltoza.HelloMalto.running;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import pl.maltoza.HelloMalto.service.MailService;

import javax.annotation.PostConstruct;
import javax.mail.MessagingException;

@RequiredArgsConstructor
@Configuration
public class PostRunningApp {

    private final MailService mailService;

    @EventListener(ApplicationReadyEvent.class)
    public void sendMail() throws MessagingException {
        mailService.sendMail("maciej.kollaps@gmail.com", "Hello", "", false);
        System.out.println("Hello World");
    }
}
