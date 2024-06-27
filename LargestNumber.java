import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1:");
        float num1 = sc.nextFloat();
        System.out.println("Enter num2:");
        float num2 = sc.nextFloat();
        System.out.println("Enter num3:");
        float num3 = sc.nextFloat();
        float max = num1;
        // if(num1 > num2 && num1 >num3){
        //     System.out.println(num1 + " is Greater");
        // }
        // else if(num2 >num1 && num2 >num3){
        //     System.out.println(num2 + " is Greater");
        // }
        // else{
        //     System.out.println(num3 + " is Greater");
        // }
      
        if(num2>max){
            max = num2;
        }
        if(num3>max){
            max = num3;
        }
        System.out.println(max +" is greater!");
    }
}
