import java.util.Scanner;

public class CC25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        System.out.println("Reverse of the string");
        System.out.println(reverse_string(s));
    }
    public static String reverse_string(String s){
        String rev="";
        int l=s.length();
        for(int i=l;i>=1;i--){
            rev=rev+s.substring(i-1,i);
        }
        return rev;
    }
}
