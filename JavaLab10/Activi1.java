
import java.util.Scanner;

public class Activi1 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[][] arr = new int[3][4];
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 4; j++) {
            arr[i][j] = sc.nextInt();
        }
    }
System.out.println("Array are");
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 4; j++) {
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }


for (int i = 0; i < 3; i++) {
    int sum = 0;
    for (int j = 0; j < 4; j++) {
        sum+=arr[i][j];
    }
    System.out.println("Sum of array "+sum);
   
}
sc.close();
}    
}