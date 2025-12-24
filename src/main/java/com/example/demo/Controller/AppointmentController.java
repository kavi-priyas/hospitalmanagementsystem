package com.example.demo.Controller;


import com.example.demo.model.Appointment;
import com.example.demo.Services.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appointments")
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

    @GetMapping("/status/{status}")
    public List<Appointment> getAppointmentsByStatus(@PathVariable String status) {
        return appointmentService.getAppointmentsByStatus(status);
    }

    @PostMapping
    public Appointment createAppointment(@RequestBody Appointment appointment) {
        return appointmentService.createAppointment(appointment);
    }

    @PutMapping("/{id}/status/{status}")
    public Appointment updateAppointmentStatus(@PathVariable Long id, @PathVariable String status) {
        return appointmentService.updateAppointmentStatus(id, status);
    }
}
