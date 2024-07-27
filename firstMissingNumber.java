public class firstMissingNumber {
    int missingNumber(){
        int[] a = {0,1,2,3,4,6};
       int n = a.length;
        int sum=0,i;
        for(i=0;i<n;i++){
            sum +=a[i];
        }
        int res = (n*(n+1))/2;
        int csum = sum;
        return res%csum;
    }
    public static void main(String[] args) {
        firstMissingNumber fmn = new firstMissingNumber();
       int res= fmn.missingNumber();
       System.out.println(res);
    }
}
