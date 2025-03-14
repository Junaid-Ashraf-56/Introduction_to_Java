import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rollNumber;
        String name;
        int marks;
        int maxMarks = Integer.MIN_VALUE;
        String topStudent = "";
        int topStudentRollNumber = 0;
        while (true) {
            System.out.print("Enter roll number (0 to stop): ");
            rollNumber = scanner.nextInt();
            if (rollNumber == 0) {
                break;
            }
            scanner.nextLine();  
            System.out.print("Enter name: ");
            name = scanner.nextLine();
            System.out.print("Enter marks: ");
            marks = scanner.nextInt();
            if (marks > maxMarks) {
                maxMarks = marks;
                topStudent = name;
                topStudentRollNumber = rollNumber;
            }
        }
        scanner.close();
        if (topStudentRollNumber != 0) {
            System.out.println("The student with roll number " + topStudentRollNumber + " named " + topStudent + " has the maximum marks of " + maxMarks);
        } else {
            System.out.println("No student records were entered.");
        }
    }
}
