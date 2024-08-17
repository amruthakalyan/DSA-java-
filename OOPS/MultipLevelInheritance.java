class Box1{
    String name;
    int age;
    Box1(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println("This is Box1");
    }
}
class Box2 extends Box1{
    int weight;
    Box2(String name,int age,int weight){
        super(name, age);
        this.weight = weight;
        System.out.println("This is Box2");
    }
}
class Box3 extends Box2{
    int marks;
    Box3(String name,int age,int weight,int marks){
        super(name, age,weight);
        this.marks = marks;
        System.out.println("This is box3");
    }
}
public class MultipLevelInheritance {
    public static void main(String[] args) {
        // Box2 b2 = new Box2();
        Box3 b3 = new Box3("kalyan",21,90,99);
        System.out.println(b3.name +" "+b3.age+" "+b3.weight+" "+b3.marks);
    }
}
