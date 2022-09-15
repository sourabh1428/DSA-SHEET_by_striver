public class rotate_array {

    static int[] rotate(int[] arr, int k, int arrsize) {
        int temp = 0;
        for (int i = 0; i < arrsize; i++) {
            if (i < k) {
                temp = arr[i];
                arr[i] = arr[arrsize-i-1];
                arr[i+1]=temp;

            }
        }
        return arr;

    }



    public static void main(String args[]){
        int arr[]={10,22,11,34,12,23,19,45};
        int k=2;
        int arrsize=arr.length;

        rotate(arr,k,arrsize);
        for (int i=0;i<arrsize;i++){
            System.out.print(arr[i]+"  ");
        }
    }
}
