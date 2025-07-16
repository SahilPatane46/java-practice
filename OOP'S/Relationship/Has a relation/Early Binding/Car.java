public class Car{
    String Brand;
    String Color;
    double Price;
    Engine e = new Engine("80",1500);

    public void drive(){
        System.out.println("Long Drive");
        Car(String Brand ,String Color,double Price){
            this.Brand=Brand;
            this.Color=Color;
            this.Price=Price;
        }
    }
}