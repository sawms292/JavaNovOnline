import java.util.Scanner;
public class Switch {

    public static void main(String[] args) {
        Scanner inputDays = new Scanner(System.in);
        int dayOfWeek;
        String dayName;
        System.out.println("Enter day 1-7");
        dayOfWeek = inputDays.nextInt();
    

        switch (dayOfWeek) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;

            default:
                dayName = "Invalid day";
                break;
        }

        System.out.println("Day of the week: " + dayName);
    }
    
}