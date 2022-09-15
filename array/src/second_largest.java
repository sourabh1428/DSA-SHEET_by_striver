import java.util.*;
public class second_largest {


    static int solve(int[] arr,int n){
        Arrays.sort(arr);
        int secocnd_max=arr[n-2];


        return secocnd_max;
    }

    public static void main(String[] args){
        int []arr={1,2,3};
        int len= arr.length;

        System.out.println(solve(arr,len));
    }
}
