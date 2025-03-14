import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /* 
        System.out.println("Enter the ASCII");
        char a = input.next().charAt(0);
        int b = a;
        System.out.println("ASCII is "+b);
        */
        System.out.println("Enter number ");
        int a = input.nextInt();
        char b = (char)a;
        System.out.println("ASCII is "+b); 
        input.close();
    }
}
