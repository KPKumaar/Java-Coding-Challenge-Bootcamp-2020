import java.util.Scanner;
public class CC7 {
    public static void main(String[] args) {
        int n1,n2,n3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three Integers");
        n1=sc.nextInt();
        n2=sc.nextInt();
        n3=sc.nextInt();
        int secmax=n1>n2 && n1>n3 ? n2>n3 ? n2 :n3 : n2>n1 && n2>n3 ? n1>n3?n1 : n3 : n1>n2 ? n1 : n2 ;
        System.out.println("Second Largest of three = "+secmax);
    }
}
