import java.util.Scanner;

public class ReverseNumber {
    void reverse(int n){
        int len =(int) Math.log10(n)+1;
        int[] a = new int[len];
        int i=1,count=0;
        for(i=1;i<=len;i++){
             a[count] = n%10;
             n/=10;
             count++;
        }
        for(i=0;i<len;i++){
            System.out.print(a[i]);
        }
       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        ReverseNumber r = new ReverseNumber();
       System.out.println("Reverse Number is:");
       r.reverse(num);
    }
}
