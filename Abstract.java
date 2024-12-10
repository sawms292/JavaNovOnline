
import java.util.Scanner;
abstract class Cars{
    abstract void price();
        
    void des(){
        System.out.println("The power of dreams");
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

class Abstract {


    public static void main(String[] args) {
        String car;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter car name: ");
        car = sc.nextLine().trim();

        switch(car){
            case "toyota":
                Cars price1 = new toyota();
                price1.des();
                price1.price();
                break;
            case "bmw":
                Cars price2 = new bmw();
                price2.des();
                price2.price();
                break;
            case "tesla":
                Cars price3 = new testla();
                price3.des();
                price3.price();
                break;
            default:
                System.out.println("Car name not found");
        }

      /* if(car.equalsIgnoreCase("toyota")){
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
        } */ 

    }
}