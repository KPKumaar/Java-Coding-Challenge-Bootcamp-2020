import java.util.Scanner;
public class CC5 {
    public static void main(String[] args) {
        int n1,n2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two Integers");
        n1=sc.nextInt();
        n2=sc.nextInt();
        int min=n1>n2?n2:n1;
        int max=n1>n2?n1:n2;
        System.out.println("Min="+min+"Max="+max);
    }
}
