
import java.util.Scanner;
class Cars{
    void price(){
        System.out.println("Nothing");
    }
}

class toyota extends Cars{
    void price(){
        System.out.println("Toyota price is RM25000");
    }
}

class bmw extends Cars{
    void price(){
        System.out.println("BMW price is RM85000");
    }
}

class testla extends Cars{
    void price(){
        System.out.println("Testla price is RM75000");
    }
}

class Polymorphism {


    public static void main(String[] args) {
        String car;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter car name: ");
        car = sc.nextLine().trim();

        if(car.equalsIgnoreCase("toyota")){
            Cars price = new toyota();
            price.price();
        }
        else if(car.equalsIgnoreCase("bmw")){
            Cars price = new bmw();
            price.price();
        }
        else if(car.equalsIgnoreCase("tesla")){
            Cars price = new testla();
            price.price();
        }else{
            System.out.println("Car name not found");
        }

    }
}