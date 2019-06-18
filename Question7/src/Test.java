import java.util.Scanner;
class Employee
{
    Scanner s=new Scanner(System.in);

    String name,gender;
    int age;
    static String company="Enquero";

    void getDetails()
    {
        System.out.println("Enter the name");
        name=s.nextLine();

        System.out.println("Enter the gender");
        gender=s.nextLine();

        System.out.println("Enter the age");
        age=s.nextInt();

    }


    void printDetails()
    {
        System.out.println("Name "+name);
        System.out.println("Gender "+gender);
        System.out.println("Age " +age);
        System.out.println("Company " +company);

    }


    public static void main(String[] args)
    {
        Employee e=new Employee();// we can also create Array of objects
        e.getDetails();
        e.printDetails();

    }

}
