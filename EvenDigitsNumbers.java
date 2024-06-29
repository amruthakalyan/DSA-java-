//Find the no. of numbers that have even no of digits
public class EvenDigitsNumbers {

    static boolean even(int num){
        if(num%2==0){
            return true;
        }
        return false;
    }
    static int findDigits(int[] nums){
        int count=0;
       for(int num: nums){
        if(even(num)){
            count++;
        }
       }
      return count;
    }
    public static void main(String[] args) {
        int[] nums = {18,124,9,1764,98,1};

        System.out.println(findDigits(nums));
        
       }
       
    }

