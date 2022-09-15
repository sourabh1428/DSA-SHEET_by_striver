import java.util.Scanner;

public class factorial_recursion {

    static int f(int a){
        if(a==1){
            return 1;

        }
        return a*f(a-1);

    }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

      int n=sc.nextInt();

        System.out.println(f(n));

    }
}
