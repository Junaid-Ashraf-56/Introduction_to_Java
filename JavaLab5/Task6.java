import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
         Scanner abc = new Scanner(System.in);
        
            String a = abc.nextLine();
            String[] words = a.split(" ");
            System.out.println(words[1] + " " + words[0]);
    
        abc.close();
    }
}
