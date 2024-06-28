import java.util.Scanner;

public class ArmstrongNumber {
    // 153 = 1+ 125 + 27 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int ans=1;
        int temp=0;
        int len =(int) Math.log10(n)+1;
        for(int i=0;i<len;i++){
            ans = (n%10)*(n%10)*(n%10);
            temp = temp+ans;
            n/=10;
        }
        System.out.println(temp);
    //    if(temp == n){
    //     System.out.println(temp +" is Armstrong number!");
    //    }
    //    else{
    //     System.out.println(temp +" is not Armstrong number!");
    //    }
    }
}
