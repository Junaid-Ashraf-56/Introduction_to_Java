public class Task1 {
    public static void main(String[] args) {
        int x = 10;
        int y = 15;
        int z = 20;
        boolean one = !(x>10);
        boolean two = x<=5||y<15;
        boolean three = (x!=5)&&(y!=z);
        boolean four = x>=z||(x+y>=z);
        boolean five = (x <= y - 2) && (y >= z) || (z - 2 != 20);
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);
        System.out.println(five);
    }
}
