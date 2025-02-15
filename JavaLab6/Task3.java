import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        System.out.println("Enter 3 number");
        double num1 = abc.nextDouble();
        double num2 = abc.nextDouble();
        double num3 = abc.nextDouble();
        
        displaySortedNumbers(num1, num2, num3);
        abc.close();
    }      
            public static void displaySortedNumbers(double num1, double num2, double num3) {
                if (num1 < num2 && num1 < num3) {
                    if (num2 < num3) {
                        System.out.println(num1 + " " + num2 + " " + num3);
                    } else {
                        System.out.println(num1 + " " + num3 + " " + num2);
                    }
                } else if (num2 < num1 && num2 < num3) {
                    if (num1 < num3) {
                        System.out.println(num2 + " " + num1 + " " + num3);
                    } else {
                        System.out.println(num2 + " " + num3 + " " + num1);
                    }
                } else {
                    if (num1 < num2) {
                        System.out.println(num3 + " " + num1 + " " + num2);
                    } else {
                        System.out.println(num3 + " " + num2 + " " + num1);
                    }
                }
            }
        }
