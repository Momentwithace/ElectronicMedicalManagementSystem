package ElectronicMedicalManagementSystem;


import java.util.ArrayList;

public class MedicalRecord {

    private Doctor doctorName;
    private Hospital hospital;
    private ArrayList<MedicalTest> tests;
    public MedicalRecord(Doctor doctorName, Hospital hospitalName) {
        this.doctorName = doctorName;
        hospital = hospitalName;
    }
}

