package employee;

import model.EmpDetails;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;

public class CartList extends javax.swing.JFrame {
    int row;
    String select_itemid, quantity;
    EmpDetails ed;
    HashMap<Integer, ArrayList> hm;

    public CartList(EmpDetails ed, HashMap hm) {

        this.ed = ed;
        this.hm = hm;

//        initComponents();
    }

    private JTable jTable1;
    private JLabel jLabel4;
    private JButton jButton2;
    private JButton jButton1;
    private JComboBox<String> jComboBox1;
    private JLabel jLabel3;
    private JLabel jLabel2;
    private JLabel jLabel1;
    private JScrollPane jScrollPane1;

    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new CartList(null, null).setVisible(true);
//            }
//        });
    }
}
