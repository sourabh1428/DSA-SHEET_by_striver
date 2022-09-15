import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class reverse_array {


    static void printarr(Integer arr[] , int n){
        System.out.println("reversed array is as follows: \n");
        for (int i=0 ; i<n;i++){
            System.out.println(arr[i]+" ");
        }



    }

    static void rev_array(Integer arr[]){

        Collections.reverse(Arrays.asList(arr));

    }



    public static void main(String[] args){

            int n=5;
            Integer arr[]={5,4,3,2,1};
            rev_array(arr);
            printarr(arr , n);

    }
}
