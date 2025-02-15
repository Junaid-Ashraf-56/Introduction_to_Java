import java.util.Scanner;
public class Task6 {
  public static void main(String[] args) {
    Scanner abc = new Scanner(System.in);
    int maxIndex = 0;
    int maxValue = 0;
    int index = 1;
    while (true) {
      int num = abc.nextInt();
      if (num == 0) {
        break;
      }
      if (num > maxValue) {
        maxIndex = index;
      }
      index++;
    }
    System.out.println("Index of the largest element: " + maxIndex);
    abc.close();
}
}
