import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int result = factorial(a);
        System.out.println(result);
        sc.close();
    }
    public static int  factorial(int a){
        int product = 1;
        for (int i = 1; i <=a; i++) {
            product*=i;
        }
        return (product);
    }
}
