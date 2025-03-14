public class Task4 {
    public static void main(String[] args) {
        int b = (int)(Math.random()*26);
        char a = (char)(b+'a');
        a = Character.toUpperCase(a);
       System.out.print(a);
    }
}
