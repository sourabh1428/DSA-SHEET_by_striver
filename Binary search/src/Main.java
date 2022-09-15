import java.util.*;
public class Main {


    static int solve(int arr[],int n,int k){

        int low=0;
        int high=n-1;
        int num=arr.length-1;
        int mid,loc=-1;
        while(low<=num-1){
            mid=(low+high)/2;

            if (k>arr[mid]){
                low=mid+1;

            } else if (k<arr[mid]) {
                high=mid-1;
            }
            if (arr[mid]==k){
                loc=mid;
                break;
            }

        }
        if (loc==-1){
            return -1;
        }
        else {
            return loc;
        }

    }



    public static void main(String[] args) {


        int []arr={1,2,3,4,5,6,7,8,9,12,13,15};
        int n=arr.length;
        int k=9;
        System.out.println(solve(arr,n,k));
    }
}