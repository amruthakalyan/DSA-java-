public class BestTimeToBuySellStocks {
   static int BuySell(int[]a){
       int i,len = a.length;
       int min =a[0];
       int max =0;
       int profit=0,count=0;
       for(i=0;i<len;i++){
            if(a[i]<=min){
                min=a[i];
                count++;
            }
       } 
       while(count < len){
            if(a[count]>max){
                max=a[count];
            }
            count++;
       } 
    //    System.out.println("max:"+max);
    //    System.out.println("min:"+min);
       profit = max-min;
       //Handle the case where all the elements are in decending order
       if(profit==-1){
        profit=0;
       }
       return profit;
    }
    public static void main(String[] args) {
        int[]a = {7,1,5,3,6,4};
        // int[]a = {7,6,4,3,2,1};
       int res = BuySell(a);
       System.out.println(res);
    }
}
