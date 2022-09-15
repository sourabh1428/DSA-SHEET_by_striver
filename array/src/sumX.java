import java.util.HashMap;

public class sumX {

    static int[] solve(int[] A, int n, int x){
        int[] result=new int[2];
        HashMap<Integer,Integer>map=new HashMap<>();
        int temp=0;
        for (int i=0;i<n;i++){
            temp=x-A[i];
            if (map.containsValue(temp)){
                result[1]=i;
                result[0]=map.get(x-A[i]);
                return result;
            }
           map.put(A[i],i);
        }


        return result;
    }

    public static void main(String[] args){

        int [] ar={1,2,3,4,5,6,7};
        int n= ar.length;
        int x=13;

        System.out.println(solve(ar,n,x));



    }



}
