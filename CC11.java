import java.util.Scanner;

public class CC11 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int size;
        System.out.println("Enter Size of the array");
        size=sc.nextInt();
        int[] nums=new int[size];
        for (int i=0;i<size;i++){
            System.out.printf("Enter integer for index number %d : ",i);
            nums[i]= sc.nextInt();
        }
        int sum=0;
        for (int i=0;i<size;i++){
            sum=sum+nums[i];
        }
        System.out.println(sum);
    }
}
