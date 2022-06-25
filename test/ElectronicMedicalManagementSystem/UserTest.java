package ElectronicMedicalManagementSystem;

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
}
