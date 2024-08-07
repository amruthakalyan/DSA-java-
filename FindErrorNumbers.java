//Set mismatch
public class FindErrorNumbers {
    public static void main(String[] args) {
        int[] nums ={1,2,2,4};
        int i=0,n=nums.length;
        int correctIndex = nums[i]-1;
        
        while(i<nums.length){
            if( nums[i]!=nums[correctIndex]){
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }
            else{
                i++;
            }
        }
        for(i=0;i<nums.length;i++){
            if(nums[i] !=i+1){
               System.out.println(nums[i]+ " "+nums[i+1]);
            }
       
}  
    }
}
