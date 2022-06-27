package EMMSystem;

import java.util.ArrayList;
import java.util.Collection;

public class User {

    private int userId;
    private static int uniqueId = 100;
    private String firstName;
    private String secondName;
    private String gender;
    private int age;
    private String password;
    private ArrayList<Hospital> hospitals;

    public User(String firstName, String secondName, String gender, int age, String password) {
        this.userId = ++uniqueId;
        this.firstName = firstName;
        this.secondName = secondName;
        this.gender = gender;
        this.age = age;
        this.password = password;
        this.hospitals = new ArrayList<>();
    }


    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }


    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public int getUserId() {
        return userId;
    }

//    public void addHospital(Hospital newHospital) {
//        hospitals.add(newHospital);
//    }
//
//    public Hospital getHospital(int hospitalId) {
//        for(Hospital hospital : hospitals){
//            if(hospital.getHospitalId() == hospitalId){
//                return hospital;
//            }
//        }
//        return null;
//    }
//
//    public ArrayList<Hospital> getHospitalList() {
//        return hospitals;
//    }
}