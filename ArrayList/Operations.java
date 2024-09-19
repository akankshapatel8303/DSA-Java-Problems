import java.util.ArrayList;

public class Operations {

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        //Add operation
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(1, 9);
        System.out.println(list1);
        //Remove operation
        list1.remove(3);
        System.out.println(list1);
        //Set operation
        list1.set(0, 10);
        System.out.println(list1);
        //Contain operation
        System.out.println(list1.contains(2));
        System.out.println(list1.contains(7));
        //Size
        System.out.println(list1.size());
        //Get
        for(int i=0; i<list1.size(); i++){
            System.out.println(list1.get(i));
        }

        list2.add("Hello");
        list2.add("Manya");
        list2.add("!");
        list2.add("How");
        list2.add("are");
        list2.add("you?");
        System.out.println(list2);

        list3.add(true);
        list3.add(false);
        System.out.println(list3);
    }
}