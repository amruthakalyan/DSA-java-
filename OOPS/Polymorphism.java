//Polymorphism- many forms 
// two types - compile time and run time polymorphism
//Function Overloading - functions with same names but different arguments and return types
class Shapes{
    void area(){
     System.out.println("Im area inside shapes");
    }
}
class Square extends Shapes{
    void area(){
        System.out.println("Im area inside Square");
    }
}
class Triangle extends Shapes{
    void area(){
        System.out.println("Im area inside Triangle");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Shapes s = new Shapes();
        Square sq = new Square();
        Triangle t = new Triangle();
        Shapes o = new Triangle();//upcasting
        o.area();
        s.area();
        sq.area();
        t.area();
    }
}
