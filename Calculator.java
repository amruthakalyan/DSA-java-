import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1:");
        float num1 = sc.nextFloat();
        System.out.print("Enter num2:");
        float num2 = sc.nextFloat();
        System.out.println("Enter your Choice:");
        int ch=sc.nextInt();
        boolean cont=false;  
        float res ;
        do{
        switch (ch) {
            case 1:
                System.out.println("Addition:");
                res = num1 + num2;
                System.out.println("Sum="+res);
                break;
            case 2:
                System.out.println("Subtraction:");
                res = num1 - num2;
                System.out.println("Sub="+res);
                break;
            case 3:
                System.out.println("Multiplication:");
                res = num1 * num2;
                System.out.println("Mul="+res);
                break;
            case 4:
                System.out.println("Diviision:");
                res = num1 / num2;
                System.out.println("div="+res);
                break; 
            case 5:
                System.out.println("Modulus:");
                res = num1 % num2;
                System.out.println("Mod="+res);
                break;       
            default:
             System.out.println("Please enter the choice b/w 1 & 5 only!");
                break;
        }
        System.out.println("Do you want to continue next(true/false):");
        cont = sc.nextBoolean();
    }while(cont);
    }
}
