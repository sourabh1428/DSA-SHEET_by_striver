public class practise {
    static void swap(int  hue[],int left,int right){
        if (left>=right) return;

        int temp;
        temp=hue[left];
        hue[left]=hue[right];
        hue[right]=temp;
        left++;
        right--;
        swap(hue,left,right);

    }
    public static void main(String[] args) {

        int [] arr={1,2,3,4,5,6};
        int left=0;
        int right= arr.length-1;
    swap(arr,left,right);
        for ( int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
