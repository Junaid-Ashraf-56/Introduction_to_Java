import java.util.Scanner;

public class Activi5 {
public static void main(String[] args) {
    Scanner abc = new Scanner(System.in);
int number, sum = 0, count;
for (count = 0; count < 5; count++) {
System.out.print("Enter number smaller than 5 \n");
number = abc.nextInt();
sum += number;
}
System.out.println("sum is " + sum);
 abc.close();
}
}
