import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        System.out.println("Enter String");
        String s = abc.nextLine();
        int res = countLetters(s);
        System.out.println(res);
        abc.close();
    }
    public static int countLetters(String s){
        int length = 0;
        for(int i = 0;i<s.length();i++){
            if (Character.isLetter(s.charAt(i))) {
                length++;
            }
        }
        return length;
    }
}
