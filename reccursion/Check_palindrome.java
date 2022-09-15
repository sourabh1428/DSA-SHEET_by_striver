import java.util.Scanner;

public class Check_palindrome {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        int naM= sc.nextInt();
        int dummy= naM;
        int Y= revRse(naM);


        if (dummy==Y){
            System.out.println("number is palindrome");
        }
        else {
            System.out.println("not a palindrome");
        }


        //by checking reverse of a number


    }

    static int revRse(int naM){
        int rev =0;
        int n=naM;

        while (n!=0){
            int digit =n%10;
            rev = rev*10+digit;
            n=n/10;
        }
        return rev;

    }


}
