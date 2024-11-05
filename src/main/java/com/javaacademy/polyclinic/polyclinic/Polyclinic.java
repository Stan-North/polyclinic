package com.javaacademy.polyclinic.polyclinic;

import com.javaacademy.polyclinic.doctor.Doctor;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class Polyclinic {
    private Cashier cashier;
    private Doctor dentist;
    private Doctor therapist;
    private Doctor juniorSurgeon;
    private Doctor seniorSurgeon;

    public void dentistCure() {
        cure(dentist);
    }

    public void therapistCure() {
        cure(therapist);
    }

    public void juniorSurgeonCure() {
        cure(juniorSurgeon);
    }

    public void seniorSurgeonCure() {
        cure(seniorSurgeon);
    }

    private void cure(Doctor doctor) {
        doctor.curePerson();
        cashier.takePayment(doctor.getReceptionPrice());
    }
}
