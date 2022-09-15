public class second_large {
    static int SecondMaxElement(int arr[],int n,int count){
        int maxValue=0;
        int minValue=0;
        if (count<2){
            System.out.println(maxValue);
            return 0;
        }
        int temp[]=new int[10000];
        for (int i=0; i<n;i++){
            if (arr[i]>maxValue){
                maxValue=arr[i];
            }
        }
        SecondMaxElement(arr,n,count);
        return maxValue;
    }

    public static void main(String[] args){

        int arr[] = {3,1,2,5,4,10};
        int n=arr.length;
        int count=0;
        System.out.println(SecondMaxElement(arr,n,count));



    }
}
