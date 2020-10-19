package employee;

import model.EmpDetails;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;

public class StartBilling extends javax.swing.JFrame {
    ArrayList al;
    HashMap<Integer, ArrayList> hm;
    int count = 0;
    EmpDetails ed;

    private JLabel jLabel1;
    private JTextField jTextField1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JLabel jLabel10;
    private JLabel jLabel12;
    private JScrollPane jScrollPane1;
    private JTextArea jTextArea1;
    private JButton jButton1;
    private JComboBox<String> jComboBox1;
    private JLabel jLabel11;
    private JButton jButton2;

    public StartBilling(EmpDetails ed, HashMap hm) {
//        initComponents();
        jButton1.setEnabled(false);
        jComboBox1.setEnabled(false);
        this.ed = ed;

        System.out.println(hm);
    }

}
