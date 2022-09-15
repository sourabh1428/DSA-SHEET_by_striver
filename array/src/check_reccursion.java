public class check_reccursion {

    static boolean check(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1])
                return false;
            }
            return true;



    }


    public static void main(String[] args){

    int arr[] ={10,11,32,42,51};
    int n= arr.length;
        System.out.println(check(arr, n));

    }




}
