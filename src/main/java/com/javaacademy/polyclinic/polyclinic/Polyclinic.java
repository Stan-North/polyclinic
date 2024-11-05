package com.javaacademy.polyclinic.polyclinic;

import com.javaacademy.polyclinic.doctor.Doctor;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class Polyclinic {
    private static final int DENTIST_INDEX = 0;
    private static final int THERAPIST_INDEX = 1;
    private static final int JUNIOR_SURGEON_INDEX = 2;
    private static final int SENIOR_SURGEON_INDEX = 3;

    private Cashier cashier;
    private List<Doctor> doctors;

    public void dentistCure() {
        cure(doctors.get(DENTIST_INDEX));
    }

    public void therapistCure() {
        cure(doctors.get(THERAPIST_INDEX));
    }

    public void juniorSurgeonCure() {
        cure(doctors.get(JUNIOR_SURGEON_INDEX));
    }

    public void seniorSurgeonCure() {
        cure(doctors.get(SENIOR_SURGEON_INDEX));
    }

    private void cure(Doctor doctor) {
        doctor.curePerson();
        cashier.takePayment(doctor.getReceptionPrice());
    }
}
