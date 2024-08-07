import java.util.Arrays;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[]a = {4,0,1,3};
        Arrays.sort(a);
        int i;
        for(i=0;i<a.length;i++){
            if(a[i]!=i){
                System.out.println(i);
                break;
            }
        }
    }
}
