 import java.util.Scanner;

public class Task8 {

    public static int countVowels(String s) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        
        for (int i = 0; i < s.length(); i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) {
                count++;
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        int vowelCount = countVowels(inputString);
        System.out.println("Number of vowels: " + vowelCount);

        scanner.close();
    }
}


