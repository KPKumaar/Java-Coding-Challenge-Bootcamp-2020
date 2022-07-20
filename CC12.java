import java.util.Scanner;

public class CC12 {
    public static void main(String[] args) {
        int n;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number to find factorial");
        n=sc.nextInt();

        System.out.println(fact(n));
    }
    /*public static int fact(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }*/

    public static int fact(int n){
        //using RECURSSION
        if(n==1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
}
