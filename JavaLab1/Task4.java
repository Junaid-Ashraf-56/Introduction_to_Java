import java.util.Scanner;

public class Task4 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter hours worked: ");
        double hoursWorked = input.nextDouble();

        System.out.print("Enter hourly wage: ");
        double hourlyRate = input.nextDouble();

        double totalPay = hoursWorked * hourlyRate;

        System.out.printf("Total pay: " + totalPay);
        input.close();
    }
}
