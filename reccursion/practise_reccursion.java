public class practise_reccursion {

    static int f(int i , int j){
        if (i>=j){
            return 0;
        }
        else {

            System.out.println("sourabh");
            i++;
            f(i,j);

        }
        return 0;
    }

    private static int  exit() {
        return 0;
    }

    public static void main(String[] args){
        int i= 0;
        int j =3;

        f(i,j);
    }
}

