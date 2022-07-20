import java.util.Scanner;

public class CC15 {
    public static void main(String[] args) {
        int n;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number to check perfect or not");
        n=sc.nextInt();
        System.out.println(is_perfect(n));
    }
    public static boolean is_perfect(int n) {
        int sum = 0;
        for (int i = 1; i <=n/2; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == n) {
            return true;
        } else {
            return false;
        }
    }
}
