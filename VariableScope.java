public class VariableScope {

    // Instance variables
    int age = 24;            
    String name = "saw"; 
    double height = 1.79;    

    // Static variable
    static int staticVariable = 26;

    public void showLocalVariable() {
        int localVariable = 30;
        System.out.println("Local Variable: " + localVariable);
        System.out.println("Instance Variable (age): " + age);
        System.out.println("Instance Variable (name): " + name);
        System.out.println("Instance Variable (height): " + height);
        System.out.println("Static Variable: " + staticVariable);
    }

    public void showInstanceVariable() {
        System.out.println("Instance Variable (age): " + age);
        System.out.println("Instance Variable (name): " + name);
        System.out.println("Instance Variable (height): " + height);
        System.out.println("Static Variable: " + staticVariable);
    }

    public static void main(String[] args) {
        VariableScope newvar = new VariableScope();
        newvar.showLocalVariable();
        newvar.showInstanceVariable();
    }
}
