import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        System.out.println("Enter string");
        String a = abc.nextLine();
        int b = a.length();
        String c = ""; 

        for(int i = b-1; i >= 0; i--){ 
            c += a.charAt(i);
        }

        if(a.equalsIgnoreCase(c)){ 
            System.out.print("Palindrome");
        } else{
            System.out.println("not Palindrome");
        }
        abc.close();
    }
}