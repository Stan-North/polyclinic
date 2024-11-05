package com.javaacademy.polyclinic.config;

import com.javaacademy.polyclinic.polyclinic.Cashier;
import com.javaacademy.polyclinic.doctor.Doctor;
import com.javaacademy.polyclinic.doctor.Specialization;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(value = DoctorsProperty.class)
public class PolyclinicConfig {
    private final DoctorsProperty doctorsProperty;

    public PolyclinicConfig(DoctorsProperty doctorsProperty) {
        this.doctorsProperty = doctorsProperty;
    }

    @Bean
    public Cashier cashier() {
        return new Cashier();
    }

    @Bean
    public Doctor dentist() {
        return new Doctor(doctorsProperty.getDoctorRate1(), Specialization.DENTIST);
    }

    @Bean
    public Doctor therapist() {
        return new Doctor(doctorsProperty.getDoctorRate2(), Specialization.THERAPIST);
    }

    @Bean
    public Doctor juniorSurgeon() {
        return new Doctor(doctorsProperty.getDoctorRate3(), Specialization.SURGEON);
    }

    @Bean
    public Doctor seniorSurgeon() {
        return new Doctor(doctorsProperty.getDoctorRate4(), Specialization.SURGEON);
    }
}
