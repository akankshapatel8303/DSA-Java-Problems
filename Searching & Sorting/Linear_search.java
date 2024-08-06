public class Linear_search {
    public static int linear_search(int arr[], int target){
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {11, 20, 8, 5, 23, 9, 1};
        int target = 40;
        System.out.println(linear_search(arr, target));
    }
}
