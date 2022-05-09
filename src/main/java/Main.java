import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Main {
<<<<<<< HEAD
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
// Test CK
=======
    public static void greeting() {
        System.out.println("Welcome to Bla airlines");
    }
    private static final Path filePath = Paths.get("C:\\FannieProjects\\boardingticket\\Person2.txt");


    public static void main(String[] args) throws Exception {

        greeting();
        BoardingPass.getDateAndTime();
        BoardingPass.generateBoardingPass();
        System.out.println("\nPessenger Data: \n");
        //readAfile();
        addPerson();
        BoardingPass.generateETA();
        //BoardingPass.generateBoardingPass();
        //BoardingPass.generateETA();


        while (true) {
            switch (BoardingPass.checkPrice()) {
                case 1:
                    System.out.println(Total.genderTotal());
                    break;
                case 2:
                    System.out.println(Total.ticketTotalForKids());
                    break;
                case 3:
                    System.out.println(Total.ticketTotalForSeniors());
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Enter 1-4");
            }


        }
>>>>>>> DJ
    }
    //Write a file
    public static void addPerson() {
        try {
            Scanner scanner = new Scanner(System.in);
            Files.writeString(filePath, """

        Djelloul, djelloul@gmail.com, 7034057809, male, 48, May 9 2022, Bejaia, Algiers, 9.00
        
        """);


        System.out.println("Enter name");
        String name = scanner.nextLine();
        //System.out.println("Name is: " + name);

        System.out.println("Enter email");
        String email = scanner.nextLine();
        //System.out.println("Email is: " + email);

        System.out.println("Enter phone number");
        String phoneNumber = scanner.nextLine();
        //System.out.println("Phone number is: " + phoneNumber);

        System.out.println("Enter gender");
        String gender = scanner.nextLine();
        //System.out.println("Gender is: " + gender);

        System.out.println("Enter Age");
        int age = scanner.nextInt();
        //System.out.println("Age is: " + age);


        System.out.println("\nEnter date\n");
        String date = scanner.nextLine();
        //System.out.println("Date is: " + date);
            String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sept", "Oct", "Nov", "Dec"};

            Calendar calendar = Calendar.getInstance();
            System.out.print("Date: ");

            System.out.print(months[calendar.get(calendar.MONTH)]);
            System.out.print(" " + calendar.get(Calendar.DATE) + " ");
            System.out.println(calendar.get(Calendar.YEAR));

        System.out.println("Enter Origin");
        String origin = scanner.nextLine();
        //System.out.println("Origin is: " + origin);

        System.out.println("Enter destination");
        String destination = scanner.nextLine();
        //System.out.println("destination is: " + destination);

        //System.out.println("Enter departure time");
        //String departureTime = scanner.nextLine();
       // System.out.println(" DepartureTime is: " + departureTime);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //ReadAfile
    public static void readAfile() {
        String temp;
        try {
            temp = Files.readString(filePath);
            System.out.println(temp);
        }catch (Exception e) {
            e.printStackTrace();

        }
    }

}