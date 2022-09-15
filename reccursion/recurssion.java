public class recurssion {


    static int f(int a) {
        if (a == 6) {
            return 0;
        } else {
            System.out.println(a);
            a++;
            f(a);
        }

    return 0;
    }

    public static void main(String[] args){
        int a= 1;
        f(a);


    }
}
