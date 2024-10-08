import java.util.*;

public class App {
    static void addEquipRecord(List<Map<String, String>> equipmentTable, Scanner input) {
        Map<String, String> equipment = new HashMap<>();
        askForInput("serialNumber", equipment, input);
        askForInput("description", equipment, input);
        askForInput("type", equipment, input);
        askForInput("model", equipment, input);
        askForInput("year", equipment, input);
        askForInput("status", equipment, input);
        askForInput("location", equipment, input);
        askForInput("warrantyExpiration", equipment, input);
        askForInput("manufacturer", equipment, input);
        askForInput("weight", equipment, input);
        askForInput("dimensions", equipment, input);
        equipmentTable.add(equipment);
    }

    static void askForInput(String name, Map<String, String> equipment, Scanner input) {
        System.out.println("Enter the " + name);
        String userInput = input.nextLine();
        equipment.put(name, userInput);
    }

    static Map<String, String> searchEquip(List<Map<String, String>> equipmentTable, Scanner input) {
        System.out.println("Enter the serial number");
        String serialNum = input.nextLine();
        for (Map<String, String> equipment : equipmentTable) {
            if (equipment.get("serialNumber").equals(serialNum)) { // Compare with serial number
                return equipment;
            }
        }
        return null;
    }

    static void deleteEquip(List<Map<String, String>> equipmentTable, Scanner input) {
        Map<String, String> equipment = searchEquip(equipmentTable, input);
        if (equipment != null) {
            equipmentTable.remove(equipment);
            System.out.println("Record deleted.");
        } else {
            System.out.println("Serial number does not exist.");
        }
    }

    static void editEquip(List<Map<String, String>> equipmentTable, Scanner input) {
        Map<String, String> equipment = searchEquip(equipmentTable, input);
        if (equipment != null) {
            System.out.println("What attribute would you like to edit?");
            String attribute = input.nextLine();
            if (equipment.containsKey(attribute)) {
                System.out.println("What would you like the new value to be?");
                String newValue = input.nextLine();
                equipment.put(attribute, newValue);
                System.out.println("Record updated.");
            } else {
                System.out.println("That attribute does not exist.");
            }
        } else {
            System.out.println("Serial number does not exist.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Map<String, String>> equipmentTable = new ArrayList<>();

        while (true) {
            System.out.println("Enter the number of the table you would like to operate on, or enter anything to end this program:");
            System.out.println("1. Equipment");
            System.out.println("2. Drone");
            String table = input.nextLine();

            System.out.println("Enter the number of the task you want to do, or enter anything to end this program:");
            System.out.println("1. Add new records");
            System.out.println("2. Delete record");
            System.out.println("3. Edit record");
            System.out.println("4. Search");
            String option = input.nextLine();

            if (table.equals("1")) {
                if (option.equals("1")) {
                    addEquipRecord(equipmentTable, input);
                } else if (option.equals("2")) {
                    deleteEquip(equipmentTable, input);
                } else if (option.equals("3")) {
                    editEquip(equipmentTable, input);
                } else if (option.equals("4")) {
                    Map<String, String> equipment = searchEquip(equipmentTable, input);
                    if (equipment != null) {
                        System.out.println("Record found: " + equipment);
                    } else {
                        System.out.println("Record not found.");
                    }
                } else {
                    System.out.println("Invalid choice. Ending program.");
                    input.close();
                    return;
                }
            } else if (table.equals("2")) {
                // Code for Drone table can be implemented here
                System.out.println("Drone table functionality not yet implemented.");
            } else {
                System.out.println("Invalid choice. Ending program.");
                input.close();
                return;
            }
        }
    }
}
