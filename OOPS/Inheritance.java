public class Inheritance {
    static class Box{
        int length;
        int breadth;
        int height;
        Box(){
          this.length =-1;
          this.breadth =-1;
          this.height =-1;
        }
        //cube
        Box(int side){
           this.length = side;
           this.breadth = side;
           this.height = side;
        }
        Box(int length,int breadth,int height){
            this.length = length;
            this.breadth = breadth;
            this.height = height;
        }
    }
    public static class Box1 extends Box{
        int weight =-1;
        Box1(int length,int breadth,int height,int weight){
        super(length,breadth,height);//super() is used to call parent class constructor
        this.weight = weight;
        }
    }
    public static void main(String[] args) {
        Box box = new Box();
        Box box1 = new Box(4);
        System.out.println("Lenght:"+ box.length+" Breadth:"+box.breadth+" Height:"+box.height);
        System.out.println("Lenght:"+ box1.length+" Breadth:"+box1.breadth+" Height:"+box1.height);
        Box1 box2 = new Box1(2,3,4,5);
        System.out.println("Lenght:"+ box2.length+" Breadth:"+box2.breadth+" Height:"+box2.height);
     }
}
