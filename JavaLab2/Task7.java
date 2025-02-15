import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int priceA = 20;
        int priceB = 15;
        int priceC = 10;
        int priceD = 5;
        System.out.print("Enter the number of Class A tickets sold: ");
        int ticketsA = scanner.nextInt();
        System.out.print("Enter the number of Class B tickets sold: ");
        int ticketsB = scanner.nextInt();
        System.out.print("Enter the number of Class C tickets sold: ");
        int ticketsC = scanner.nextInt();
        System.out.print("Enter the number of Class D tickets sold: ");
        int ticketsD = scanner.nextInt();
        int incomeA = ticketsA * priceA;
        int incomeB = ticketsB * priceB;
        int incomeC = ticketsC * priceC;
        int incomeD = ticketsD * priceD;
        int totalIncome = incomeA + incomeB + incomeC + incomeD;
        System.out.println("Income from Class A tickets: $" + incomeA);
        System.out.println("Income from Class B tickets: $" + incomeB);
        System.out.println("Income from Class C tickets: $" + incomeC);
        System.out.println("Income from Class D tickets: $" + incomeD);
        System.out.println("Total income generated: $" + totalIncome);
        scanner.close();
    }
}



