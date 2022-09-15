public class functional_recursion {
    // IN THIS (FUNCTIONAL) FUNCTION RETURN THE ANSWER


    static int f(int a){
        if(a==0){
                return 0;
        }
        return a+f(a-1);

    }


    public static void main(String[] args){

            int n=5;
        System.out.println(f(n));

}


}
