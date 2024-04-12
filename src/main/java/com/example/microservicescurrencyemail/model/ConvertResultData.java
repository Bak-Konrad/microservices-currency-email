package com.example.microservicescurrencyemail.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ConvertResultData {
    private Result result;
    private String emailAddress;

}
