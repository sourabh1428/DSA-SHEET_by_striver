public class insertionsort {
    public static void main(String[] args){

        int arr[] = {10,11,9,6,7,2};
        int n= arr.length;
        for (int i=0;i<n;i++){
        int current =arr[i];
        int j=i-1;
        while(j>=0&& arr[j]>current)
        {
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=current;
    }
        System.out.println("after sorting: \n");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }


}
