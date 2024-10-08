import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EquipmentAppGUI extends JFrame {
    
    public EquipmentAppGUI() {
        //pre setup main frame
        setTitle("Equipment App");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        
        // Create buttons
        JButton rentButton = new JButton("Rent Equipment");
        JButton returnButton = new JButton("Return Equipment");
        JButton deliverButton = new JButton("Delivery of Equipment");
        JButton pickupButton = new JButton("Pickup of Equipment");
        JButton exitButton = new JButton("Exit");

        // Set up the layout and adding each option
        setLayout(new GridLayout(5, 1));
        add(rentButton);
        add(returnButton);
        add(deliverButton);
        add(pickupButton);
        add(exitButton);
        
        // ActionListeners
        rentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rentEquipment();
            }
        });
        
        returnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                returnEquipment();
            }
        });
        
        deliverButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deliverEquipment();
            }
        });
        
        pickupButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pickupEquipment();
            }
        });
        
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
    
    private void rentEquipment() {
        String clientID = JOptionPane.showInputDialog(this, "Enter client ID:");
        String EserialNum = JOptionPane.showInputDialog(this, "Enter Equipment serial number:");
        String checkoutDate = JOptionPane.showInputDialog(this, "Enter checkout date:");
        JOptionPane.showMessageDialog(this, "Equipment rented.\nClient ID: " + clientID + "\nEquipment serial number: " + EserialNum + "\nCheckout Date: " + checkoutDate);
    }

    private void returnEquipment() {
        String clientID = JOptionPane.showInputDialog(this, "Enter client ID:");
        String EserialNum = JOptionPane.showInputDialog(this, "Enter quipment serial number:");
        String returnDate = JOptionPane.showInputDialog(this, "Enter return date:");
        JOptionPane.showMessageDialog(this, "Equipment returned.\nClient ID: " + clientID + "\nEquipment serial number: " + EserialNum + "\nReturn Date: " + returnDate);
    }

    private void deliverEquipment() {
        String clientID = JOptionPane.showInputDialog(this, "Enter client ID:");
        String EserialNum = JOptionPane.showInputDialog(this, "Enter Equipment serial number:");
        String deliveryDate = JOptionPane.showInputDialog(this, "Enter delivery date:");
        String DserialNum = JOptionPane.showInputDialog(this, "Enter drone serial number:");
        JOptionPane.showMessageDialog(this, "Equipment delivered.\nClient ID: " + clientID + "\nEquipment serial number: " + EserialNum + "\nDelivery Date: " + deliveryDate + "\nDrone serial number: " + DserialNum);
    }

    private void pickupEquipment() {
        String clientID = JOptionPane.showInputDialog(this, "Enter client ID:");
        String EserialNum = JOptionPane.showInputDialog(this, "Enter Equipment serial number:");
        String pickupDate = JOptionPane.showInputDialog(this, "Enter pickup date:");
        String DserialNum = JOptionPane.showInputDialog(this, "Enter drone serial number:");
        JOptionPane.showMessageDialog(this, "Equipment picked up.\nClient ID: " + clientID + "\nEqquipment serial numberD: " + EserialNum + "\nPickup Date: " + pickupDate + "\nDrone serial number: " + DserialNum);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                new EquipmentAppGUI().setVisible(true);
            }
        });
    }
}