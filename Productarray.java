//Product of array except itself
public class Productarray {
    void productOfArray(int[]a){
        int i,product=1;
        int[]res = new int[a.length];
        for(i=0;i<a.length;i++){
            product *=a[i];
        }
        for(i=0;i<a.length;i++){
            res[i] = product/a[i];
        }
        for(i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
    public static void main(String[] args) {
        Productarray pa = new Productarray();
        int[]a = {10,3,5,6,2};
        pa.productOfArray(a);
    }
}
