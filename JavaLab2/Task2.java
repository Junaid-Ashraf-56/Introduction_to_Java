import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        double N,M;
        Scanner abc = new Scanner(System.in);
      System.out.println("Enter the number of apples for distribution");
      N = abc.nextDouble();
      System.out.println("Enter the number of Students");
      M = abc.nextDouble();
      double dis = N/M;
      System.out.println("Number of apple which distributes in Students are  " + dis);
      double rem = N%M;
      System.out.println("Number of apple which are remaining  " + rem);
      abc.close();
    }
}
