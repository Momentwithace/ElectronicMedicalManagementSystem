package EMMSystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class HospitalTest {
    Hospital myHospital;
    Doctor doctor;
    MedicalRecord newMedicalRecord;
    MedicalTest newMedicalTest;

    @BeforeEach
    void setUp() {
        myHospital = new Hospital("Trauma Center", "Sabo Yaba", "09078657435",
                "trauma@ymail.com", "Yaba");
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

    @Test
    void testThatWeHospitalHasADoctor(){
        Doctor doctor = new Doctor("ace", "black",
                23, "male", "surgeon", 5);
       myHospital.addDoctor(doctor);
       assertEquals(1001, myHospital.getDoctor(1001).getDoctorId());

    }

    @Test
    void testThatHospitalCanGetListOfDoctor(){
        Doctor doctor = new Doctor("ace", "black",
                23, "male", "surgeon", 5);
        myHospital.addDoctor(doctor);
        Doctor doctor2 = new Doctor("tman", "emma",
                40, "male", "Mls", 9);
        myHospital.addDoctor(doctor2);
        assertEquals(2, myHospital.getDoctorList().size());
    }

    @Test
    void testThatHospitalCanAddMedicalTest(){
        MedicalTest newMedicalTest = new MedicalTest("Malaria");
        myHospital.addMedicalTest(newMedicalTest);
        assertEquals("Malaria", myHospital.getMedicalTestType("Malaria").getTestType());
    }

    @Test
    void testThatHospitalHaveListOfMedicalTest(){
        MedicalTest newMedicalTest = new MedicalTest("Malaria");
        myHospital.addMedicalTest(newMedicalTest);
        MedicalTest newMedicalTest2 = new MedicalTest("Hiv");
        myHospital.addMedicalTest(newMedicalTest2);
        MedicalTest newMedicalTest3 = new MedicalTest("Blood Test");
        myHospital.addMedicalTest(newMedicalTest3);
        assertEquals(3, myHospital.getMedicalTestList().size());
    }

    @Test
    void testThatHospitalCanAddAUser(){
        User newUser = new User("ace","black", "female", 23, "123456789");
        myHospital.addUser(newUser);
        assertEquals(101, myHospital.getUser(101).getUserId());
    }

    @Test
    void testThatWeCanGetListOfUser(){
        User newUser = new User("Solomon","Felix", "male", 29, "123456789");
        myHospital.addUser(newUser);
        User newUser1 = new User("BlueBoy","Ebrene", "male", 33, "123456789");
        myHospital.addUser(newUser1);
        User newUser2 = new User("Ruth","Emma", "female", 26, "123456789");
        myHospital.addUser(newUser2);
        assertEquals(3, myHospital.getUserList().size());
    }

}