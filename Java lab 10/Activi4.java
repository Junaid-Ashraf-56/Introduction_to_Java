import java.util.Scanner;

public class Activi4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Array is");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
               if(i==j){
                sum+=matrix[i][j];
               }
            }
        }
        System.out.println("Sum "+sum);

        sc.close();
    }
}
