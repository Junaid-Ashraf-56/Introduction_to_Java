import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class Student {
    int rollNumber;
    String name;
    int marks;
    Student(int rollNumber, String name, int marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
    }
}
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        while (true) {
            System.out.print("Enter roll number (0 to stop): ");
            int rollNumber = scanner.nextInt();
            if (rollNumber == 0) break;
            scanner.nextLine(); 
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            System.out.print("Enter marks: ");
            int marks = scanner.nextInt();
            students.add(new Student(rollNumber, name, marks));
        }
        Collections.sort(students, (s1, s2) -> s2.marks - s1.marks);
        System.out.println("\nStudents sorted by marks in descending order:");
        for (Student student : students) {
            System.out.println("Roll Number: " + student.rollNumber + ", Name: " + student.name + ", Marks: " + student.marks);
        }
        scanner.close();
    }
}

