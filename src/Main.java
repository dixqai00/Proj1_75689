public class Main {

    public static void main(String[] args) {
        Car car = new Car("Corolla", "Toyota", 2022, 85000.0, "Red", 2);
        Car car2 = new Car("911", "Porsche", 2019, 99000.0, "White", 1);

        System.out.println(car.toString());
        System.out.println(car2.toString());

        car.sell();
        car2.sell();


//        System.out.println("Model: " + car.getModel());
//        System.out.println("Brand: " + car.getBrand());
//        System.out.println("Year: " + car.getYear());
//        System.out.println("Price: " + car.getPrice());
//        System.out.println("Color: " + car.getColor());
//        System.out.println("Quantity: " + car.getQuantity());
//
//        System.out.println("Model: " + car2.getModel());
//        System.out.println("Brand: " + car2.getBrand());
//        System.out.println("Year: " + car2.getYear());
//        System.out.println("Price: " + car2.getPrice());
//        System.out.println("Color: " + car2.getColor());
//        System.out.println("Quantity: " + car2.getQuantity());

        car.setPrice(79999.99);

        System.out.println(car.toString());
        System.out.println(car2.toString());
    }
}