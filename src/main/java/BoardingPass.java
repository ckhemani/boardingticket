import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class BoardingPass {
// Fields    boardingPassNumber,date,origin,destination,estimatedTimeOfArrival,departureTime.
    private static String name;
    private static String email;
    private static String destination;
    private static String gender;
    private static double departureTime;
    private static String date;
    private static String origin;
    private static String phoneNumber;
    private static int age;
    private static String ETA;
    private static String boardingPassNumber;

    static final Path filePath = Paths.get("C:\\FannieProjects\\boardingticket\\Person1");

    //Constructor


    public BoardingPass() {
    }

    public BoardingPass(String name, String email, String destination, String gender, double departureTime, String date, String origin, String phoneNumber, int age, String ETA, String boardingPassNumber) {
        this.name = name;
        this.email = email;
        this.destination = destination;
        this.gender = gender;
        this.departureTime = departureTime;
        this.date = date;
        this.origin = origin;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.ETA = ETA;
        this.boardingPassNumber = boardingPassNumber;
    }
    //Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(double departureTime) {
        this.departureTime = departureTime;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getETA() {
        return ETA;
    }

    public void setETA(String ETA) {
        this.ETA = ETA;
    }

    public String getBoardingPassNumber() {
        return boardingPassNumber;
    }

    public void setBoardingPassNumber(String boardingPassNumber) {
        this.boardingPassNumber = boardingPassNumber;
    }


    //Methods
    public static int checkPrice() {
        Scanner input = new Scanner(System.in);
        System.out.println("""
                 \nFor Rates - Choose from menu:\n
                Enter 1. Gender
                Enter 2. Kids
                Enter 3. Seniors
                Enter 4. Exit
                 """);
        return input.nextInt();

    }
    public static void getDateAndTime() {


        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sept", "Oct", "Nov", "Dec"};
        //        Date date = new Date();
//        System.out.println(date);
        Calendar calendar = Calendar.getInstance();
        System.out.print("Date: ");

        System.out.print(months[calendar.get(calendar.MONTH)]);
        System.out.print(" " + calendar.get(Calendar.DATE) + " ");
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.print("Time: ");
        System.out.print(calendar.get(Calendar.HOUR) + ":");
        System.out.print(calendar.get(Calendar.MINUTE) + ":");
        System.out.print(calendar.get(Calendar.SECOND) + "\n");
    }
//    public static boolean getData() {
//
//        ArrayList<Object> output=new ArrayList<Object>();
//
//        try {
//            final Path dataFile = Paths.get("C:\\FannieProjects\\boardingticket\\Person2.txt");
//            Scanner reader = new Scanner(dataFile);
//            String data = "";
//            int number =1;
//            while (reader.hasNextLine()) {
//                data= reader.nextLine();
//                //System.out.println(data);
//            }
//            data=data.substring(1, data.length()-1);
//            //System.out.println(data);
//            reader.close();
//
//            List<String> splitData = Arrays.asList(data.split(", "));
//            //System.out.println(splitData);
//
//            //[name, email, phone number, gender, age, date, origin, destination, and departure time]
//            name=splitData.get(0);//0 1 2 3 4 5 6 7 8
//            email=splitData.get(1);
//            phoneNumber= splitData.get(2);
//            gender=splitData.get(3);
//            age=Integer.parseInt(splitData.get(4));
//            date=splitData.get(5);
//            origin=splitData.get(6);
//            destination=splitData.get(7);
//            departureTime= Double.parseDouble(splitData.get(8));
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        return getData();
//    }
    public static void generateETA(){

        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter Distance\n");
        double distance = sc.nextDouble();
        System.out.println("Enter average speed");
        double speed = sc.nextDouble();
        //System.out.println("Enter time");
        double time;
        if(speed!=0){
            time =  distance/speed;
            System.out.println("Enter departure time ");
            double departuretime = sc.nextDouble();

            System.out.println("ETA is: ");
           double ETA = departuretime+time;
            System.out.println(ETA);
        }


    }
    public static void generateBoardingPass(){
        Random randNum = new Random();
        Set<Integer>set = new LinkedHashSet<>();
        while (set.size() < 9) {
            set.add(randNum.nextInt(9)+1);
        }
       System.out.println("BoardingPass number is: ");
        for (int sets:set){
            //System.out.println("BoardingPass is: ");
            System.out.print(sets);


        }
    }


    @Override
    public String toString() {
        return "BoardingPass{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", destination='" + destination + '\'' +
                ", gender='" + gender + '\'' +
                ", departureTime='" + departureTime + '\'' +
                ", date='" + date + '\'' +
                ", origin='" + origin + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", age=" + age +
                ", EstimatedTimeArrival='" + ETA + '\'' +
                ", boardingPassNumber='" + boardingPassNumber + '\'' +
                '}';

    }

}
