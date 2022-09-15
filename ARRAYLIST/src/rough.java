import java.util.ArrayList;

public class rough {

    public static void main(String[] args){

        int [] arr={2,1,3};
        int n= arr.length;
        System.out.println(n);
        ArrayList<Integer> newArray = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            newArray.add(i, arr[i]);
        }
        System.out.println(newArray.size());
        newArray.set(1,2);

        System.out.println(newArray);



    }
}
