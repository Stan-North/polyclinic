package com.javaacademy.polyclinic.doctor;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
@AllArgsConstructor
@Getter
public class Doctor {
    private static final String CURE_SUCCESS = "%s вылечил человека";

    private BigDecimal receptionPrice;
    private Specialization specialization;

    public BigDecimal curePerson() {
        log.info(String.format(CURE_SUCCESS, specialization.getTitle()));
        return receptionPrice;
    }
}
