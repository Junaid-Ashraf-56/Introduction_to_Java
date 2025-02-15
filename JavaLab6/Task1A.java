import java.util.Scanner;

public class Task1A {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = abc.nextInt(); 
        doubleSum(a);

        abc.close();
    }
    public static void doubleSum(int a){
              int n1 = a;
              int sum = 0;
              while (true) {
                if (n1==0) {
                    break;
                }
                int rem = n1%10;
                 n1 = n1/10;
                  sum += rem;
              }
              System.out.println("Sum is "+sum);
    }
}
