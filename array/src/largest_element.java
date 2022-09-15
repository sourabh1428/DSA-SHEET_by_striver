public class largest_element {

    static int MaxElement(int arr[],int n){
        int maxValue=0;
        int temp[]=new int[10000];
        for (int i=0; i<n;i++){
           if (arr[i]>maxValue){
               maxValue=arr[i];
           }
        }

        return maxValue;
    }


    public static void main(String[] args){
        int arr[] = {3,1,2,5,4,10};
        int n=arr.length;
        System.out.println(MaxElement(arr,n));


    }
}
