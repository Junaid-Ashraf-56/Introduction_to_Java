import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter latitude and longitude");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.println("Enter latitude and longitude");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double radius = 6371.01e3;

         x1 = Math.toRadians(x1);
         x2 = Math.toRadians(x2);
         y1 = Math.toRadians(y1);
         y2 = Math.toRadians(y2);

         double total1 = Math.sin(x1)*Math.sin(x2);
         double total2 = Math.cos(x1)*Math.cos(x2)*Math.cos(y2-y1);
         double total3 = total1+total2;
        
         double Distance = radius*Math.acos(total3);
         System.out.println("Distance is "+Distance);

        input.close();
    }
}
