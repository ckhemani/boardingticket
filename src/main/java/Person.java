public class Person {
//    Fields : name, email, phoneNumber,gender,age
    private String name;
    private String email;
    private int phoneNumber;
    private char gender;
    private int age;

    //Constructors with no Arguments
    public Person(){
    }

    //Constructors with Arguments
    public Person(String name,String email,int phoneNumber,char gender,int age){
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.age = age;
    }

    // Getters and Setters
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public int getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public char getGender(){
        return gender;
    }

    public void setGender(char gender){
        this.gender= gender;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    // To String

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
