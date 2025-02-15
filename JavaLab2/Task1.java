import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an amount (e.g., 11.56): ");
        double amount = scanner.nextDouble();
        int totalCents = (int) (amount * 100);
        int dollars = totalCents / 100;
        int remainingCents = totalCents % 100;
        int quarters = remainingCents / 25;
        remainingCents %= 25;
        int dimes = remainingCents / 10;
        remainingCents %= 10;
        int nickels = remainingCents / 5;
        remainingCents %= 5;
        int pennies = remainingCents;
        System.out.println("Change breakdown:");
        System.out.println("Dollars: " + dollars);
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies: " + pennies);

        scanner.close();
    }
}
