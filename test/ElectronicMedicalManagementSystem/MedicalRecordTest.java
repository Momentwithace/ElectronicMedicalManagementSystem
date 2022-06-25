package ElectronicMedicalManagementSystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedicalRecordTest {
    Doctor doctor;
    Hospital hospital;
    MedicalRecord newMedicalRecord;

    @BeforeEach
    void setUp() {
        doctor = new Doctor("ace", "black", 23, "Surgeon", 5);
        hospital = new Hospital();
        newMedicalRecord = new MedicalRecord(doctor, hospital);
    }

    @Test
    void testThatWeUserHaveARecord(){
        assertNotNull(newMedicalRecord);
    }

}