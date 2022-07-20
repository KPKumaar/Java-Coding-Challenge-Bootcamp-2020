import java.util.Scanner;

public class CC28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a decimal number");
        int decimal=sc.nextInt();
        int binary=0,remainder,i=0;
        while(decimal!=0){
            remainder=decimal%2;
            binary=binary+(int)(remainder*Math.pow(10,i));
            decimal=decimal/2;
            i++;
        }
        System.out.println("Binary:"+binary);
    }
}
