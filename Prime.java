//print prime numbers in a range(n,n)
public class Prime {
    static int count=0;
    static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        else if(n==2){
            return true;
        }
        else if(n==4){
            return false;
        }
        else{
            for(int i=3;i<n;i++){
                if(n%i==0){
                   return false;
                }
            }
            
        }
        return true;
    }
     public static void main(String[] args) {
        int n1=0,n2=100;
        for(int i=n1;i<n2;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
}
