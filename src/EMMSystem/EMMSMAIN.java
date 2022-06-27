package EMMSystem;

import java.util.Scanner;

public class EMMSMAIN {
    static Hospital hospital;
    User user;
    Doctor doctor;
    MedicalTest test;

    public static void sleep(){
        for(int i = 0; i < 7; i++) {
            System.out.print(".");
            try {

                Thread.sleep(1000);
            } catch (Exception ignored) {

            }

        }
        System.out.println();
    }
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        hospital = new Hospital("Dove Specialist", "314, Ozumba Mbadiwe Drive",
                "01231232", "dove@gmail.com", "Victoria Island");
        System.out.println("= =".repeat(20));
        System.out.println("= =".repeat(20));

        System.out.print("""
                              
                                    WELCOME TO HEALTH-HUB
                         YOUR NO 1 APP FOR EVERYTHING HEALTH AND WELLNESS
                   
                    1 -> MAIN-MENU
                    2 -> ABOUT US
                    3 -> CUSTOMER CARE SERVICE
                    4 -> JOIN PETER-OBI CAMPAIGN GROUP
               
               
                     CUSTOMER CARE             FB @HEALTH-HUB
                    070100HEALTH-HUB           IG @HEALTH-HUB
                    
                """);
        System.out.println("= =".repeat(20));
        System.out.println("= =".repeat(20));
        System.out.println();
        System.out.print(">>>");
        int userInput = input.nextInt();
        switch (userInput){
            case 1 -> mainMenu();
            case 2 -> aboutUs();
            case 3 -> customerCareService();
            case 4 -> joinPeterObiCampaignGroup();
        }
    }

    private static void joinPeterObiCampaignGroup() {
        System.out.println("""
                    #
                """);
    }

    private static void customerCareService() {
    }

    private static void aboutUs() {
    }

    private static void mainMenu() {
        System.out.println("*".repeat(30));
        System.out.println();
        System.out.println("""
                        MAIN-MENU
                     
                 1 -> Sign
                 2 -> SignUp
                 3 -> View Hospital List
             
             """);
        System.out.println("*".repeat(30));
        System.out.println();
        System.out.print(">>>");
        int userInput = input.nextInt();
        switch (userInput){
            case 1 -> signIntoAnExitingAccount();
            case 2 -> signUp();
            case 3 -> viewHospitalList();
        }
    }

    private static void viewHospitalList() {
    }

    private static void signUp() {
        System.out.println("Enter FirstName: ");
        String firstName = input.next();
        System.out.println("Enter SecondName: ");
        String secondName = input.next();
        System.out.println("Enter Gender: ");
        String gender = input.next();
        System.out.println("Enter Age: ");
        int age = input.nextInt();
        System.out.println("Set Password: ");
        String password = input.next();
        User user = new User(firstName,secondName,gender,age,password);
        hospital.addUser(user);
        System.out.println();
        System.out.print("Confirming Details");
        sleep();
        System.out.println("Details Confirmed");
        System.out.print("Creating Profile");
        sleep();
        System.out.println();
        System.out.println("Welcome to Dove Specialist " + firstName.toUpperCase());
        System.out.println();
    }

    private static void signIntoAnExitingAccount() {

    }
}
