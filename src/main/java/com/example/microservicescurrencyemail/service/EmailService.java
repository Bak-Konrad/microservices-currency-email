package com.example.microservicescurrencyemail.service;

import com.example.microservicescurrencyemail.model.ConvertResultData;
import com.example.microservicescurrencyemail.model.Result;
import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailService {
    private final JavaMailSender mailSender;

    public SimpleMailMessage prepareMessage(ConvertResultData model) {
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setFrom("smietnikowe665@gmail.com");
        mailMessage.setTo(model.getEmailAddress());
        mailMessage.setSubject("Exchange info");
        mailMessage.setText(prepareTextForMessage(model.getResult()));
        return mailMessage;
    }

    @Async
    public void sendMessage(ConvertResultData convertResultData) {
        mailSender.send(prepareMessage(convertResultData));
    }

    private String prepareTextForMessage(Result result) {
        StringBuilder message = new StringBuilder();
        message.append("Thank you for choosing our currency exchange service. Here are the details of your exchange:\n")
                .append("From: ").append(result.getCurrencyFrom()).append("\n")
                .append("To: ").append(result.getCurrencyTo()).append("\n")
                .append("Amount: ").append(result.getAmount()).append("\n")
                .append("Result: ").append(result.getResult()).append("\n")
                .append("Exchange Rate: ").append(result.getRate());
        return message.toString();
    }

}