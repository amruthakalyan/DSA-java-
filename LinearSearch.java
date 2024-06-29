import java.util.Scanner;

public class LinearSearch {
    int linearsearch(int a[],int key){
        for(int i=0;i<a.length;i++){
            if(a[i] == key){
               return i;
            }   
        }
        return -1;  
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int a[] ={1, 2, 3, 4};
        int key = 3;
        LinearSearch ls = new LinearSearch();
       System.out.println( ls.linearsearch(a, key));
    }
}
