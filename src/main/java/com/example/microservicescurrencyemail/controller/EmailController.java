package com.example.microservicescurrencyemail.controller;

import com.example.microservicescurrencyemail.model.ConvertResultData;
import com.example.microservicescurrencyemail.service.EmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1")
public class EmailController {
    private final EmailService emailService;

    @PostMapping("/mail")
    public void sendEmails(@RequestBody ConvertResultData convertResultData) {
        emailService.sendMessage(convertResultData);
    }

}
