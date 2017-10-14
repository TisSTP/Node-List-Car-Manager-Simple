import javax.swing.*;

public class InsertCar {
    private JTextField setBrand;
    private JTextField setPrice;
    private JTextField setDoors;
    private JTextField setModel;
    private JTextField setEngine;
    private JTextField setSeats;
    private JTextField setPower;
    private JTextField setColour;
    private JButton entryButton;
    private JButton cancelButton;
    private JPanel panel;
    private JLabel logocar;


    public static void main(String[] args) {
        JFrame frame = new JFrame("InsertCar");
        frame.setContentPane(new InsertCar().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        logocar = new JLabel(new ImageIcon("img/images.jpg"));
    }
}
