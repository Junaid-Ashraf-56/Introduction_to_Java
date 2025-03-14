
import java.util.Scanner;
public class Task2 {
    
        public static void main(String[] args) {
            Scanner abc = new Scanner(System.in);
            System.out.println("Enter the value of N");
            int N;
            int sum = 1;
            N = abc.nextInt();
            for(int i = N;i>=1;i--){
            sum *= i;
            }
            System.out.println("Multiple is "+ sum);
            abc.close(); 
            
          }

    }

