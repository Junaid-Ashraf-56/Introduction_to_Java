import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of a");
        a = input.nextInt();
        System.out.println("Enter the value of b");
        b = input.nextInt();
        System.out.println("Enter the value of c");
        c = input.nextInt();
        if(a==b&&b==c&&a==c){
          System.out.println("3");
        }
        else if(a==b||b==c||a==c){
            System.out.println("2");
        } 
        else {
            System.out.println("0");
        }
        input.close();
    }
}
