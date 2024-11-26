public class PrivatePerson {

    private int age = 24;            
    private String name = "Saw"; 
    private double height = 1.79;    
    private double weight = 75.5;

    public PrivatePerson(int age, String name, double height, double weight) {
        this.age = age;
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public double calculateBMI() {
        return weight / (height * height);
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " m");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("BMI: " + calculateBMI());
    }

    public static void main(String[] args) {
        PrivatePerson person = new PrivatePerson(24, "Saw", 1.79, 75.5);
        person.displayDetails();
    }
}
