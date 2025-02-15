import java.util.Scanner;

public class Activi2 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        int[] a = new int[5];
        for(int i = 0;i<5;i++){
             a[i] =abc.nextInt();
        }
        System.out.println("Sum of array  "+Sum(a));
        abc.close();
    }
    static int Sum(int[] arr) {
        int s = 0;
        for (int i = 0; i < arr.length; i++) 
        { 
            s += arr[i]; 
        }
          
        return s;
    }
}
