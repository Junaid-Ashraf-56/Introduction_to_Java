import java.util.Scanner;
public class Task6 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your hourly pay rate: ");
        double payRate = scanner.nextDouble();
        System.out.print("Enter the number of hours worked each week: ");
        double hoursPerWeek = scanner.nextDouble();
        int weeks = 5;
        double taxRate = 0.14;
        double clothesAndAccessoriesRate = 0.10;
        double schoolSuppliesRate = 0.01;
        double savingsBondsRate = 0.25;
        double parentsSavingsBondsRate = 0.50;
        double totalHours = hoursPerWeek * weeks;
        double grossIncome = totalHours * payRate;
        double taxAmount = grossIncome * taxRate;
        double netIncome = grossIncome - taxAmount;
        double clothesAndAccessories = netIncome * clothesAndAccessoriesRate;
        double schoolSupplies = netIncome * schoolSuppliesRate;
        double remainingIncomeAfterExpenses = netIncome - (clothesAndAccessories + schoolSupplies);
        double savingsBonds = remainingIncomeAfterExpenses * savingsBondsRate;
        double parentsContribution = savingsBonds * parentsSavingsBondsRate;
        System.out.printf("Your income before taxes: $%.2f%n", grossIncome);
        System.out.printf("Your income after taxes: $%.2f%n", netIncome);
        System.out.printf("Money spent on clothes and accessories: $%.2f%n", clothesAndAccessories);
        System.out.printf("Money spent on school supplies: $%.2f%n", schoolSupplies);
        System.out.printf("Money spent on savings bonds: $%.2f%n", savingsBonds);
        System.out.printf("Money your parents spend on additional savings bonds: $%.2f%n", parentsContribution);
        scanner.close();
    }
}

