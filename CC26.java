import java.util.Scanner;

public class CC26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        System.out.println(is_palindrome(s));
    }

    public static boolean is_palindrome(String s) {
        String rev="";
        int l=s.length();
        for (int i=l;i>=1;i--){
            rev=rev+s.substring(i-1,i);
        }
        if(s.compareTo(rev)==0){
            return true;
        }
        else {
            return false;
        }
    }
}
