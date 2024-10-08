import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class DroneManage {
    static void addDroneRecord(List<Map<String, String>> droneTable, Scanner input) {
        Map<String, String> drone = new HashMap<>();
        askForInput("serialNumber", drone, input);
        askForInput("name", drone, input);
        askForInput("model", drone, input);
        askForInput("status", drone, input);
        askForInput("location", drone, input);
        askForInput("manufacturer", drone, input);
        askForInput("year", drone, input);
        askForInput("weightCap", drone, input);
        askForInput("distanceAutonomy", drone, input);
        askForInput("maxSpeed", drone, input);
        askForInput("warrantyExp", drone, input);
        droneTable.add(drone);
    }

    static void askForInput(String name, Map<String, String> drone, Scanner input) {
        System.out.println("Enter the " + name);
        String userInput = input.nextLine();
        drone.put(name, userInput);
    }

    static Map<String, String> searchDrone(List<Map<String, String>> droneTable, Scanner input) {
        System.out.println("Enter the serial number");
        String serialNum = input.nextLine();
        for (Map<String, String> drone : droneTable) {
            if (drone.get("serialNumber").equals(serialNum)) { 
                return drone;
            }
        }
        return null;
    }

    static Map<String, String> deleteDrone(List<Map<String, String>> droneTable, Scanner input) {
        Map<String, String> drone = searchDrone(droneTable, input);
        if (drone != null) {
            droneTable.remove(drone);
            System.out.println("Record deleted.");
        } else {
            System.out.println("Serial number does not exist.");
        }
        return drone;
    }

    static void editDrone(List<Map<String, String>> droneTable, Scanner input) {
        Map<String, String> drone = searchDrone(droneTable, input);
        if (drone != null) {
            System.out.println("What attribute would you like to edit?");
            String attribute = input.nextLine();
            if (drone.containsKey(attribute)) {
                System.out.println("What would you like the new value to be?");
                String newValue = input.nextLine();
                drone.put(attribute, newValue);
                System.out.println("Record updated.");
            } else {
                System.out.println("That attribute does not exist.");
            }
        } else {
            System.out.println("Serial number does not exist.");
        }
    }
}
