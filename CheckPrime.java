import java.util.Scanner;
public class CheckPrime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        boolean res = false;
        int n = sc.nextInt();
        if(n==1){
            System.out.println("1 is not a prime..");
        }
    
        else{
        for(int i=2;i<n;i++){
            if(n%i==0){
                res= false;
                break;
            }
            else{
                res = true;
            }
        }
      
    }
        if(res == true){
            System.out.println(n+" is a prime number..");
        }
        else{
            System.out.println(n+" is not a prime number..");
        }
    }
}