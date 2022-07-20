import java.util.Scanner;
public class CC10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float x1,y1,x2,y2;
        System.out.println("Enter points to find distance");
        System.out.println("x1=");
        x1= sc.nextFloat();
        System.out.println("y1=");
        y1= sc.nextFloat();
        System.out.println("x2=");
        x2= sc.nextFloat();
        System.out.println("y2=");
        y2= sc.nextFloat();
        float x1x2=x2-x1;
        float y1y2=y2-y1;
        double distance= Math.sqrt((x1x2*x1x2)+(y1y2*y1y2));
        System.out.printf("%.3f",distance);
    }
}