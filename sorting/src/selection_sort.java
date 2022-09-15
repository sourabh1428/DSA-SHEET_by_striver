public class selection_sort {
    public static void main(String[] args) {
        //sbse chota element aage daldo
        int arr[]={20,10,40,23,45,55};
        int n=6;
        //sorting begins
        for (int i=0;i<n-1;i++){
            int min =i;
            for(int j=i+1;j<n;j++){

                if(arr[j]<arr[min]){
                    min=j;
                }}

            int temp= arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
                    }
        System.out.println("after sorting");
        for (int i=0;i<n;i++){


            System.out.print(arr[i]+" ");


        }
        System.out.println();
    }

}