
public class Pract1{
   public static void main(String[] args) {
      int n = 5;
      for(int i = 1; i <= n; i++)
      {
          for(int j = n;j > i; j--)
          {
            System.out.print(" ");
          }
          for(int k = 1;k<=i*2;k++)
          {
            System.out.print("*");
          }
          System.out.println();
    }
      for(int i = n - 1; i >= 1; i--) {
          // Print spaces
          for(int j = n; j > i; j--) {
              System.out.print(" ");
          }
          // Print stars
          for(int k = 1; k <= i*2; k++) {
              System.out.print("*");
          }
          System.out.println();
      }
   }
}
