import java.util.Scanner;

public class CC29 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a decimal number");
        int decimal=sc.nextInt();
        int octal=0,remainder,i=0;
        while(decimal!=0){
            remainder=decimal%8;
            octal=octal+(int)(remainder*Math.pow(10,i));
            decimal=decimal/8;
            i++;
        }
        System.out.println("Octal:"+octal);
    }
}
