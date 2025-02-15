import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("For the first rectangle ");
        int a,b,c;
        System.out.println("Enter the value of a ");
        a = input.nextInt();
        System.out.println("Enter the value of b");
        b = input.nextInt();
        c =a*b;
        System.out.println("For the Second rectangle ");
        int x,y,z;
        System.out.println("Enter the value of x ");
        x = input.nextInt();
        System.out.println("Enter the value of y");
        y = input.nextInt();
        z =x*y;
        if(c>z){
            System.out.println("First rectangle has larger area");
        }
        else{
            System.out.println("Second rectangle has larger area");
        }
        input.close();

    }
}
