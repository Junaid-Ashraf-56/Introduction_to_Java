import java.util.Scanner;
public class  Main {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
         int a;
         System.out.print(" Enter Your marks");
         a = abc.nextInt();
         if (a>=80) {
            System.out.print("A");
         }
         else if(a>=70){
            System.out.print("B");
         }
         else if(a>=60){
            System.out.print("C");
         }
         else if(a>=50){
            System.out.print("D");
         }
         else {
        System.out.print(" Mannan bhosdi wala");
         }
         abc.close();
    }
}
