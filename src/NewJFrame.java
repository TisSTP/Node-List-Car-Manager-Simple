import javax.swing.*;

public class NewJFrame extends JFrame {
    private JButton insertCarButton;
    private JButton deleteAllButton;
    private JButton printNumberOfCarsButton;
    private JButton printListButton;
    private JButton setBrandButton;
    private JButton printBrandButton;
    private JTextArea textArea;
    private JPanel jpanel;


    public void run() {
        JFrame frame = new JFrame("Car Manager");
        frame.setContentPane(new NewJFrame().jpanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
