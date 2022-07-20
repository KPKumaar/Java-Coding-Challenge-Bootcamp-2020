import java.util.Scanner;

public class CC31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number");
        int decimal = sc.nextInt();
        int hexadecimal = 0, remainder, i = 0;
        while (decimal != 0) {
            remainder = decimal % 16;
            hexadecimal = hexadecimal + (int) (remainder * Math.pow(10, i));
            decimal = decimal / 16;
            i++;
        }
        System.out.println("Hexa Decimal:" + hexadecimal);
    }
}
