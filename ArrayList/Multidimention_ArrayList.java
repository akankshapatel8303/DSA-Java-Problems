import java.util.ArrayList;

public class Multidimention_ArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        mainlist.add(list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(6);
        list2.add(7);
        list2.add(8);
        list2.add(9);
        list2.add(10);
        mainlist.add(list2);

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(11);
        list3.add(12);
        list3.add(13);
        list3.add(14);
        list3.add(15);
        mainlist.add(list3);

        for(int i = 0; i<mainlist.size(); i++){
            ArrayList<Integer> currlist = mainlist.get(i);
            for(int j = 0; j<currlist.size(); j++){
                System.out.print(currlist.get(j) + " ");
            }
            System.out.println();
        }
        System.out.println(mainlist);

        // OR
        ArrayList<ArrayList<Integer>> mainl = new ArrayList<>();
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        ArrayList<Integer> l3 = new ArrayList<>();
        for(int i=1; i<=5; i++){
            l1.add(i);
            l2.add(i*2);
            l3.add(i*3);
        }
        mainl.add(l1);
        mainl.add(l2);
        mainl.add(l3);

        for(int i = 0; i<mainl.size(); i++){
            ArrayList<Integer> currl = mainl.get(i);
            for(int j = 0; j<currl.size(); j++){
                System.out.print(currl.get(j)+" ");
            }
            System.out.println();
        }
        System.out.println(mainl);
    
    }
}
