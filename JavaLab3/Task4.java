import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        int x,y,z;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of x");
        x = input.nextInt();
        System.out.println("Enter the value of y");
        y = input.nextInt();
        System.out.println("Enter the value of z");
        z = input.nextInt();
        if(x<y){System.out.println("Smaller value is "+x);}
        else{System.out.println("Smaller value is "+y); }
        if (x>0){System.out.println("The given number is positive 1"); }
        else if(x<0){ System.out.println("The given number is negative -1");}
        else{  System.out.println("The given number is zero 0"); }
        if(x<y){ if(x<z){ System.out.println("Smaller value is "+x);  }
            else{ System.out.println("Smaller value is "+z);  }}
        else if (y<x){if (y<z){ System.out.println("Smaller value is "+y);}
               else{System.out.println( "Smaller value is "+z);}
        }
        input.close();;

    }
}
