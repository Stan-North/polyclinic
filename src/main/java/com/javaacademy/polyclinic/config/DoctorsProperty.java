package com.javaacademy.polyclinic.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.math.BigDecimal;

@ConfigurationProperties(prefix = "doctor")
@Data
public class DoctorsProperty {
    private BigDecimal doctorRate1;
    private BigDecimal doctorRate2;
    private BigDecimal doctorRate3;
    private BigDecimal doctorRate4;
}
