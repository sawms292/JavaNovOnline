import java.util.Scanner;
public class Encapsulation{
    private String name;
    private int age;
    private double height;
    private double weight;

    // Getters
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getHeight(){
        return height;
    }
    public double getWeight(){
        return weight;
    }
    // End pf Getters

    //Setter
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    // End of Setter

    public static void main(String[] args){
        double bmiCal =0;
        //input
        Scanner newScanner = new Scanner(System.in);
        Encapsulation personInfo = new Encapsulation();

        System.out.println("Enter Your Name");
        personInfo.setName(newScanner.nextLine());
        
        System.out.println("Enter Your Age");
        personInfo.setAge(newScanner.nextInt());

        System.out.println("Enter Your height");
        personInfo.setHeight(newScanner.nextDouble());

        System.out.println("Enter Your Weight");
        personInfo.setWeight(newScanner.nextDouble());
        //End of input

        //Cal Bmi
        double heightD = personInfo.getHeight()/100;
        bmiCal = personInfo.getWeight()/(heightD*heightD);
        System.out.println("The person Name is: " + personInfo.getName() + " he/she Age is: " + personInfo.getAge() + " he/she bmi is: " + bmiCal);
        
        newScanner.close();
    }
}
