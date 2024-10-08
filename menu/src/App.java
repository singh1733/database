import java.util.*;

public class App {
    

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
                    EquipManage.addEquipRecord(equipmentTable, input);
                } else if (option.equals("2")) {
                    EquipManage.deleteEquip(equipmentTable, input);
                } else if (option.equals("3")) {
                    EquipManage.editEquip(equipmentTable, input);
                } else if (option.equals("4")) {
                    Map<String, String> equipment = EquipManage.searchEquip(equipmentTable, input);
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
