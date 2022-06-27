package EMMSystem;

import java.util.ArrayList;
import java.util.Collection;

public class Hospital {
    private static int uniqueId = 101;
    private int hospitalId;
    private String hospitalName;
    private String hospitalAddress;
    private ArrayList<Doctor> doctors;
    private ArrayList<MedicalTest> tests;
    private ArrayList<User> users;
    private String hospitalEmailAddress;
    private String hospitalAddressLocation;

    public Hospital(String hospitalName, String hospitalAddress, String hospitalPhoneNumber,
                    String hospitalEmailAddress, String hospitalAddressLocation) {
        this.hospitalId = ++uniqueId;
        this.hospitalName = hospitalName;
        this.hospitalEmailAddress = hospitalEmailAddress;
        this.hospitalAddressLocation = hospitalAddressLocation;
        this.hospitalAddress = hospitalAddress;
        this.doctors = new ArrayList<>();
        this.tests = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    public int getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalAddress() {
        return hospitalAddress;
    }

    public void setHospitalAddress(String hospitalAddress) {
        this.hospitalAddress = hospitalAddress;

    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public Doctor getDoctor(int doctorId) {
        for (Doctor doctor : doctors) {
            if (doctor.getDoctorId() == doctorId) {
                return doctor;
            }
        }
        return null;
    }


    public ArrayList<Doctor> getDoctorList() {
        return doctors;
    }

    public void addMedicalTest(MedicalTest newMedicalTest) {
        tests.add(newMedicalTest);
    }

    public MedicalTest getMedicalTestType(String testType) {
        for (MedicalTest test : tests) {
            if (test.getTestType() == testType) {
                return test;
            }
        }
        return null;
    }

    public ArrayList<MedicalTest> getMedicalTestList() {
        return tests;
    }

    public void addUser(User newUser) {
        users.add(newUser);
    }

    public User getUser(int userId) {
        for(User user : users){
            if(user.getUserId() == userId){
                return user;
            }
        }
        return null;
    }

    public ArrayList<User> getUserList() {
        return users;
    }


//    public User getUserId(int userId) {
//        int initialArraySize = users.size();
//        for (User user : users) {
//            if (user.getUserId() == userId) {
//                return user;
//            }
//        }
//
//        if (initialArraySize == users.size()) {
//            throw new IllegalArgumentException("User not found");
//
//        }
//        return null;
//    }

}