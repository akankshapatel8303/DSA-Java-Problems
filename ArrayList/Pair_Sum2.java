import java.util.ArrayList;

public class Pair_Sum2 {

    public static boolean pairSum(ArrayList<Integer> list, int target){
        // Breaking point
        int bp = -1;
        for(int i=0; i<list.size(); i++){
            if(list.get(i) > list.get(i+1)){
                bp = i;
                break;
            }
        }

        int leftP = bp+1; // Smallest
        int rightP = bp; // Largest

        while (leftP != rightP) {
            if(list.get(leftP)+list.get(rightP) == target){
                return true;
            }else if(list.get(leftP)+list.get(rightP) < target){
                leftP = (leftP+1)%list.size();
            }else{
                rightP = (list.size()+rightP-1)%list.size();
            }
        }
        return false;
    }
    public static void main(String[] args) {
        // Find if any pair in a Sorted & Rotated ArrayList has a target sum.
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        System.out.println(pairSum(list, 26));
    }
}
