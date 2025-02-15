import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print("Enter the first integer: ");
                num1 = Integer.parseInt(scanner.nextLine());

                System.out.print("Enter the second integer: ");
                num2 = Integer.parseInt(scanner.nextLine());

                validInput = true;

            } catch (NumberFormatException e) {
                System.out.println("You have entered an invalid input, type integers only.");
            }
        }

        int sum = num1 + num2;
        System.out.println("The sum of the two integers is: " + sum);
    
    scanner.close();
    }
}
