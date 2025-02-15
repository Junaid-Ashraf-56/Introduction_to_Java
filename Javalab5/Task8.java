import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        int firstH = str.indexOf('h');
        int lastH = str.lastIndexOf('h');
        String result = str.substring(0, firstH) + str.substring(lastH + 1);
        System.out.println("Result: " + result);
        input.close();
    }
}
