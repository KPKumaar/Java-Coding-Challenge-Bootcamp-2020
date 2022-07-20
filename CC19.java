import java.util.Scanner;

public class CC19 {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a integer");
        n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        float avg=(float)sum/n;
        System.out.printf("Avarage of %d integers is %f",n,avg);
    }
}
