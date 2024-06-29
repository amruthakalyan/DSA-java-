//Remove Duplicates from Sorted Array

import java.util.Arrays;
import java.util.Scanner;

public class Remove_Duplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("Enter array elements(10 elements):");
        for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length-1;j++){
                if(a[i]==a[j]){
                  a[i]=0;
                }
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
