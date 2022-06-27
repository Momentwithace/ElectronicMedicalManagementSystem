package EMMSystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedicalRecordTest {
    Doctor doctor;
    Hospital hospital;
    MedicalRecord newMedicalRecord;

    @BeforeEach
    void setUp() {
        doctor = new Doctor("ace", "black", 23,"male", "Surgeon", 5);
        hospital = new Hospital("AceLab", "342, sabo yaba", "090678652232",
                "aceblack@ymail", "Lekki");
        newMedicalRecord = new MedicalRecord(doctor, hospital);
    }

    @Test
    void testThatWeUserHaveARecord(){
        assertNotNull(newMedicalRecord);
    }

}