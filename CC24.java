import java.util.Scanner;

public class CC24 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n = sc.nextInt();
        System.out.println(is_palindrome(n));

    }
    public static boolean is_palindrome(int n){
        int l=0,num=n;
        int reverse=0;
        while(num!=0){
            l=num%10;
            reverse=reverse*10 + l;
            num=num/10;
        }
        return n==reverse;
    }
}
