public class linear_search {

    static void searchit(int arr[] , int n,int k){
        int count=0;
        for (int i=0;i<n;i++){
            if (arr[i]==k){

                System.out.println(i);
            }
        }

    }



    public static void main(String[] args){

        int arr[] = {1,0,2,0,1,7,0,5,5,6};
        int n= arr.length;
        int k=6;
        searchit(arr,n,k);


    }
}
