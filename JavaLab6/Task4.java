public class Task4 {
    public static void main(String[] args) {
        int year ;
        for ( year = 2000 ; year <= 2020; year++) { 
            System.out.println("Year " + year + ": " + numberOfDaysInAYear(year) + " days"); 
        }
    }
    public static int numberOfDaysInAYear(int year){     
    
         if ((year%4==0&&year%100!=0)||(year%400==0)) {
            return 366;
         }
         else{
            return 365;
         }
    }

}