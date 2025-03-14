import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        System.out.println("Enter any word");
        String a = abc.nextLine();
        int b = a.length();
        for(int i = 0;i< b;i++){
            if (a.charAt(i)=='f') {
            System.out.println("index "+i);
            }
        }
        abc.close();
    }
}
