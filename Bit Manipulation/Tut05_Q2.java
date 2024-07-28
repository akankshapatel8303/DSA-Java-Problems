public class Tut05_Q2 {
    public static void swap(int x, int y){
        System.out.println("Before: x = "+x+", b = "+y);
        x = x^y;
        y = x^y;
        x = x^y;
        System.out.println("After: x = "+x+", b = "+y);
    }
    public static void main(String[] args) {
        swap(8, 10);
    }
}
