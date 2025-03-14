import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
         Scanner abc  = new Scanner(System.in);
    int length = 0;

    while (true) {
      int num = abc.nextInt();
      if (num == 0) {
        break;
      }
      length++;
    }

    System.out.println("Length of the sequence: " + length);
    abc.close();
  }
    }

