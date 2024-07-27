import java.util.Arrays;
public class DuplicateNumbers {
    void duplicate(int[]a){
        int i,j,count=0;
        int[]res =new int[a.length];
        for(i=0;i<a.length;i++){
           for(j=i+1;j<a.length;j++){
            if(a[i]==a[j]){
               res[i] = a[i];
            }
           }
        }
        for(i=0;i<res.length;i++){
            if(res[i]==0){
                continue;
            }
            System.out.print(res[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[]a={1,2,3,6,3,6,1};
        DuplicateNumbers dn = new DuplicateNumbers();
        // Arrays.sort(a);
        dn.duplicate(a);
    }
}
