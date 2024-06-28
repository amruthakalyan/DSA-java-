//Write a function to check if a given triplet is a Pythagorean triplet or not. (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).

import java.util.Scanner;

public class Pythogorus_triplet {
    void Pythagorean(int num1,int num2,int num3){
        if((num1*num1) + (num2 * num2) == (num3 * num3) ){
            System.out.println("given triplet is a Pythagorean triplet");
        }
        else{
            System.out.println("given triplet is not a Pythagorean triplet");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pythogorus_triplet p = new Pythogorus_triplet();
        p.Pythagorean(4, 3, 5);
        p.Pythagorean(4, 3, 6);
    }
}
