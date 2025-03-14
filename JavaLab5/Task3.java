import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        /*
        System.out.println("Enter number between 0 and 15");
        int a = abc.nextInt();
        if (a<=15 && a >=0) {
            if (a<=0&&a>=9) {
                System.out.println("Value is "+a);
            }
            else if(a==10){
                System.out.println("Value "+"A");
            }
            else if(a==11){
                System.out.println("Value "+"B");
            }
            else if(a==12){
                System.out.println("Value "+"C");
            }
            else if(a==13){
                System.out.println("Value "+"D");
            }
            else if(a==14){
                System.out.println("Value "+"E");
            }
            else if(a==15){
                System.out.println("Value "+"F");
            }
        }
        else{
            System.out.println("Invalid number");
        }
            */
            System.out.println("Enter number in Hexadecimal");
            char b = abc.next().charAt(0);
            switch (b) {
                case 'A':
                    System.out.println("1010");
                    break;
                    case 'B':
                    System.out.println("1011");
                    break;
                    case 'C':
                    System.out.println("1100");
                    break;
                    case 'D':
                    System.out.println("1101");
                    break;
                    case 'E':
                    System.out.println("1110");
                    break;
                    case 'F':
                    System.out.println("1111");
                    break;
                default:
                System.out.println("invalid number ");
                    break;
            }

        abc.close();
    }
}
