import java.util.Scanner;
public class Task6 {
    public static String capitalize(String lower_case_word) {
        if (lower_case_word == null || lower_case_word.length() == 0) {
            return lower_case_word;
        }
        return lower_case_word.substring(0, 1).toUpperCase() + lower_case_word.substring(1);
    }
    public static String capitalizeLine(String line) {
        String[] words = line.split(" ");
        StringBuilder capitalizedLine = new StringBuilder();

        for (String word : words) {
            capitalizedLine.append(capitalize(word)).append(" ");
        }

        return capitalizedLine.toString().trim();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a line of lowercase ASCII words:");
        String line = scanner.nextLine();

        String result = capitalizeLine(line);
        System.out.println("Capitalized line: " + result);
        scanner.close();
    }
}

   
