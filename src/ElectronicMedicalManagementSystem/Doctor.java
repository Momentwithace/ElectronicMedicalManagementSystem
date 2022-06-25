package ElectronicMedicalManagementSystem;

public class Doctor {
    private String doctorFirstName;
    private String doctorSecondName;
    private int age;
    private String specialization;
    private int yearOfPractice;

    private int uniqueId = 1001;
    private int id;
    public Doctor(String doctorsFirstName, String doctorSecondName, int age, String specialization, int yearOfPractice) {
        this.doctorFirstName = doctorsFirstName;
        this.doctorSecondName = doctorSecondName;
        this.age = age;
        this.specialization = specialization;
        this.yearOfPractice = yearOfPractice;
        this.id = uniqueId++;

    }

    public String getDoctorsFirstName() {
        return doctorFirstName;
    }

    public String getDoctorsSecondName() {
        return doctorSecondName;
    }

    public int getDoctorsAge() {
        return age;
    }

    public String getDoctorsSpeciality() {
        return specialization;
    }

    public int getYearOfPractice() {
        return yearOfPractice;
    }

}
