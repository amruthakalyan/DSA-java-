import java.util.Scanner;
public class Greet{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.println("Enter your name:");
        name = sc.next();
        System.out.println("Hey "+name +" "+"I Welcomes you to Data Structures and Algorithms using Java..");
    }
}