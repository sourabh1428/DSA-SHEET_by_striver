public class gfg_rotate {

    static int f(int arr[], int n, int k){
       int[] temp =new int[100];
       for (int i=0;i<k;i++){
           temp[i]=arr[i];
       }
       for (int i=0;i<n;i++) {
            if (i<n){
               arr[i]=arr[i+k];
       }}

        return 0;
    }
    public static void main(String[] args){
        int arr[]={10,22,11,34,12,23,19,45};
        int k=2;
        int n=arr.length;
        f(arr, n,k);



    }
}
