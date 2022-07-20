import java.util.Scanner;

public class CC22 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n = sc.nextInt();
        int count=0;
        while(n!=0){
            count++;
            n=n/10;
        }
        System.out.println("Count :"+count);
    }
}
