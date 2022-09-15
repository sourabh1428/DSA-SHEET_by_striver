import java.util.ArrayList;

public class suseq_k {

    public static void f(int [] a, int ind, int sum, int k, ArrayList<Integer>list){

        if(ind ==a.length) {
            System.out.println(list);
            return;
            }
        list.add(a[ind]);

         f(a,ind+1,sum,k,list); //TAKE


        //waps ate samay

        list.remove(a[ind]);
        f(a,ind+1,sum,k,list);  //NOT TAKE



    }

    public static void main(String[] args) {
        int[] arr={3,1,2};
        int ind =0;
        int sum=0;
        int k=4;

        ArrayList<Integer>newlist=new ArrayList<>();
        f(arr,ind,sum,k,newlist);
    }
}
