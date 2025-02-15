import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
       /*1.  int a,b;
        System.out.println("Enter number A");
        a = abc.nextInt();
        System.out.println("Enter number B");
        b = abc.nextInt();
        if (a < b) 
        {
            System.out.println("In Ascending order");
            for (int i = a; i <= b; i++) {
              System.out.println(i);
            }
          } else {
            System.out.println("In Descending order");
            for (int i = b; i >= a; i--) {
              System.out.println(i);
            }
          }
            */
            /*
           System.out.println("Enter the value of N");
          int N;
          int sum = 0;
          N = abc.nextInt();
          for(int i = sum;i<=N;i++){
            sum +=abc.nextInt();
          }
          System.out.println("Sum is "+ sum);
        */
    
        System.out.println("Enter the value of N");
        int N;
        int sum = 0;
        N = abc.nextInt();
       for(int i = 0;i<=N;i++){
        sum += i*i*i;
       }
       System.out.println("Sum is "+ sum);
        abc.close(); 

    }
}
    
