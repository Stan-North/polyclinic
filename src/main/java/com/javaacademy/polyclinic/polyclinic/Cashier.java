package com.javaacademy.polyclinic.polyclinic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@Slf4j
public class Cashier {
    private static final String INCOME_MESSAGE = "Доходы составил : %s";
    private BigDecimal income = BigDecimal.ZERO;

    public void takePayment(BigDecimal payment) {
        income = income.add(payment);
    }

    public void printIncome() {
        log.info(String.format(INCOME_MESSAGE, income));
    }

}
