public class primes{
    static boolean isprime(int n){
        if(n==0||n==1){
            return false;
        }
        else if(n==2){
            return true;
        }
        // else if(n==4){
        //     return false;
        // }
        else{
            for(int i=2;i<=n/2;i++){
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
            if(isprime(i)){
                System.out.print(i+" ");
            }
        }
    }
}