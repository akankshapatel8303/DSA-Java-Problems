public class X_power_n{
    public static int xPown(int x, int n){
        if (n==0){
            return 1;
        }
        int halfPow = xPown(x, n/2) * xPown(x, n/2);

        if(n%2 == 0){
            return halfPow;
        }else{
            return x * halfPow;
        }
    }
    public static void main(String args[]){
        System.out.println(xPown(12, 5));
    }
}