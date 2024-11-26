public class PrivatePerson {
    //private fields
    private int age;       
    private String name;
    private double height;
    private double weight;

    public PrivatePerson(int age, String name, double height, double weight) {
        this.age = age;
        this.name = name;
        this.height = height;
        this.weight = weight;
    }/*Hello,
    these is
    my
    commend*/

    public double calculateBMI() {
        return height / (weight + age);
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " m");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("BMI: " + calculateBMI());
    }

    public static void main(String[] args) {
        PrivatePerson person = new PrivatePerson(24, "Saw", 177.79, 75.5);
        person.displayDetails();
    }
}
