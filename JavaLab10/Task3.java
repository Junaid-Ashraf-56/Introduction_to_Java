import java.util.Scanner;;
public class Task3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix1 = new int[3][4];
        int[][] matrix2 = new int[4][3];
        System.out.println("Enter values for a 3x4 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter values for a 4x3 matrix:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }
        int[][] result = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 4; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        System.out.println("Resultant Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}


