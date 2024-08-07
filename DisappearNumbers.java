//Find all numbers disappeared in an Array

import java.util.Arrays;

public class DisappearNumbers {
    public static void main(String[] args) {
        int i = 0;
        int[] nums ={4,3,2,7,8,2,3,1};
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else {
                i++;
            }
        }
        for(i=0;i<nums.length;i++){
            if(nums[i]==i+1){
               continue;
            }
            else{
                System.out.print(i+1 +" ");
            }
        }
    }
}
