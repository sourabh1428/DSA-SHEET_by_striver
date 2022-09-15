public class find_noofOnes {
    static int solve(int arr[][], int n, int m) {

        int count = 0;
        for (int i = 0; i < n; i++) {
            count = 0;
            int temp = 0;

            if (count < temp) {
                count = temp;
            }
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 1) {
                    temp++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args){

        int arr[][]={{0, 1, 1, 1},
                {0, 0, 1, 1},
                {1, 1, 1, 1},
                {0, 0, 0, 0}};
        int N=4;
        int M=4;
        System.out.println(solve(arr,N,M));




    }
}
