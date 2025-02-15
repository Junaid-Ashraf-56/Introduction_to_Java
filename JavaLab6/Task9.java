import java.util.Scanner;

public class Task9 {

    public static double power(double a, int n) {
        if (n == 0) {
            return 1; 
        } else {
            return a * power(a, n - 1); 
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive real number (a): ");
        double a = scanner.nextDouble();

        System.out.print("Enter a non-negative integer (n): ");
        int n = scanner.nextInt();

        double result = power(a, n);
        System.out.println("Result: " + a + "^" + n + " = " + result);

        scanner.close();
    }
}


