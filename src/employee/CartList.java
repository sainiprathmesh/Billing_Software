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
            dtm.addRow(oo);
            totalprice = totalprice + (Integer.parseInt(price) * Integer.parseInt(quantity));
        }

        jLabel2.setText(String.valueOf(totalprice));

    }

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {

//        row = jTable1.getSelectedRow();
//        select_itemid = (String) jTable1.getValueAt(row, 1);
//        quantity = (String) jTable1.getValueAt(row, 4);
//
//        String id, name = null, price = null, desc = null, category = null;
//        byte[] image = null;
//        try {
//            Connection con = dbconnection.DbConnection.getConnect();
//            PreparedStatement ps = con.prepareStatement("select * from items where id='" + select_itemid + "'");
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                image = rs.getBytes("image");
//            }
//
//            jComboBox1.setSelectedItem(quantity);
//
//            Image img = Toolkit.getDefaultToolkit().createImage(image);
//            Image new_imgg = img.getScaledInstance(jLabel3.getWidth(), jLabel3.getHeight(), Image.SCALE_SMOOTH);
//            ImageIcon icon = new ImageIcon(new_imgg);
//            jLabel3.setIcon(icon);
//        } catch (Exception e) {
//            System.out.println(e);
//        }

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
