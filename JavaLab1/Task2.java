import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
int width;
int area;
int perimeter;
int length;

System.out.print("Enter the length: ");
length = console.nextInt();
System.out.println(length);

System.out.print("Enter the width: ");
width = console.nextInt();
System.out.println(width);
area = length * width;
System.out.println("Area = " + area);
perimeter = 2 * (length + width);
System.out.println("Perimeter = " + perimeter);
console.close();
    }
}
