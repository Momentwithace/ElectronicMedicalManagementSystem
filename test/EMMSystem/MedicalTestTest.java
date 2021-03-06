package EMMSystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MedicalTestTest {
    MedicalTest test;
    @BeforeEach

    void setMyTest(){
        test = new MedicalTest("HIV/AIDS");
    }

    @Test
    void testThatWeHaveTest(){
        assertNotNull(test);
    }

    @Test
    void testThatWeCanGetTestId(){
        assertEquals(202,test.getTestId());
    }

    @Test
    void testThatWeCanGetTestType(){
        assertEquals("HIV/AIDS", test.getTestType());
    }

}
