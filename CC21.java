import java.util.Scanner;

public class CC21 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n = sc.nextInt();
        int l=0;
        int reverse=0;
        while(n!=0){
            l=n%10;
            reverse=reverse*10 + l;
            n=n/10;
        }
        System.out.println("Revrese :"+reverse);
    }
}