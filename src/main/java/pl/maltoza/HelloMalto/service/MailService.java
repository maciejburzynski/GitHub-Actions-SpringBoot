package pl.maltoza.HelloMalto.service;

import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Order;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

@Service
@RequiredArgsConstructor
@Order(2)
public class MailService {

    private final JavaMailSender javaMailSender;

    public void sendMail(String to,
                         String subject,
                         String text,
                         File file,
                         boolean isHtmlContent) throws MessagingException {
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
        mimeMessageHelper.setTo(to);
        mimeMessageHelper.setSubject(subject);
        mimeMessageHelper.setText(text, isHtmlContent);
        mimeMessageHelper.addAttachment(file.getName(), file);
        javaMailSender.send(mimeMessage);
    }
}
