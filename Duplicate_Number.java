//Find duplicate number in an Array
public class Duplicate_Number {
    public static void main(String[] args) {
        int[] a = {1,3,4,2,2};
        int i=0;
        int correctIndex = a[i]-1;
        while(i<a.length){
            if(a[i]<a.length && a[i]!=a[correctIndex]){
                int temp = a[i];
                a[i] = a[correctIndex];
                a[correctIndex] = temp;
            }
            else{
                i++;
            }
        }
        for(i=0;i<a.length;i++){
            // System.out.println(a[i]);
            if(a[i] ==i+1){
              continue;
            }
            else{
                System.out.println(i+ " ");
            }
        }
        
    }
}
