import java.util.Scanner;
public class CC1 {
    public static void main(String[] args) {
        int n1,n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        n1=sc.nextInt();
        n2=sc.nextInt();
        int add=n1+n2;
        int sub=n1-n2;
        int mul=n1*n2;
        int div=n1/n2;
        int mod=n1%n2;
        System.out.println("Add="+add+" Sub="+sub+" Mul="+mul+" Div="+div+" Mod="+mod);
    }
}