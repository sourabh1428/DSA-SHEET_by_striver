import java.util.Arrays;
import java.util.HashMap;

public class rough {

    static int[] solve(int[] arr,int n )
    {
        int temp[]=new int[100];
        int count=0;
        for (int i=0;i<n;i++){
            if (arr[i]<=count){
               count=arr[i];
                temp[i]=count;
            }

        }

    return temp;
    }

    public static void main(String[] args) {
        int[] brr = {9, 9, 9, 9, 9, 9};
        int[] A = {2,5,3,1};
        int N = A.length;


        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<N;i++){
            map.put(i,A[i]);
        }
        for (int i=1;i<=N;i++){
            if (!map.containsValue(i)){
                System.out.println("missing value is: "+i);

            }
            }

    }}
