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

    private JLabel jLabel4;
    private JButton jButton2;
    private JButton jButton1;

}
