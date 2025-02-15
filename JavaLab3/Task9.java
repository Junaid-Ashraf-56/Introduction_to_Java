import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

    System.out.println("Welcome to the Change Counting Game!");

    System.out.print("Enter the number of pennies: ");
    int pennies = scanner.nextInt();
    System.out.print("Enter the number of nickels: ");
    int nickels = scanner.nextInt();
    System.out.print("Enter the number of dimes: ");
    int dimes = scanner.nextInt();
    System.out.print("Enter the number of quarters: ");
    int quarters = scanner.nextInt();

   
    double totalValue = pennies * 0.01 + nickels * 0.05 + dimes * 0.10 + quarters * 0.25;

    if (totalValue == 1.00) {
      System.out.println("Congratulations! You won the game!");
    } else if (totalValue < 1.00) {
      System.out.println("Sorry, the amount you entered was less than one dollar.");
    } else {
      System.out.println("Sorry, the amount you entered was more than one dollar.");
    }

    scanner.close();
    }
}
