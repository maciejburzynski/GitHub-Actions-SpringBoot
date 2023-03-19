package pl.maltoza.HelloMalto.running;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import pl.maltoza.HelloMalto.service.FileService;
import pl.maltoza.HelloMalto.service.MailService;

import javax.mail.MessagingException;
import java.io.IOException;

@RequiredArgsConstructor
@Configuration
public class PostRunningApp {

    private final MailService mailService;
    private final FileService fileService;

    @EventListener(ApplicationStartedEvent.class)
    public void sendMail() throws MessagingException, IOException {
        mailService.sendMail("maciej.kollaps@gmail.com", "Hello", "", fileService.createFile(), false);
        System.out.println("Hello World from HelloMalto");
    }
}
