public class Floor {


    static int solve(long arr[],int n,long x){
        int start=0;
        int mid=0;
        int end=0;
        int count=0;
        int floor,ceil=0;
        while (start<=end){
            mid=(start+end)/2;
            if (x==arr[mid]){
                count++;
            } else if (x>arr[mid]) {
                start=mid+1;

            } else if (x<arr[mid]) {
                end=mid-1;
            }
            if (count>0){
                System.out.println("the nummber woould be: "+mid);
            }
        }


        return 0;
    }

    public static void main(String[] args){

        long [] arr={1,2,3,4,40,11,44,55};
        int k=4;
        int n=arr.length;


        System.out.println(solve(arr,n,k));
    }



}
