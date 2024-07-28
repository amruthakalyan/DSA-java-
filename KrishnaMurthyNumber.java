//A Krishnamurthy number is a number whose sum of the factorial of digits is equal to the number itself.145

import java.util.Scanner;

public class KrishnaMurthyNumber{
    static int factorial(int n)
    {
        int fact = 1;
        while (n != 0) {
            fact = fact * n;
            n--;
        }
        return fact;
    }
    public static void main(String[] args) {
        int sum = 0;
        // int n=145;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int temp = n;
        while (temp != 0) {
            sum += factorial(temp % 10);
            temp = temp / 10;
        }
        if(sum==n){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}