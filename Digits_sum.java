import java.util.Scanner;
public class Digits_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int sum=0,r;
        while(num !=0){
              r = num%10;
              sum = sum + r;
              num /=10;
        }
        System.out.println("Sum of the digits of the given number is :"+ sum);
    }
}
