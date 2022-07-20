import java.util.Scanner;

public class CC32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a hexadecimal number");
        int hexadecimal = sc.nextInt();
        int decimal = 0, remainder, i = 0;
        while (hexadecimal != 0) {
            remainder = hexadecimal % 10;
            decimal = decimal + (int) (remainder * Math.pow(16, i));
            hexadecimal= hexadecimal/ 10;
            i++;
        }
        System.out.println("Decimal:" + decimal);
    }
}
