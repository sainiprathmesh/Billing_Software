package employee;

import model.EmpDetails;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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

    private void formWindowOpened(java.awt.event.WindowEvent evt) {
        ArrayList al;
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        int srno = 0;
        String name, id, price, quantity;
        int totalprice = 0;
        for (Map.Entry m : hm.entrySet()) {
            srno = srno + 1;
            al = (ArrayList) m.getValue();
            id = (String) al.get(0);
            name = (String) al.get(1);
            price = (String) al.get(2);
            quantity = (String) al.get(3);
            Object[] oo = {srno, id, name, price, quantity, (Integer.parseInt(price) * Integer.parseInt(quantity))};
//            dtm.addRow(oo);
//
//            totalprice = totalprice + (Integer.parseInt(price) * Integer.parseInt(quantity));
        }

        jLabel2.setText(String.valueOf(totalprice));

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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CartList(null, null).setVisible(true);
            }
        });
    }
}
