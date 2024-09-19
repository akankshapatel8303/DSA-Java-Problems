import java.util.ArrayList;

public class Pair_Sum1 {
    public static boolean pair(ArrayList<Integer> list, int target){

        // BRUTE FORCE APPROACH
        for(int i=0; i<list.size(); i++){
            for(int j=i+1; j<list.size(); j++){
                if(list.get(i) + list.get(j) == target){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean pair2(ArrayList<Integer> height, int target){

        // 2 Pointer Approach
        int leftP = 0;
        int rightP = height.size()-1;

        while (leftP != rightP) {
            if(height.get(leftP) + height.get(rightP) == target){
                return true;
            }else if((height.get(leftP) + height.get(rightP)) > target){
                rightP--;
            }else{
                leftP++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(pair(list, 11));
        System.out.println(pair2(list, 11));
    }
}
