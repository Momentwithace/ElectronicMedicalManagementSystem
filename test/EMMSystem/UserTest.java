package EMMSystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {
    User user;

    @BeforeEach
    void setUp() {
        user = new User("Tman", "Sandra",
                "Female", 23, "1234567");
    }


    @Test
    void testThatWeHaveAUser() {
        assertNotNull(user);
    }

    @Test
    void testThatWeCanGetUsersFirstName() {
        assertEquals("Tman", user.getFirstName());
    }

    @Test
    void testThatWeCanGetUsersSecondName() {
        assertEquals("Sandra", user.getSecondName());
    }

    @Test
    void testThatWeCanGetUsersGender() {
        assertEquals("Female", user.getGender());
    }

    @Test
    void testThatWeGetUsersAge() {
        assertEquals(23, user.getAge());
    }

    @Test
    void testThatUserCanSetUsersPassword() {
        user.setPassword("12345678");
        assertEquals("12345678", user.getPassword());

    }

//    @Test
//    void testThatUserCanAccessAnHospital(){
//        Hospital newHospital = new Hospital("Zeddy lab", "32,Emily Akinola bariga",
//                "09031678234", "Zeddylab@gmial.com","Yaba");
//        //System.out.println(newHospital.getHospitalId());
//        user.addHospital(newHospital);
//        user.getHospital(102);
//        assertEquals(102, user.getHospital(102));
////        assertNotNull(102.);
//    }
//
//    @Test
//    void testThatUserCanGetListOfHospital(){
//         Hospital newHospital = new Hospital("Zeddy Clinic", "32,Emily Akinola Obalende",
//                "09031678234", "Zeddylab@gmial.com","Obalende");
//         user.addHospital(newHospital);
//         Hospital newHospital1 = new Hospital("Dove Specialist", "24, Ozumba Mbadiwe Drive",
//                "09031678234", "Zeddylab@gmial.com","Victoria Island");
//         user.addHospital(newHospital1);
//         Hospital newHospital2 = new Hospital("HealthRite", "12, Mobile Road Ilaje Ajah",
//                "09031678234", "Zeddylab@gmial.com","Ajah");
//         user.addHospital(newHospital2);
//         assertEquals(3, user.getHospitalList().size());
//    }
}
