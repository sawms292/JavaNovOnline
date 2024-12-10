import java.util.Scanner;
interface Cars{
    void des();
}

class bmw implements Cars{
    public void des(){
        System.out.println("BMW is one of the coolest car in the world");
    }
}

class tesla implements Cars{
    public void des(){
        System.out.println("Yes, Tesla is the best electric car");
    }
}

public class CarInterface {
    public static void main(String[] args) {
        String car;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter car name: ");
        car = sc.nextLine().trim();

        switch(car){
            case "bmw":
                Cars explain1 = new bmw();
                explain1.des();
                break;
            case "tesla":
                Cars explain2 = new tesla();
                explain2.des();
                break;
            default:
                System.out.println("Car name not found");
        }
        sc.close();
    }
}