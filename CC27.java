import java.util.Scanner;

public class CC27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number");
        int binary = sc.nextInt();
        int remainder, decimal = 0, i = 0;
        while (binary != 0) {
            remainder = binary % 10;
            decimal=decimal+(int)(remainder*Math.pow(2,i));
            i++;
            binary=binary/10;
        }
        System.out.println("Decimal: "+decimal);
    }
}