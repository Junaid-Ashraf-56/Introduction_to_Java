import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number a from 1 to 10");
        a = input.nextInt();
        switch (a) {
            case 1:
                System.out.println("i");
                break;
            case 2:
                System.out.println("ii");
                break;    
            case 3:
                System.out.println("iii");
                break;
            case 4:
                System.out.println("iv");
                break;
            case 5:
                System.out.println("v");
                break;
            case 6:
                System.out.println("vi");
                break;
            case 7:
                System.out.println("vii");
                break;
            case 8:
                System.out.println("viii");
                break;
            case 9:
                System.out.println("ix");
                break;

            default:
                break;
        }
        input.close();
    }
}
