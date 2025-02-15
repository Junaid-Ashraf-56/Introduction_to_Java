import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
         Scanner abc  = new Scanner(System.in);

    int even = 0;
     System.out.println("Enter numbers until 0");
    while (true) {
    int num = abc.nextInt();
      if (num == 0) {
        break;
      }
      if (num%2==0){
        even +=1;
      }
    }

    System.out.println("Even number  " + even);
    abc.close();
    }
}
