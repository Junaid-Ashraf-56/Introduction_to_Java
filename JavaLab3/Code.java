import java.util.Scanner;
public class Code {
    
    public static void main(String[] args) {
        int salary;
        int sum = 0;
        char chan = 'y';
        Scanner abc = new Scanner(System.in);
        while (chan == 'y') {
            System.out.println("Enter Your Salary");
            salary = abc.nextInt();
            sum += salary;
            System.out.println("Do you want to add more(y/n)");
            chan = abc.next().charAt(0);
        }
        System.out.println(sum);
    
    abc.close();
    }
}
