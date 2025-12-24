package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import java.util.List;

@Entity
public class Doctor extends User {
    private String specialization;

    @OneToMany(mappedBy = "doctor")
    private List<AvailabilitySlot> availabilitySlots;

    @OneToMany(mappedBy = "doctor")
    private List<Appointment> appointments;

    // Getters and Setters
    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public List<AvailabilitySlot> getAvailabilitySlots() {
        return availabilitySlots;
    }

    public void setAvailabilitySlots(List<AvailabilitySlot> availabilitySlots) {
        this.availabilitySlots = availabilitySlots;
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(List<Appointment> appointments) {
        this.appointments = appointments;
    }
}
