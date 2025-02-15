import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the price of the item: ");
        double price = input.nextDouble();

        System.out.print("Enter the sales tax rate (as a percentage): ");
        double taxRate = input.nextDouble();

        double salesTax = price * (taxRate / 100);

        double totalPrice = price + salesTax;

        System.out.printf("Sales tax:"+ salesTax);
        System.out.printf("Total price (including tax):"+ totalPrice);
        input.close();
    }
}
