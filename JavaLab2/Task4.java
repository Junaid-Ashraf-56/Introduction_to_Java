import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int N;
        Scanner abc = new Scanner(System.in);
        System.out.print("Enter the number of minutes");
        N = abc.nextInt();
        int hours = N/60;
        int minutes = N%60;
        System.out.println(" The number of hours are "  +hours);
        System.out.print(" The number of minutes are "  +minutes);
        abc.close();;
    }
}
