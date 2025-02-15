import java.util.Scanner;;
public class Task2 {
    public static void main(String[] args) {
            Scanner abc = new Scanner(System.in);
            System.out.println("Enter a number");
            int number = abc.nextInt(); 
           reverse(number);
    
            abc.close();
        }
    
        public static void reverse(int number){
                  int n1 = number;
                  int Reverse = 0;
                  while (n1>0) {
                    int rem = n1%10;
                      Reverse = Reverse * 10+rem;
                  n1/=10;
                  }
                 if (Reverse==number) {
                    System.out.println("Palindrome number");
                 }
                 else{
                    System.out.println("Not palindrome ");
                 }
        }
    
}
