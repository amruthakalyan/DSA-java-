
import java.util.Scanner;

public class Palindrome {
    void palindrome(String s){
        int i=0,j=s.length()-1;
        for(i=0;i<s.length();i++,j--){
            if(s.charAt(i)==s.charAt(j)){
                System.out.println("Given string is Palindrome!");
                break;
            }
            else{
                System.out.println("Given string is not Palindrome!");
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Palindrome p = new Palindrome();
        System.out.println("Enter a string:");
        String s = sc.next().toLowerCase();
        p.palindrome(s);
    }
}
