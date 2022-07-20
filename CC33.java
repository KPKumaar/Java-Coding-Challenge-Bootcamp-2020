import java.util.Scanner;

public class CC33 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Size of the array");
        int size= sc.nextInt();
        int nums[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.printf("Enter an integer for index %d:",i);
            nums[i]= sc.nextInt();
        }
        System.out.println("First Recurring element :");
        System.out.println(first_reccuring_elemrnt(nums));
    }
    public static int first_reccuring_elemrnt(int nums[]){
        int len=nums.length;
        for(int i=0;i<len;i++){
            for (int j=i+1;j<len;j++){
                if(nums[i]==nums[j]){
                    return nums[i];
                }
            }
        }
        return -1;
    }
}
