package com.javaacademy.polyclinic.doctor;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Specialization {
    //Стоматолог, Хирург, Терапевт
    DENTIST("Стоматолог"),
    SURGEON("Хирург"),
    THERAPIST("Терапевт");

    private final String title;
}
