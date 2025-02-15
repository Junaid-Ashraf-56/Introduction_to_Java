import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 1000: ");
        int userInput = scanner.nextInt();
        int digit1 = userInput / 100;
        int digit2 = (userInput / 10) % 10;
        int digit3 = userInput % 10;
        int digitSum = digit1 + digit2 + digit3;
        System.out.println("The sum of the digits is " + digitSum);
        scanner.close();
    }
}

    
