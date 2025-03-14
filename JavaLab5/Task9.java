import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        
       
        int firstH = str.indexOf('h');
        int lastH = str.lastIndexOf('h');
        
     
        StringBuilder result = new StringBuilder(str);
        

        for (int i = firstH + 1; i < lastH; i++) {
            if (str.charAt(i) == 'h') {
                result.setCharAt(i, 'H');
            }
        }
        

        String finalResult = result.toString();
        
        System.out.println("Result: " + finalResult);
        input.close();
    }
}

