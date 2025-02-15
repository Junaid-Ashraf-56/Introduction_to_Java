import java.util.Scanner;

public class Activi3 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        String firstName;
        String lastName;
        int age;
        double weight;

        System.out.println("Enter first name, last name, age, and weight separated by spaces:");
        firstName = abc.next();
        lastName = abc.next();
        age = abc.nextInt();
        weight = abc.nextDouble();

        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
        abc.close();
    }
}
