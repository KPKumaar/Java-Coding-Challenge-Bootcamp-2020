import java.util.Scanner;

public class CC13 {
    public static void main(String[] args) {
        int n1,n2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        n1=sc.nextInt();
        n2= sc.nextInt();
        System.out.printf("gcd of the numbers is  %d",gcd(n1,n2));
    }
    /*public static int gcd(int n1,int n2){
        int gcd=0;
        for(int i=1;i<=n1 && i<=n2;i++){
            if(n1%i==0 && n2%i==0){
                gcd=i;
            }
        }
        return gcd;
    }*/
    public static int gcd(int n1,int n2){
        while(n1!=n2) {
            if (n1 > n2) {
                n1 = n1 - n2;
            }
            if (n2 > n1) {
                n2 = n2 - n1;
            }
        }
        return n2;
    }

}
