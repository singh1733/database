import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class EquipManage {
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
}
