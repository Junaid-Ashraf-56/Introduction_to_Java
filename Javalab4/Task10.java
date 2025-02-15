import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = input.nextInt();
        
        System.out.print("Enter the first day of the year (0 for Sunday, 1 for Monday, ..., 6 for Saturday): ");
        int firstDay = input.nextInt();

    
        int[] daysInMonth = {31, isLeapYear(year) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September"
        , "October", "November", "December"};

        int dayOfWeek = firstDay;

      
        for (int month = 0; month < 12; month++) {
            System.out.println("         " + months[month] + " " + year);
            System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

            for (int i = 0; i < dayOfWeek; i++) {
                System.out.print("    ");
            }


            for (int day = 1; day <= daysInMonth[month]; day++) {
                System.out.printf("%4d", day);
                dayOfWeek++;
                if (dayOfWeek == 7) {
                    dayOfWeek = 0;
                    System.out.println();
                }
            }
            if (dayOfWeek != 0) {
                System.out.println();
            }
        }
        
        input.close();
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

