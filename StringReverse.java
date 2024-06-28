import java.util.Scanner;

public class StringReverse {
    void reverse(String s){
      int i=0,j= s.length()-1;
      int ans[] = new int[s.length()];
      for(i=0;i<s.length();i++){
       ans[i] = s.charAt( j--);
      
      }
      for(i=0;i<ans.length;i++){
      System.out.println((char)ans[i]);
    }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringReverse s = new StringReverse();
        s.reverse("kalyan_amrutha");
    }
}
