import java.util.Scanner;

public class AssignmentFive {
    public static void main(String[] args){
        String[][] carDetails = {
            {"VIP", "2024", "pre-order"},
            {"Cheap", "old", "for sale"}
        };

        for(int i= 0; i<5; i++){
                Scanner input = new Scanner(System.in);
                System.out.println("Enter Brand of Car : ");
                String brand = input.nextLine();
                System.out.println("Price of the Car : ");
                String price = input.nextLine();
                if(Integer.parseInt(price) >= 70000){
                        System.out.println("brand :" + brand + "price :" + price + "-->" + carDetails[0][0] + carDetails[0][1] + carDetails[0][2]);
            }else{
                System.out.println( "brand: " + brand + "price :" + price + "-->" + (carDetails[1]));
            }
            }
        }
    }