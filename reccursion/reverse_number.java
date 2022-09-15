public class reverse_number {
    static int Reverse(int n){

        int reverse=0;
        int num=n;
        while(num!=0){
            int digit=num%10;
            reverse = reverse*10+digit;
            num=num/10;
        }
        return reverse;
    }




    public static void main(String[] args){
        int n = 123456;
        System.out.println("reverse of number is :"+Reverse(n));    }
}
