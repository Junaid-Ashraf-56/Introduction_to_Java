import java.util.Scanner;

public class Activi3 {
    public static void main(String[] args) {
//         Scanner abc = new Scanner(System.in);
//         char[] charchter =  new char[10];
//         int size = 0;
//         int element = charchter[10];
//         char[] unique = new char[size];
//         int counter = 0;
// int i = 0;
//         for( i = 1;i <= 10;i++){
//             System.out.println(" A[ "+i+" ]= ");
//             charchter[i]=abc.next().charAt(0);

//         }
          
//         for( i = 0;i<10;i++){
//             for(int j=0;j<10;j++){
//                if (charchter[i]==charchter[j]) {
//                 counter+=1;
//                }
//             }
//         }

//         System.out.println(charchter[i]+" occurs "+counter+" times ");
//         counter = 0;

        
//         abc.close();


        Scanner abc = new Scanner(System.in);
        char[] charchter = new char[10];
        int[] frequency = new int[10]; 
        boolean[] counted = new boolean[10]; 

        
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter character A[" + i + "] = ");
            charchter[i] = abc.next().charAt(0);
            frequency[i] = 0; 
        }

        for (int i = 0; i < 10; i++) {
            if (!counted[i]) { 
                for (int j = 0; j < 10; j++) {
                    if (charchter[i] == charchter[j]) {
                        frequency[i]++;
                        counted[j] = true; 
                    }
                }
                
                System.out.println(charchter[i] + " occurs " + frequency[i] + " times");
            }
        }

        abc.close();
    }
}

 
