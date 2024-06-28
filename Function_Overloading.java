//Function Overloading : it means functions with same NAME but different PARAMETERS

import java.util.Scanner;

public class Function_Overloading { 
   static void fun(String s){
        System.out.println("Hey "+s+" This is fun method!");
    }
    void fun(int a ,int b){
        int sum=0;
        sum = a+b;
        System.out.println("sum of a & b is:"+sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 10, b =20;
        Function_Overloading fo = new Function_Overloading();
        fun("kalyan");
        fo.fun(a,b);

    }
}
