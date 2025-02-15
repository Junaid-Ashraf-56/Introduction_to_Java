import java.util.Scanner;
public class Task2 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            boolean validInput = false;
            while (!validInput) {
                try {
                    System.out.print("Enter an integer for position " + i + ": ");
                    array[i] = Integer.parseInt(scanner.nextLine());
                    validInput = true; 
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input, please enter an integer.");
                }
            }
        }
        boolean validIndex = false;
        while (!validIndex) {
            try {
                System.out.print("Enter an index to retrieve the value: ");
                index = Integer.parseInt(scanner.nextLine());
                System.out.println("Value at index " + index + ": " + array[index]);
                validIndex = true; 
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter an integer.");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid index, please enter an index between 0 and 9.");
            }
        }
        scanner.close();
    }
}

