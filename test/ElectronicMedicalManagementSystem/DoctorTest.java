package ElectronicMedicalManagementSystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DoctorTest {
    Doctor doctor;

    @BeforeEach
    void testThatWeHaveADoctor() {
        doctor = new Doctor("Ace",
                "Black", 34, "Surgeon", 4);
        assertNotNull(doctor);
    }

    @Test
    void testThatWeCanGetDoctorsFirstName() {
        assertEquals("Ace", doctor.getDoctorsFirstName());
    }

    @Test
    void testThatWeCanGetDoctorsSecondName() {
        assertEquals("Black", doctor.getDoctorsSecondName());
    }

    @Test
    void testThatWeCanGetDoctorsAge() {
        assertEquals(34, doctor.getDoctorsAge());
    }

    @Test
    void testThatWeCanGetDoctorsSpeciality() {
        assertEquals("Surgeon", doctor.getDoctorsSpeciality());
    }

    @Test
    void testThatWeCanGetDoctorsYearOfPractice() {
        assertEquals(4, doctor.getYearOfPractice());

    }

}