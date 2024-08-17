//Single Level Inheritance
class Car{
 String Bname;
 int year;
 Car(String name,int year){
   this.Bname = name;
   this.year = year;
 }
}
class Brand extends Car{
    String carname;
    Brand(String name,int year,String carname){
        super(name, year);
      this.carname = carname;
    }
}
public class SingleLevelInheritance {
  public static void main(String[] args) {
    Brand b = new Brand("Maruti",2025,"Fronx");
    System.out.println(b.Bname);
    System.out.println(b.carname);
    System.out.println(b.year);
  }
}
