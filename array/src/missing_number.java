import java.util.*;

public class missing_number {



    static int missarr(int[] A, int N) {

        HashMap<Integer,Integer>map=new HashMap<>();
        for (int i=0;i<N;i++){
            map.put(i,A[i]);
        }
        for (int i=1;i<=N;i++){
            if (!map.containsValue(i)){
                System.out.println("missing value is: "+i);
                return i;
            }

        }


        return 0;
    }






    public static void main(String[] args){

            int [] arr={3,1,2,5,4,6,7,5};
            int n= arr.length;
        System.out.println(missarr(arr,n));




    }}
