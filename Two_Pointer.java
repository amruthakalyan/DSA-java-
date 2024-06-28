//Reverse the array using two-pointer

import java.util.Arrays;
import java.util.Scanner;

public class Two_Pointer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = {1,2,3,4,5};
        int temp,start=0,end=a.length-1;
        while(start <=end){
          temp =  a[start];
          a[start] = a[end];
          a[end] = temp;
           start++;
           end--;
        }
        System.out.println(Arrays.toString(a));
    }
}
