import java.util.HashSet;
import java.util.Iterator;


public class remove_dupilcates {

    static int duplicasy(int arr[] , int n) {




        return 0;

    }



    public static void main(String[] args){
        int arr1[] = {1,2,2,3,1,4,5,5,6};
        int n1= arr1.length;
        int arr2[]={2,3,1,4,2,5,6,1,7};
        int n2=arr2.length;

        HashSet<Integer> set = new HashSet<>();

        for (int i =0;i<n1;i++){
            set.add(arr1[i]);
        }
        for (int i=0;i<n2;i++) {
            set.add(arr2[i]);
        }

        System.out.println("size of array resulting:"+ set.size());

        System.out.println(set.toString()+" ");



        }

    }
