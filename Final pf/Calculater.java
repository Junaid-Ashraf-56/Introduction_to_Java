import java.util.Scanner;

public class Calculater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number");
        int a =sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter opertion");
        String sign = sc.nextLine();
        calculater(a,b,sign);
    }
    public static void calculater(int a,int b,String sign){
        switch (sign) {
            case "+" -> System.out.println(a + b);
            case "-" -> System.out.println(a - b);
            case "*" -> System.out.println(a * b);
            case "/" -> {
                if (b != 0) {
                    System.out.println(a / b);
                } else {
                    System.out.println("B cannot be 0");
                }
            }
            default -> System.out.println("Invalid operation");
        }
    }
}
