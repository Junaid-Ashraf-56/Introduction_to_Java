import java.util.Arrays;
public class Task3 {
   
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] reversedArray = new int[originalArray.length];
        for (int i = 0; i < originalArray.length; i++) {
            reversedArray[i] = originalArray[originalArray.length - 1 - i];
        }
        System.out.println("Original array: " + Arrays.toString(originalArray));
        System.out.println("Reversed array: " + Arrays.toString(reversedArray));
    }
}

