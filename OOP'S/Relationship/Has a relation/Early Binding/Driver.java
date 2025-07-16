public class Driver {
    public static void main(String[] args){
        System.out.println("Welcome");
        Car car = new Car("BMW","Black",1000);
        System.out.println("Brand: "+car.Brand);
        System.out.println("Color : "+car.Color);
        System.out.println("Price : "+car.Price);
        System.out.println("HP : "+car.eHP);
        System.out.println("CC : "+car.eU);
    }
}
