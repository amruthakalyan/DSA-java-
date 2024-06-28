//print sum of natural numbers provided by the user 
//variable length arguments are used when we dont know the exact no.of arguments to be passed in a function
public class VarArgs {
   static int Sum_Natural_numbers(int ...nums){
       int sum=0;
       for(int num:nums){
        sum += num;
       }
       return sum;
    }
    public static void main(String[] args) {
        System.out.println(Sum_Natural_numbers(1,2,3,4,5,6));
    }
}
