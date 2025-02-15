import java.util.Scanner;
public class Task3{
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
     System.out.println("Enter 6 numbers for N");
     int n;
     int sum =  0;
     for(int i = 1; i<= 6;i++){
        n = abc.nextInt();
        if(n==0){
         sum += 1;
        }
     }
     System.out.println("Total zeros are "+sum);
     abc.close();
    }
}