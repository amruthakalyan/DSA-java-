public class Intro{
       String BrandName;
       String carName;
       int ManufacturingYear;
       int Ex_Showroon_Price ;

       //Constructure function
       public Intro(String BrandName,String carName,int ManufacturingYear,int Ex_Showroon_Price){
             this.BrandName = BrandName;
             this.carName = carName;
             this.ManufacturingYear = ManufacturingYear;
             this.Ex_Showroon_Price =Ex_Showroon_Price;
       }
        void display(){
            System.out.println(BrandName);
            System.out.println(carName);
            System.out.println(ManufacturingYear);
            System.out.println(Ex_Showroon_Price);
        }
    
    public static void main(String[] args) {
        Intro c1 = new Intro( "Maruti Suzuki", "Fronx",2023,751000);
        c1.display();
        System.out.println();
        Intro c2 = new Intro( "Tata", "Punch",2021,613000);
        c2.display();
        

    }
}