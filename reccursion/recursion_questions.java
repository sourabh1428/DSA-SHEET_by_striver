public class recursion_questions {

   static int f(int i, int j){

       int a= i;
       int b=j;
       if(a>b){
           return 0;
       }
       else {
           System.out.println(i);
           i++;
           f(i,j);


       }

       return 0;

   }


    public static void main(String[] args){
        int i=1;
        int j=4;
        f(i,j);
    }
}
