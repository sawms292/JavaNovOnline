import java.util.Scanner;

public class Assignment {

    private class Car {
        private String model;
        private String make;
        private double price;

        public Car(String model, String make, double price) {
            this.model = model;
            this.make = make;
            this.price = price;
        }

        public double getPrice() {
            return price;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Assignment assignment = new Assignment();

        Car car1 = assignment.getCarDetails(scanner);
        Car car2 = assignment.getCarDetails(scanner);
        Car car3 = assignment.getCarDetails(scanner);

        double averagePrice = (car1.getPrice() + car2.getPrice() + car3.getPrice()) / 3;
        System.out.println("The average price of the cars is: " + averagePrice);
       if (averagePrice >=100000){
            System.out.println("Expensive");
        } else if(averagePrice >= 50000 && averagePrice <= 99999){
            System.out.println("Normal price");
        } else {//用else if
            System.out.println("Cheap");
        }
        
        String check = (averagePrice >= 100000) ? "Expensive" : (averagePrice >= 50000 && averagePrice <= 99999) ? "Normal price" : "Cheap";
        System.out.println(check);
    }

    private Car getCarDetails(Scanner scanner) {
        System.out.println("Enter car model:");
        String model = scanner.nextLine();
        System.out.println("Enter car make:");
        String make = scanner.nextLine();
        System.out.println("Enter car price:");
        double price = scanner.nextDouble();
        scanner.nextLine(); // consume the newline character
        return new Car(model, make, price);
    }
}
