import java.util.Scanner;

public class CC30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a octal number");
        int octal = sc.nextInt();
        int decimal = 0, remainder, i = 0;
        while (octal != 0) {
            remainder = octal % 10;
            decimal = decimal + (int) (remainder * Math.pow(8, i));
            octal = octal / 10;
            i++;
        }
        System.out.println("Decimal:" + decimal);
    }
}
