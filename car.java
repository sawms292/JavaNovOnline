/*Have these values, car manufactures year, car, price, and car name. Then pass a value which can calculate car price multiply car manufactured year. */
public class car{
    private String carName;
    private int carYear;
    private double carPrice;

    public car(String carName, int carYear, double carPrice){
        this.carName = carName;
        this.carYear = carYear;
        this.carPrice = carPrice;
    }

    public void displayCarDetails(){
        double calculateCarPrice = carPrice * carYear; 
        System.out.println("Car Name: " + carName);
        System.out.println("Car Year: " + carYear);
        System.out.println("Car Price: " + carPrice);
        System.out.println("Car Price * Car Year: " + calculateCarPrice);
    }
    
    public static void main(String[] args){
        car car = new car("Toyota", 2010, 1000);
        car.displayCarDetails();
    }
}