import java.util.*;
public class subarray_givenSUM {

    static int fun(int A[], int N, int K){
        int count=0;
        int temp =0;
        ArrayList<Integer> brr= new ArrayList<>();
        for (int i = 0; i < N; i++) {
            brr.add(i, A[i]);
        }
        Collections.sort(brr);
        brr.add(N,0);
        for (int i=0;i<N;i++){
            if (count==K&&i==N-1){
                temp=i;
                break;
            }
           else{ count= brr.get(i)+brr.get(i+1);
        }}



        return temp;
    }


    public static void main(String[] args){
      int [] arr={10, 5, 2, 7, 1, 9};
      int k=15;
      int n=arr.length;
        System.out.println(fun(arr ,n,k));



    }
}
