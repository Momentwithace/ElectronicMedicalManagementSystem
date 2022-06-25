package ElectronicMedicalManagementSystem;

public class User {

    private int id;
    private static int uniqueId = 100;
    private String firstName;
    private String secondName;
    private String gender;
    private int age;
    private String password;

    public User(String firstName, String secondName, String gender, int age, String password) {
        this.id = ++uniqueId;
        this.firstName = firstName;
        this.secondName = secondName;
        this.gender = gender;
        this.age = age;
        this.password = password;
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
}