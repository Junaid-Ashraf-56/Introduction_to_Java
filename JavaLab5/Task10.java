import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
                Scanner abc = new Scanner(System.in);
                //   String a = abc.nextLine();
                //   System.out.println("Third char "+a.charAt(3));
                //   System.out.println("Secon to last "+a.substring(2));
                //   System.out.println("First five "+a.substring(0,5));
                //   System.out.println("Last 2 "+a.substring(0,a.length()-2));
                //   for(int i = 0;i<=a.length();i++){
                //     if (i%2==0) {
                //         System.out.println(a.charAt(i));
                //     }
                //   }
                //   for(int i = 1;i<=a.length();i++){
                //     if (i%2!=0) {
                //         System.out.println(a.charAt(i));
                //     }
                //   }
                //   for(int i =a.length();i>=0;i--){
                //         System.out.println(a.charAt(i));
                //   }
                //   for(int i = a.length();i>=0;i-=2){
                //         System.out.println(a.charAt(i));
                //   }
                //   int res = a.length();
                //  System.out.println("Length "+res);
            
                        System.out.print("Enter a string: ");
                        String a = abc.nextLine();
                        if (a.length() > 2) {
                            System.out.println("Third char: " + a.charAt(2));
                        } else {
                            System.out.println("The string is too short for the third character.");
                        }
                        if (a.length() > 1) {
                            System.out.println("Second to last char: " + a.charAt(a.length() - 2));
                        } else {
                            System.out.println("The string is too short for the second to last character.");
                        }                
                        if (a.length() >= 5) {
                            System.out.println("First five chars: " + a.substring(0, 5));
                        } else {
                            System.out.println("The string is too short for the first five characters.");
                        }                
                        if (a.length() > 2) {
                            System.out.println("All but the last two chars: " + a.substring(0, a.length() - 2));
                        } else {
                            System.out.println("The string is too short to remove the last two characters.");
                        }                
                        System.out.print("Even index chars: ");
                        for (int i = 0; i < a.length(); i += 2) {
                            System.out.print(a.charAt(i));
                        }
                        System.out.println();                
                        System.out.print("Odd index chars: ");
                        for (int i = 1; i < a.length(); i += 2) {
                            System.out.print(a.charAt(i));
                        }
                        System.out.println();
                        System.out.print("Chars in reverse order: ");
                        for (int i = a.length() - 1; i >= 0; i--) {
                            System.out.print(a.charAt(i));
                        }
                        System.out.println();
                        System.out.print("Every second char in reverse: ");
                        for (int i = a.length() - 1; i >= 0; i -= 2) {
                            System.out.print(a.charAt(i));
                        }
                        System.out.println();               
                        System.out.println("Length: " + a.length());
                              abc.close();
    }
}
