//Write a function that returns the sum of first n natural numbers.

import java.util.Scanner;

public class Primenumbers {

    boolean isprime(int num){
        int i;
        if (num <= 1) 
           return false; 
        if (num <= 3) 
           return true; 
        for(i=4;i<num;i++){
            if(num%2==0){
                return false;
            }
            else{
                return true;
            }
        }
        return true;
    }
  void printPrime(int start,int end){
    int i,count=0;
    int len = end-start;
    int a[] = new int[len];
    for(i=start;i<=end;i++){
            if(isprime(i)){
                a[count]= i;
                count++;
            }
    }
    for(i=0;i<a.length;i++){
        System.out.println(a[i]+ " ");
    }
  }
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          Primenumbers p = new Primenumbers();
          p.printPrime(1, 10);
    }
}
