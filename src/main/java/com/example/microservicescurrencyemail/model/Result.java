package com.example.microservicescurrencyemail.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Result {
    private String currencyFrom;
    private String currencyTo;
    private BigDecimal amount;
    private BigDecimal result;
    private BigDecimal rate;
}
