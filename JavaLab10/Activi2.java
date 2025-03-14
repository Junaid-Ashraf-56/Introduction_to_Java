import java.util.Scanner;

public class Activi2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int[][] arr = {{11,12,13},{14,15,16},{17,18,19}};
    System.out.println("The given 2D array is");
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
    System.out.println("The prime number are");
    int n = 0;
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if (isPrime(arr[i][j])==true) {
                System.out.println(arr[i][j]);
                n++;
            }
        }
        System.out.println();
    }
System.out.println("Prime number are"+n);
        sc.close();
    }
    public static boolean isPrime(int n){
       boolean prime = true;
       for (int i = 2; i < n/2; i++) {
        if (n%i==0) {
            prime=false;
            break;
        }
       }
        return prime;
    }
}
