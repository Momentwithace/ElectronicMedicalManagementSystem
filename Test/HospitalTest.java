
import ElectronicMedicalManagementSystem.Hospital;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class HospitalTest {
    Hospital myHospital;

    @BeforeEach
    void setUp() {
        myHospital = new Hospital(1, "Trauma Center", "Sabo Yaba");
    }

    @Test
    void testThatWeHaveHospital() {
        assertNotNull(myHospital);
    }

    @Test
    void testThatWeCanGetHospitalName() {
        assertEquals("Trauma Center", myHospital.getHospitalName());
    }

    @Test
    void testThatWeCanGetHospitalAddress() {
        assertEquals("Sabo Yaba", myHospital.getHospitalAddress());
    }
}