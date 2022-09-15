import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
      //creating
        HashSet<Integer> set = new HashSet<>();
        //insert
        set.add(1);
        set.add(2);
        set.add(3);
        //search-CONTAINS
        if (set.contains(1)){
            System.out.println("set conatain 1");

        }

        //delete
        set.remove(1);
        if (!set.contains(1)){
            System.out.println("does not contain 1");
        }
        //size
        System.out.println("size of set is "+set.size());

    //ITERARATOR
        Iterator it = set.iterator();
        // has nextfunc-TRUE/FALSE
        // has func
        while(it.hasNext()){
            System.out.println(it.next());
        }







    }
}