package softwarebilling;

import javax.swing.*;

/**
 * @author prathmeshkumarsaini on 19/08/20 at 9:12 PM
 */
public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

    /*
     * GUI Design Code
     * */
    @SuppressWarnings("unchecked")
    private void initComponents() {
        jTextField1 = new JTextField();
        jPasswordField1 = new JPasswordField();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jLabel1 = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        var contentPane = getContentPane();

        // --- jButton1 ---
        jButton1.setText("Login");
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private JTextField jTextField1;
    private JPasswordField jPasswordField1;
    private JButton jButton1;
    private JButton jButton2;
    private JLabel jLabel1;
}
