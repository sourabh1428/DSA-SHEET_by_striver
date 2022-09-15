import java.util.*;
public class Main {
    public static void main(String[] args) {
        //integer list
        ArrayList<Integer> list=new ArrayList<>();
        //string list
        ArrayList<String> pist = new ArrayList<>();
        //ADDITION in integer
        list.add(0);
        list.add(1);
        list.add(3);
        System.out.println(list);

        //get elements
        int element= list.get(0);
        System.out.println(element);

        //add element in MIDDLE
        list.add(1,9);
        System.out.println(list);

        //set elements
        list.set(0,5);
        System.out.println(list);

        //delete

        list.remove(1);
        System.out.println(list);

           //array list size
        int size= list.size();
        System.out.println(size);

        //loops in array list
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        //sorting

        Collections.sort(list);
        System.out.println(list);



    }
}