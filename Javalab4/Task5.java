import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
         Scanner abc  = new Scanner(System.in);
    int length = 0;
System.out.println("Enter numbers until 0");
    while (true) {
      int num = abc.nextInt();
      if (num == 0) {
        break;
      }
      else if (num>length){
        length = num;
      }
    }
    System.out.println("Greatest number  " + length);
    abc.close();
    }
}
