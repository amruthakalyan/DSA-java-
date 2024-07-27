//Anagram - if a string contains all the characters of another string in anyorder
import java.util.Arrays;
import java.util.Scanner;
public class CheckAnagram {
    public static void main(String[] args) {   
        String s1,s2;
        System.out.println("Enter s1 & s2:");
        Scanner sc = new Scanner(System.in);
        s1 = sc.next();
        s2 = sc.next();
        Check_Anagram(s1,s2);
    }
   static void Check_Anagram(String s1,String s2){
          
         char[] c1 = s1.toCharArray();
         char[] c2 = s2.toCharArray();
         Arrays.sort(c1);
         Arrays.sort(c2);
         if(Arrays.equals(c1,c2)){
              System.out.println("Anagrams");
         }
         else{
            System.out.println("Not Anagrams");
         }
    }
}
