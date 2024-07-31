public class Fibonacci {
    public static int fibonacci(int n){
        if(n==1 || n==0){
            return n;
        }else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
    // or 
    public static int fibonacci1(int n){
        if(n==0 || n==1){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String[] args) {
        System.out.println("fibonacci series:");
        int n = 7;
        for(int i=0; i<n; i++){
            System.out.println(fibonacci(i) + " ");
        }
    }
}
