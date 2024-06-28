// Take integer inputs till the user enters 0 and print the largest number from all.

import java.util.Scanner;

public class Largest_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        int i = 0, max = a[0];
        System.out.println("Enter array Elements:");
        for (i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            if (a[i] == 0) {
                break;
            }

        }
        for (i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Largest Number from the user inputs is:" + max);
    }
}
