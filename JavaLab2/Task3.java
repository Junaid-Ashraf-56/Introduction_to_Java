import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner abc = new Scanner(System.in);
        System.out.println("Enter the students of 1 class");
        a = abc.nextInt();
        System.out.println("Enter the students of 2 class");
        b = abc.nextInt();
        System.out.println("Enter the students of 3 class");
        c = abc.nextInt();
        int desk = ((a+b+c)/2)+1;
        System.out.println("Total desk required for yhese classes are  "+desk);
        abc.close();
    }
}
