package com.example.microservicescurrencyemail.service;

import com.example.microservicescurrencyemail.model.ConvertResultData;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class EmailDataMQListenerService {
    private final EmailService emailService;

    @RabbitListener(queues = "${rabbit.email-queue}")
    public void handleEmailData(ConvertResultData convertResultData) {
        emailService.sendMessage(convertResultData);
        log.info("Message model received: {}", convertResultData);
    }
}
