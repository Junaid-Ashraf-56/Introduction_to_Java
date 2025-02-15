import java.util.Scanner;

public class Ativi3 {
    static Scanner console = new Scanner(System.in);
public static void main(String [] args){
double wages, rate, hours;
System.out.print(" Enter the working "+ "hours: "); 
hours = console.nextDouble(); 
System.out.println(); 
System.out.print(" Enter the pay "+ "rate: "); 
rate = console.nextDouble(); 
System.out.println(); 
if (hours > 40.0) {
wages = 40.0 * rate +1.5 * rate * (hours - 40.0);
} 
else{ 
wages = hours * rate; 
System.out.printf(" The wages are $%.2f %n",wages);
} 
System.out.println(); 
}

}
