import java.util.Scanner;
public class Task2 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int[][] arr = new int[3][4];
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 4; j++) {
            arr[i][j] = sc.nextInt();
        }
        System.out.println();
    }
    System.out.println("The given 2D array is");
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 4; j++) {
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
    System.out.println("The prime number in row  are");
    for (int i = 0; i < 3; i++) {
        int max = 0;
        for (int j = 0; j < 4; j++) {
            if (isPrime(arr[i][j])==true) {
              
            }
        if (max<arr[i][j]) {
            max=arr[i][j];
        }
        }
        System.out.println("Prime number in row  "+max);
    }
    System.out.println("The prime number in column  are");
    for (int j = 0; j < 4; j++) {
        int max = 0;
        for (int i = 0; i < 3; i++) {
            if (isPrime(arr[i][j])==true) {         
            }
        if (max<arr[i][j]) {
            max=arr[i][j];
        }
        }
        System.out.println("Prime number in column  "+max);
    }
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
