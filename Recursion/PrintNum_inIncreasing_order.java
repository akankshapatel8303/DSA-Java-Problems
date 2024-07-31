public class PrintNum_inIncreasing_order {
    public static void printInc(int n){
        if (n==1){
            System.out.println(1);
            return;
        }
        printInc(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        printInc(15);
    }
}
