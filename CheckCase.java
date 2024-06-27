import java.util.Scanner;

public class CheckCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character:");
        char ch = sc.next().trim().charAt(0);
        if(ch >'a' && ch <'z'){
            System.out.println(ch +"is lowercase!");
        }
        else{
            System.out.println(ch + " is uppercase!");
        }
    }
}
