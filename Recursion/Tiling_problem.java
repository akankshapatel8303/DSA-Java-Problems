// Given a "2 x n" floor and tiles of size "2x1", count the number of ways to tile the given board using the 2x1 tiles. (A tile can either be placed horizontally or vertically.)

public class Tiling_problem {
    public static int countTiling(int n){
        // Base case
        if(n == 0 || n == 1){
            return 1;
        }

        // work
        // Vertical choice
        int fnm1 = countTiling(n-1);

        // Horizontal choice 
        int fnm2 = countTiling(n-2);

        int ways = fnm1 + fnm2;
        return ways;
    }
    public static void main(String args[]){
        System.out.println(countTiling(4));
    }
}
