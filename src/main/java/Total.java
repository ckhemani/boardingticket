import java.util.Scanner;

public class Total {

//Fields price,TAXES
    private static double price;
    private static double taxes;
    private static int age;
    private static String gender;

    //Constructor

    public Total() {
    }

    public Total(double price, double taxes, int age, String gender) {
        this.price = price;
        this.taxes = taxes;
        this.age = age;
        this.gender = gender;
    }

    //Getters and setters


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTaxes() {
        return taxes;
    }

    public void setTaxes(double taxes) {
        this.taxes = taxes;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    //Methods
    public static double genderTotal(){
        double price =1000;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Gender");
        String gender = input.nextLine();
        System.out.println("Your Price is : ");

        if(gender.equals("Female"))
            price= price*.75;
        return price;
    }
    public static double ticketTotalForKids() {
        double price = 1000;
        Scanner input = new Scanner(System.in);
//        System.out.println("Enter Price");
//        double Price = input.nextDouble();
        System.out.println("Enter Age");
        int age = input.nextInt();
        System.out.println("Your price is:  ");
        if (age <=12) {
            price = price - (price * .5);
        }
        return price;
    }

    public static double ticketTotalForSeniors() {
        double price = 1000;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Age");
        int age = input.nextInt();
        System.out.println("Your Price is: ");
        if (age >= 60)
            price = price-(price*.60);
        return price;
    }

    //ToString


    @Override
    public String toString() {
        return "TicketPrice{" +
                "price=" + price +
                ", taxes=" + taxes +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
