import java.util.Scanner;
public class Activi1 {
public static void main(String[] args) 
  {
    Scanner abc = new Scanner(System.in);
    System.out.println("Enter numbers");
    int[] a = new int[10];
    for(int i = 0 ;i<10;i++){
      a[i] = abc.nextInt();
    }
    int largest = a[0];
    for(int i=0;i<10;i++){
        if (a[i]>largest) {
            largest=a[i];
        }
    }
    int largest2;
    if (a[0]==largest) {
        largest2=a[1];
    }
    else{
        largest2 = a[0];
    }
    for(int i = 0;i<10;i++){
        if (a[i]!=largest) {
            if (a[i]>largest2) {
                largest2 = a[i];
            }
        }
    }
    System.out.println("Largest number "+largest);
    System.out.println("Second Largest number "+largest2);

    abc.close();  
  }
    
} 