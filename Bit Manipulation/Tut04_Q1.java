public class Tut04_Q1{
    public static void square(int n, int a){
        int ans = 1;
        while (n>0) {
            if((n&1) != 0){
                ans = ans*a;
            }
            a = a*a;
            n = n>>1;
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        square(2, 5);
    }
}