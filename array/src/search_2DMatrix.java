public class search_2DMatrix {

    static int solve(int mat[][], int N, int M, int X){

        int count=0;
        for (int i=0;i<mat.length;i++){
            for (int j=0;j<mat.length;j++){
                if (mat[i][j]==X){
                    return count+1;
                }
            }
        }






        return count;
    }



    public static void main(String[] args) {
        int N=3;
        int M=3;
        int [][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int X=11;
        System.out.println(solve(arr,N,M,X));

    }}
