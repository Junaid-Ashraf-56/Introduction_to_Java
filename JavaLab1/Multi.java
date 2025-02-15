import java.util.Scanner;

public class Multi
{
 public static void main( String[] args)
 {
    Scanner myobj = new Scanner(System.in);
   int a,b;
   System.out.print("Enter the value of a");
    a = myobj .nextInt();
    System.out.print("Enter the value of b");
    b = myobj .nextInt();
    a = a^b;
    b = a^b;
    a = b^a;
    
    System.out.println(a);
    System.out.print(b);
myobj.close();
 }
}
