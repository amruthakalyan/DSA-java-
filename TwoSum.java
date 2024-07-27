import java.util.Scanner;

public class TwoSum {
    boolean checksum(int[]a,int target){
        int i,j,n=a.length;
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(a[i]+a[j]==target){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[]a = {0,-1,2,-3,1};
        // int target = -2;
        int[]a = {1,-2,1,0,5};
        int target = 0;
        TwoSum ts = new TwoSum();
       boolean res = ts.checksum(a, target);
       System.out.println(res);
    }
}
