import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int SECRET = 11;
        double  RATE = 12.50; 
        int num1;
        int num2;
        int newNum;
        String name;
        double hoursWorked;
        double wages;
          System.out.println("Enter num1");
          num1=console.nextInt();
          System.out.println("Enter num2");
          num2=console.nextInt();
          System.out.println("Value of num1 is   " + num1);
          System.out.println("Value of num2 is   "+ num2);
          newNum = (num1*2)+num2;
          System.out.println("Old newNum   "+newNum);
          newNum = newNum + SECRET;
          System.out.println("New newNum    "+newNum);
          System.out.println("Enter lastname");
          name = console.next();
          System.out.println("Enter decimal number between 1 and 10");
          hoursWorked = console.nextDouble();
          wages = hoursWorked*RATE;
          System.out.println("Enter Name" + name);
          System.out.println("Enter Pay Rate"+ RATE);
          System.out.println("Enter HoursWorked" +hoursWorked);
          System.out.println("Enter Salary" + wages);
    
        console.close();
    }
}
