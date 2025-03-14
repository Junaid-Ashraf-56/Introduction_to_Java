import java.util.Arrays;
public class Task2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        modify(array);
      System.out.println("Modified array: " + Arrays.toString(array));
    }
    public static void modify(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 3;
        }
    }
}


