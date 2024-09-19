public class Grid_Ways_Math_Trick {
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        return n*fact(n-1);
    }

    public static int gridWays(int n, int m){
        int ans = fact(n-1+m-1)/(fact(n-1)*fact(m-1));
        return ans;
    }
    public static void main(String[] args) {
        int n=3, m=3;
        System.out.println(gridWays(n, m));
    }
}
