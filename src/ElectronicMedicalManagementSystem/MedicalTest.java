package ElectronicMedicalManagementSystem;

public class MedicalTest {
    private  int testId;
    private  String testType;

    public MedicalTest(int testId, String testType) {
        this.testId = testId;
        this.testType = testType;
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
