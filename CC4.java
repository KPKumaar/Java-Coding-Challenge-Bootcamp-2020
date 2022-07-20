import java.util.Scanner;

public class CC4 {
    public static void main(String[] args) {
        int n1, n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to swap");

        n1=sc.nextInt();
        n2= sc.nextInt();

        System.out.println("Before Swap");
        System.out.println("n1="+n1+"n2="+n2);

        //By using Temporary variable
        int temp=n1;
        n1=n2;
        n2=temp;

        /*Another method without using temporary variable , use +,-

        n1=n1+n2;
        n2=n1-n2;
        n1=n1-n2;

         */

        /*Another method without using temporary variable , use *,/

        n1=n1*n2;
        n2=n1/n2;
        n1=n1/n2;

         */

        System.out.println("After Swap");
        System.out.println("n1="+n1+"n2="+n2);
    }
}