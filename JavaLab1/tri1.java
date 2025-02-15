import java.util.Scanner;
public class tri1 {
public static void main(String[] args) {
Scanner abc = new Scanner(System.in);
System.out.print("Enter purchase amount: ");
double purchaseAmount = abc.nextDouble();
double tax = purchaseAmount * 0.06;
System.out.println("Sales tax is $" + (int)(tax * 100) / 
100.0);
abc.close();
}
}