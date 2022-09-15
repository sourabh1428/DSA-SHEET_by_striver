public class move0 {
   public static void moveZero(int arr[],int n) {
        int[] temp = new int[n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp[k] = arr[i];
                k++;

            }

        }

        while(k<n){
            temp[k]=0;
            k++;

        }
        for (int i=0;i<n;i++){
            System.out.print(temp[i]+" ");
        }


    }


    public static void main(String[] args){

        int arr[] = {1,0,2,0,1,0,5,5,6};
        int n= arr.length;
        moveZero(arr,n);

    }}
