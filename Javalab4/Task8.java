import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        Scanner abc  = new Scanner(System.in);
       int number = 0;
       System.out.println("Enter numbers until 0");
       int previous = abc.nextInt();
       int num = previous;
    while (true) {
        num = abc.nextInt();
      if (num == 0) {
        break;
      }
      if (num>previous) {
        number++;
      }
       previous = num ;
    }
    System.out.println("Greater number are  " + number);
    abc.close();
    }
}
