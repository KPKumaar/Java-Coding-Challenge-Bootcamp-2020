import java.util.Scanner;

public class CC34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of the array");
        int size = sc.nextInt();
        int nums[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Enter an integer for index %d:", i);
            nums[i] = sc.nextInt();
        }
        System.out.println("Most Frequent Integer");
        System.out.println(most_frequent_integer(nums));
    }
    public static int most_frequent_integer(int nums[]) {
        int len = nums.length;
        int maxcount = 0, mf = -1;
        for (int i = 0; i < len; i++) {
            int count = 0;
            for (int j = i + 1; j < len; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (maxcount < count) {
                maxcount = count;
                mf = nums[i];
            }
        }
        if(mf==-1){
            return -1;
        }
        else {
            return mf;
        }
    }
}