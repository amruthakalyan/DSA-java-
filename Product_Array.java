//Product of Array Except Self

import java.util.Arrays;
import java.util.Scanner;

public class Product_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] ={1, 2, 3};
        int i,temp=1,res=1;
        for(i=0;i<a.length;i++){
             res =res * a[i];
            a[i] = res;
        }
        System.out.println(Arrays.toString(a));
    }
}

// [1,2,3] = 1*2 =2 2*3=6