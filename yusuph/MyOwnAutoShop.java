public class MyOwnAutoShop {
    public static void main (String[]args){
        Sedan sedan = new Sedan(202,424.1,"black",24,2.3);
        Ford ford1 = new Ford(879,543.0,"violate",298,5552);
        Ford ford2 = new Ford(97,32.0,"brown",4,234);
        Car car = new Car(1432,574.8,"gold");

        System.out.println("Sedan price is:" + sedan.getSalePrice());
        System.out.println("ford1 price is:" + ford1.getSalePrice());
        System.out.println("ford2 price is:" + ford2.getSalePrice());
        System.out.println("Car price is:" + car.getSalePrice());


    }
}