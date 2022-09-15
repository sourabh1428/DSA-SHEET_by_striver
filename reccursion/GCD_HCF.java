public class GCD_HCF {
    public static void main(String[] args){
        int n1 = 3;
        int n2 = 6;
        int ans= 1;
        for (int i=1; i<=Math.min(n1,n2); i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                ans = i;
            }
        }
        System.out.println("gcd is :"+ans);


        }
    }



