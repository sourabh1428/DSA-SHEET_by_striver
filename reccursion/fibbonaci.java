public class fibbonaci {

    static int series(int n, int last, int slast){
        if (n<=1){
            return n;
        }
        last=series(n-1,last,slast);
        slast=series(n-2,last,slast);

        return last+slast;
    }


    public static void main(String[] args) {
        int l=1;
        int sl=0;
        int n=6;
        System.out.println(series(n,l,sl));
    }
}
