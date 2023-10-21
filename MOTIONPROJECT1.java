import java.util.Scanner;

public class MOTIONPROJECT1;
protected Object clone() throws CloneNotSupportedException {
    // TODO Auto-generated method stub
    return super.clone();
} {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueConversion = true;
        while (continueConversion) {
            System.out.println("Enter temprature in celsius,");
            if (scanner.hasNextDouble()) {
                double celsius = scanner.nextDouble();
                double fahrenheit = (celsius * 9 / 5) + 32;
                System.out.println("Temprature in fahrenheit;" + fahrenheit);
            } else {
                System.out.println("Invalid input!please enter a valid temprature in celsius.");
            }
            System.out.println("Do you to convert another temprature?(Y/N):");
            String continueOption = scanner.next();
            if (!continueOption.equalsIgnoreCase("Y")) {
                continueConversion = false;
            }
        }
        System.out.println("Thank you for using the celsius to fahrenheit converter!");
        scanner.close();
    }
}
    

