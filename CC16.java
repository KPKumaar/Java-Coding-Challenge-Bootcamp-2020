import java.util.Scanner;

public class CC16 {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a integer");
        n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.printf("Sum of %d integers is %d",n,sum);
    }
}
