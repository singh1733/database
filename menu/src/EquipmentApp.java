import java.util.Scanner;

// This is the main class that runs the application
public class EquipmentApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("\nMain Menu:");
            System.out.println("1. Rent Equipment");
            System.out.println("2. Return Equipment");
            System.out.println("3. Delivery of Equipment");
            System.out.println("4. Pickup of Equipment");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            String choice = input.nextLine();

            switch (choice) {
                case "1":
                    rentEquipment(input);
                    break;
                case "2":
                    returnEquipment(input);
                    break;
                case "3":
                    deliverEquipment(input);
                    break;
                case "4":
                    pickupEquipment(input);
                    break;
                case "5":
                    System.out.println("Exiting...");
                    input.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    // This method is taking info renting equipment
    private static void rentEquipment(Scanner input) {
        System.out.print("Enter clientId ID: ");
        String clientId = input.nextLine();
        System.out.print("Enter serial number of equipment: ");
        String serialNumber = input.nextLine();
        System.out.print("Enter checkout date: ");
        String checkoutDate = input.nextLine();
        System.out.println("Equipment rented.");
        System.out.println("Equipment serial number is "+serialNumber+" and client ID is "+clientId+" and checkout date is "+checkoutDate);

    }
    // This method is taking info returning equipment
    private static void returnEquipment(Scanner input) {
        System.out.print("Enter client ID: ");
        String clientId = input.nextLine();
        System.out.print("Enter serial number of equipment: ");
        String serialNumber = input.nextLine();
        System.out.print("Enter return date: ");
        String returnDate = input.nextLine();
        System.out.println("Equipment returned.");
        System.out.println("Equipment serial number is "+serialNumber+" and client ID is "+clientId+" and return date is "+returnDate);
    }
    // This method is taking info delivering equipment
    private static void deliverEquipment(Scanner input) {
        System.out.print("Enter clientId ID: ");
        String clientId = input.nextLine();
        System.out.print("Enter serial number of equipment: ");
        String serialNumber = input.nextLine();
        System.out.print("Enter delivery date: ");
        String deliveryDate = input.nextLine();
        System.out.print("Enter serial number of drone: ");
        String DserialNumber = input.nextLine();
        System.out.println("Equipment delivered.");
        System.out.println("Equipment serial number is "+serialNumber+" and client ID is "+clientId+" and delivery date is "+deliveryDate+" and drone serial number is "+DserialNumber);
    }
    // This method is taking info picking up equipment
    private static void pickupEquipment(Scanner input) {
        System.out.print("Enter clientId ID: ");
        String clientId = input.nextLine();
        System.out.print("Enter serial number of equipment: ");
        String serialNumber = input.nextLine();
        System.out.print("Enter pickup date: ");
        String pickupDate = input.nextLine();
        System.out.print("Enter serial number of drone: ");
        String DserialNumber = input.nextLine();
        System.out.println("Equipment picked up.");
        System.out.println("Equipment serial number is "+serialNumber+" and client ID is "+clientId+" and pickup date is "+pickupDate+" and drone serial number is "+DserialNumber);
    }
}