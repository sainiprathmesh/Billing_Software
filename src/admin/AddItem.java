package admin;

import javax.swing.*;
import java.io.File;

/**
 * @author prathmeshkumarsaini on 06/09/20 at 11:44 PM
 */
public class AddItem extends javax.swing.JFrame {
    File file;

    public AddItem() {
        initComponents();
    }

    private JLabel jLabel1;
    private JLabel jLabel2;
    private JTextField jTextField1;
    private JLabel jLabel3;
    private JTextField jTextField2;
    private JLabel jLabel4;
    private JTextField jTextField3;
    private JLabel jLabel5;
    private JComboBox<String> jComboBox1;
    private JLabel jLabel6;
    private JScrollPane jScrollPane1;
    private JTextArea jTextArea1;
    private JLabel jLabel7;
    private JButton jButton1;
    private JLabel jLabel8;
    private JButton jButton2;

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jTextField1 = new JTextField();
        jLabel3 = new JLabel();
        jTextField2 = new JTextField();
        jLabel4 = new JLabel();
        jTextField3 = new JTextField();
        jLabel5 = new JLabel();
        jComboBox1 = new JComboBox<>();
        jLabel6 = new JLabel();
        jScrollPane1 = new JScrollPane();
        jTextArea1 = new JTextArea();
        jLabel7 = new JLabel();
        jButton1 = new JButton();
        jLabel8 = new JLabel();
        jButton2 = new JButton();
    }
}
