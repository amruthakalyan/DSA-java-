import java.util.Arrays;
import java.util.Scanner;

public class PalindromeSentence {
    static void palindrome(String s){
       String s1 = s.replaceAll("[^a-zA-Z0-9] ", "").toLowerCase();
       System.out.println(s1);
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string:");
    String s = sc.next();
   palindrome(s);
  
}
}

