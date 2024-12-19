package AppointmentTests;
import static org.junit.Assert.*;
import java.util.Date;
import org.junit.Before;
import org.junit.Test;

import AppointmentPackage.Appointment;
import AppointmentPackage.AppointmentService;

public class AppointmentServiceTest {
    
    private AppointmentService appointmentService;
    
    @Before
    public void setUp() {
        appointmentService = new AppointmentService();
    }
    
    @Test
    public void testAddAppointment() {
        Appointment appointment = new Appointment("A123456789", new Date(), "Test Appointment");
        appointmentService.addAppointment(appointment);
        assertEquals(appointment.getAppointmentDate(), new Date());
    }
      
    @Test
    public void testDeleteAppointment() {
        Appointment appointment = new Appointment("A123456788", new Date(), "Emily`s apointment");
        appointmentService.addAppointment(appointment);
        appointmentService.deleteAppointment("A123456788");
        assertEquals(appointment.getAppointmentId(), "A123456788");
  
    
    }
    
    @Test
    public void testGetAppointments() {
        Appointment appointment1 = new Appointment("A123456789", new Date(), "Test Appointment 1");
        Appointment appointment2 = new Appointment("B123456789", new Date(), "Test Appointment 2");
        appointmentService.addAppointment(appointment1);
        appointmentService.addAppointment(appointment2);
        assertEquals(2, appointmentService.getAppointments().size());
    }
    
}

