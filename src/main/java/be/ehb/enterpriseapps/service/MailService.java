package be.ehb.enterpriseapps.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendMail(String naam,
                         String email,
                         String bericht) {

        SimpleMailMessage message =
                new SimpleMailMessage();

        message.setTo("admin@anderlechtngo.be");

        message.setSubject(
                "Nieuw contactformulier van " + naam
        );

        message.setText(
                "Naam: " + naam +
                        "\nEmail: " + email +
                        "\n\nBericht:\n" + bericht
        );

        mailSender.send(message);
    }
}