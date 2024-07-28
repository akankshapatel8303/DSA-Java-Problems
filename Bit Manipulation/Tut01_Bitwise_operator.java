public class Tut01_Bitwise_operator {
    public static int binaryAnd(int a, int b){
        return a&b;
    }

    public static int binaryOr(int a, int b){
        return a|b;
    }

    public static int binaryXOR(int a, int b){
        return a^b;
    }

    public static int binaryOnesComp(int n){
        return ~n;
    }
    
    public static int binaryLeftShift(int n, int r){
        return n<<r;
    }

    public static int binaryRightShift(int n, int r){
        return n>>r;
    }
    public static void main(String args[]){
        System.out.println("a&b  = "+binaryAnd(5, 6));
        System.out.println("a|b = "+binaryOr(5, 6));
        System.out.println("a^b = "+binaryXOR(5, 6));
        System.out.println("~n = "+binaryOnesComp(0));
        System.out.println("n<<r = "+binaryLeftShift(6, 2));
        System.out.println(("n>>r = "+binaryRightShift(6, 2)));
    }
}
