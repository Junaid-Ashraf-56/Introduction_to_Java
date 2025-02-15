import java.util.Random;
import java.util.Scanner;

public class Task7 {

   
    public static void printMatrix(int n) {
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(random.nextInt(2) + " "); 
            }
            System.out.println(); 
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the matrix (n): ");
        int n = scanner.nextInt();

        printMatrix(n); 

        scanner.close();
    }
}


