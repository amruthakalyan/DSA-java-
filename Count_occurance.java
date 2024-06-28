import java.util.Scanner;

public class Count_occurance {
    int countOccurance(long  n,int target){
        int len =(int) Math.log10(n)+1;
        int i=1,count=0;
        for(i=1;i<=len;i++){
            if(n%10==target){
                   count++;
                   n=n/10;
            }
           else{
          
            n/=10;
           }
        }
        
        return count;
    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Count_occurance c = new Count_occurance();
        int num,target;
        System.out.println("Enter a number(mininum of 4 digits):");
        num = sc.nextInt();
        System.out.println("Enter target value:");
        target = sc.nextInt();

        System.out.println("Total no.of occurance of "+ target +" is:"+c.countOccurance(num,target));
    }
}
