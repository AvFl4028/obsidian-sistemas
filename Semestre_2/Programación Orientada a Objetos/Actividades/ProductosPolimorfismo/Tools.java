import javax.swing.JOptionPane;

public class Tools {
    public static String input(String msg) {
        return JOptionPane.showInputDialog(msg);
    }

    public static void output(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }

    public static String menu(String title, String[] options) {
        Object selectedValue = JOptionPane.showInputDialog(null, title, title,
                JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        return (String) selectedValue;
    }
}
