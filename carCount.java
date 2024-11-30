public class carCount {
    private static String[] agent = {"saw", "tan", "ng"};
    private String carModel;
    private int carYear;
    private double carPrice;

    public carCount(String carModel, int carYear, double carPrice) {
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
        carCount[] cars = {
            new carCount("Tesla", 2022, 15000.0),
            new carCount("Vios", 2015, 3000.0),
            new carCount("Honda", 2010, 1000.0)
        };

        double totalPrice = 0;
        int i = 0;
        for (carCount car : cars) {
            totalPrice += car.getCarPrice();
            System.out.println("Agent Name: " + agent[i] + "," + " Car Model: " + car.getCarModel() + "," + " Car Year: " + car.getCarYear() + "," + " Car Price: " + car.getCarPrice());
            i++;
        }

        double averagePrice = totalPrice / cars.length;
        System.out.println("The average price of the cars is: " + averagePrice);
    }
}