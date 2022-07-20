import java.util.Scanner;
public class CC6 {
    public static void main(String[] args) {
        int n1,n2,n3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three Integers");
        n1=sc.nextInt();
        n2=sc.nextInt();
        n3=sc.nextInt();
        int min=n1<n2 && n1<n3 ? n1 : n2<n1&&n2<n3 ? n2 : n3;
        int max=n1>n2 && n1>n3 ? n1 : n2>n1&&n2>n3 ? n2 : n3;
        System.out.println("Min="+min+"Max="+max);
    }
}
