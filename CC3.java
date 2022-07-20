import java.util.Scanner;

public class CC3 {
    public static void main(String[] args) {
        float r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius");
        r = sc.nextFloat();
        double area=3.14*r*r;
        System.out.printf("%.3f",area);
    }
}