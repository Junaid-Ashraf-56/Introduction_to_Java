import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number of books purchased this month: ");
    int booksPurchased = scanner.nextInt();

    int points = 0;

    if (booksPurchased == 0) {
      points = 0;
    } else if (booksPurchased == 1) {
      points = 5;
    } else if (booksPurchased == 2) {
      points = 15;
    } else if (booksPurchased == 3) {
      points = 30;
    } else if (booksPurchased >= 4) {
      points = 60;
    }

    System.out.println("You have earned " + points + " points this month!");

    scanner.close();
    }
}
