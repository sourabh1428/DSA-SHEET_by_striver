import java.util.ArrayList;

public class subseq {
    static void f(int  ind, int []arr, ArrayList<Integer> temp){
      int n=arr.length;
        if (ind>=n){
            System.out.println(arr[ind]+"");
            return;}
        //take
        temp.add(arr[ind] );
        f(ind+1,arr,temp);
        //not take
        temp.remove(arr[ind]);
        f(ind+1,arr,temp);
    }
    public static void main(String[] args) {
        int ind=0;
        ArrayList<Integer>temp=new ArrayList<>();
        int [] arr={3,1,2};
        f(ind,arr,temp );

    }
}
