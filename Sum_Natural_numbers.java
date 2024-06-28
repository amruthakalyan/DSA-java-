import java.util.Scanner;

public class Sum_Natural_numbers {
    int sum(int n){
        int i=0,sum=0;
        for(i=0;i<n;i++){
             sum +=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sum_Natural_numbers s = new Sum_Natural_numbers();
       System.out.println( s.sum(5)); //0+1+2+3+4
    }
}
