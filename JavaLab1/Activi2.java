import java.util.Scanner;

public class Activi2 
{
 public static void main(String[] args)
 {
    Scanner abc = new Scanner(System.in);
    int height ;
    int width ;
    System.out.println("Enter Height =");
    height = abc.nextInt();
    System.out.println(" Enter Width = " );
    width =abc.nextInt();
    System.out.println("Height =" + height);
    System.out.println("Width = " +  width);
    abc.close();
 }    
}
