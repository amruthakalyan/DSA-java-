import java.util.Arrays;

public class CyclicSort {
    public static void cyclicSort(int[] nums) {
        int i = 0;
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
    }

    public static void main(String[] args) {
        int[] nums = {3, 5, 2, 1, 4};
        cyclicSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
