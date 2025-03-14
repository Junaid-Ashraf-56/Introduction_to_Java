
    import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double balance = 1000.00; // Initial account balance
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nATM Menu");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your current balance is: $" + balance);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount > balance) {
                        System.out.println("Insufficient funds.");
                    } else if (withdrawAmount <= 0) {
                        System.out.println("Invalid withdrawal amount.");
                    } else {
                        balance -= withdrawAmount;
                        System.out.println("Withdrawal successful. New balance: $" + balance);
                    }
                    break;
                case 3:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    if (depositAmount <= 0) {
                        System.out.println("Invalid deposit amount.");
                    } else {
                        balance += depositAmount;
                        System.out.println("Deposit successful. New balance: $" + balance);
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM.");
                    break;
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}

