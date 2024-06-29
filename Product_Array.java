//Product of Array Except Self

import java.util.Arrays;
import java.util.Scanner;

public class Product_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] ={1, 2, 3, 4};
        int i,product=1;
        for(i=0;i<a.length;i++){
            product *=a[i];
        }
        System.out.println(product);
        for(i=0;i<a.length;i++){
            a[i] = product/a[i];
        }
        System.out.println(Arrays.toString(a));
    }
}

