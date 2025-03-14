import java.util.Scanner;
public class Task1 {
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
    int max2 = 0;
for (int i = 0; i < 3; i++) {
    int row = 0;
    for (int j = 0; j < 4; j++) {
        row+=arr[i][j];
        if (row>max2) {
            max2=row;
        }
    }
}
System.out.println("Greater Sum in row "+max2);
int max1 = 0;
for (int j = 0; j < 4; j++) {
    int column = 0;
     max1 = 0;
    for (int i = 0; i < 3; i++) {
        column+=arr[i][j];
        if (column>max1) {
            max1=column;
        }
    }
}
System.out.println("Greater Sum in Column "+max1);
sc.close();
} 
}
