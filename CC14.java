import java.util.Scanner;

public class CC14 {
    public static void main(String[] args) {
        int n;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number to check prime or not");
        n=sc.nextInt();
        System.out.println(is_prime(n));
    }
    public static boolean is_prime(int n){
        int count=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==1){
            return true;
        }
        else{
            return false;
        }
    }
}
