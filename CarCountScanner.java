import java.util.Scanner;

public class CarCountScanner {
    public static String[] agent = {"saw", "tan", "ng"};
    private String carModel;
    private int carYear;
    private double carPrice;

    public CarCountScanner(String carModel, int carYear, double carPrice) {
        this.carModel = carModel;
        this.carYear = carYear;
        this.carPrice = carPrice;
    }

    public String getCarModel() {
        return carModel;
    }

    public int getCarYear() {
        return carYear;
    }

    public double getCarPrice() {
        return carPrice;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        CarCountScanner[] cars = new CarCountScanner[3]; 
        
        for (int i = 0; i < cars.length; i++) {
            System.out.println("Enter details for car:");

            System.out.print("Enter car model: ");
            String model = scanner.nextLine();

            System.out.print("Enter car year: ");
            int year = scanner.nextInt();

            System.out.print("Enter car price: ");
            double price = scanner.nextDouble();
            scanner.nextLine();  

            cars[i] = new CarCountScanner(model, year, price);
        }

        double totalPrice = 0;
        for (int i = 0; i < cars.length; i++) {
            totalPrice += cars[i].getCarPrice();
            System.out.println("Agent Name: " + agent[i] + ", Car Model: " + cars[i].getCarModel() + ", Car Year: " + cars[i].getCarYear() + ", Car Price: " + cars[i].getCarPrice());
        }

        double averagePrice = totalPrice / cars.length;
        System.out.println("The average price of the cars is: " + averagePrice);
        
        scanner.close();
    }
}
