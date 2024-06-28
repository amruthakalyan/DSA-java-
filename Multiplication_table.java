import java.util.Scanner;

public class Multiplication_table {
    void multable(int n){
        int i;
        for(i=1;i<=10;i++){
           System.out.println(n +" X " +i +" = "+ n*i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Multiplication_table m = new Multiplication_table();
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        m.multable(n);
    }
}
