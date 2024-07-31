public class PrintNum_inDecreasing_order {
    public static void printDec(int n){
        if (n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        printDec(n-1);
    }
    public static void main(String[] args) {
        printDec(5);
    }
}
