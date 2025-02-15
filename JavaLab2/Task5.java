import java.util.Scanner;

public class Task5 {
        public static void main(String[] args) {
            Scanner abc = new Scanner(System.in);
            System.out.println("Enter the amount of milk in liters");
            double milk = abc.nextDouble();
            double carton = Math.ceil(milk / 3.78);
            System.out.println("The number of cartons required: " + carton);
            double cost = milk * 0.38;
            System.out.printf("The cost of producing milk per liter: $%.2f%n", cost);
            double profit = carton * 0.27;
            System.out.printf("The profit of milk per carton is: $%.2f%n", profit);
            abc.close();
        }
    }
    

