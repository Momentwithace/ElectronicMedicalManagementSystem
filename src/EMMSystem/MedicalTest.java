package EMMSystem;

import java.util.ArrayList;
import java.util.Date;

public class MedicalTest {
    private static int uniqueId = 201;
    private  int testId;
    private  String testType;
    private final Date dateCrated;

    public MedicalTest(String testType) {
        this.testId = ++uniqueId;
        this.testType = testType;
        dateCrated = new Date();
    }
    public int getTestId() {
        return testId;
    }

    public void setTestId(int testId) {
        this.testId = testId;
    }

    public String getTestType() {
        return testType;
    }

    public void setTestType(String testType) {
        this.testType = testType;
    }

}
