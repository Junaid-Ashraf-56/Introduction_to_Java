import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        int month,day,year;
          Scanner input = new Scanner(System.in);
        System.out.println("Enter the day ");
        day = input.nextInt();
        System.out.println("Enter the month ");
        month = input.nextInt();
        System.out.println("Enter the year ");
        year = input.nextInt();
        if(day*month==year){
            System.out.println("magic date ");
        }
        else{
            System.out.println("not magic date ");
        }
        input.close();
    }
}
