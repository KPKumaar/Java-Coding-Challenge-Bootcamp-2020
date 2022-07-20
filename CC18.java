import java.util.Scanner;

public class CC18 {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a integer");
        n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.printf("Sum of even numbers in %d integers is %d",n,sum);
    }
}
