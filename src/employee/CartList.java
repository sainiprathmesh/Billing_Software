package employee;

import model.EmpDetails;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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

        initComponents();
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CartList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CartList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CartList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CartList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CartList(null, null).setVisible(true);
            }
        });
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

        row = jTable1.getSelectedRow();
        select_itemid = (String) jTable1.getValueAt(row, 1);
        quantity = (String) jTable1.getValueAt(row, 4);
        String id, name = null, price = null, desc = null, category = null;
        byte[] image = null;
        try {
            Connection con = dbconnection.DbConnection.getConnect();
            PreparedStatement ps = con.prepareStatement("select * from items where id='" + select_itemid + "'");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                image = rs.getBytes("image");
            }

            jComboBox1.setSelectedItem(quantity);

            Image img = Toolkit.getDefaultToolkit().createImage(image);
            Image new_imgg = img.getScaledInstance(jLabel3.getWidth(), jLabel3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(new_imgg);
            jLabel3.setIcon(icon);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        int i = JOptionPane.showConfirmDialog(rootPane, "Are you sure you want to update?");
        if (i == 0) {
            try {
                String qnty = (String) jComboBox1.getSelectedItem();

                ArrayList al;
                for (Map.Entry me : hm.entrySet()) {
                    al = (ArrayList) me.getValue();
                    if (al.contains(select_itemid)) {
                        al.set(3, qnty);
                    }
                }

                DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                String price = (String) jTable1.getValueAt(row, 3);
                dtm.setValueAt(qnty, row, 4);
                dtm.setValueAt((Integer.parseInt(qnty) * Integer.parseInt(price)), row, 5);

                ArrayList al1;
                int totalprice = 0;
                String price1;
                for (Map.Entry m : hm.entrySet()) {
                    al1 = (ArrayList) m.getValue();
                    price1 = (String) al1.get(2);
                    quantity = (String) al1.get(3);

                    totalprice = totalprice + (Integer.parseInt(price1) * Integer.parseInt(quantity));
                }
                jLabel2.setText(String.valueOf(totalprice));

                JOptionPane.showMessageDialog(rootPane, "Item updated into cart successfully");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Item not updated due to some error");
            }
        }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {

        int i = JOptionPane.showConfirmDialog(rootPane, "Are you sure you want to delete this item");
        if (i == 0) {
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            int totalprice1 = (Integer) jTable1.getValueAt(row, 5);

            String item_id = (String) jTable1.getValueAt(row, 1);
            int hmkey;
            int ii = 0;
            for (Map.Entry<Integer, ArrayList> map : this.hm.entrySet()) {
                ArrayList al = map.getValue();
                if (al.get(ii).equals(item_id)) {
                    hmkey = map.getKey();
                    hm.remove(hmkey);
                }
                ii = ii + 1;
            }


            String totalprice2 = jLabel2.getText();
            int newprice = Integer.parseInt(totalprice2) - totalprice1;
            jLabel2.setText(String.valueOf(newprice));

            dtm.removeRow(row);
            jLabel3.setIcon(new ImageIcon(getClass().getResource("/images/no_products_found.png")));

            jComboBox1.setSelectedIndex(0);

            for (Map.Entry<Integer, ArrayList> map : hm.entrySet()) {
                System.out.println(map.getKey());
            }

            JOptionPane.showMessageDialog(rootPane, "Item deleted from cart successfully");
        }

    }

    private void initComponents() {
        jScrollPane1 = new JScrollPane();
        jTable1 = new JTable();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jComboBox1 = new JComboBox<>();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jLabel4 = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                formWindowOpened(e);
            }
        });
        var contentPane = getContentPane();


        {

            jTable1.setModel(new DefaultTableModel(
                    new Object[][]{
                    },
                    new String[]{
                            "Sr.No", "Item ID", "Item Name", "Item Price", "Item Quantity", "Total Price"
                    }
            ) {
                boolean[] columnEditable = new boolean[]{
                        false, false, false, false, false, false
                };

                @Override
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return columnEditable[columnIndex];
                }
            });
            jTable1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    jTable1MouseClicked(e);
                }
            });
            jScrollPane1.setViewportView(jTable1);
        }

        jLabel1.setText("Total Price :");

        jLabel2.setText("________________");

        jComboBox1.setModel(new DefaultComboBoxModel<>(new String[]{
                "1",
                "2",
                "3",
                "4",
                "5",
                "6",
                "7",
                "8",
                "9",
                "10"
        }));

        jButton1.setText("Update");
        jButton1.addActionListener(e -> jButton1ActionPerformed(e));

        jButton2.setText("Delete");
        jButton2.addActionListener(e -> jButton2ActionPerformed(e));

        jLabel4.setFont(new Font("Tahoma", Font.BOLD, 18));
        jLabel4.setForeground(Color.red);
        jLabel4.setText("Back");
        jLabel4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jLabel4MouseClicked(e);
            }
        });

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGroup(contentPaneLayout.createParallelGroup()
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jLabel1)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabel2))
                                                        .addGroup(GroupLayout.Alignment.LEADING, contentPaneLayout.createSequentialGroup()
                                                                .addGap(73, 73, 73)
                                                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 646, GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(contentPaneLayout.createParallelGroup()
                                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                                .addGap(189, 189, 189)
                                                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jComboBox1, GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)))
                                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                                .addGap(181, 181, 181)
                                                                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(94, 94, 94)
                                                                .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addGap(33, 33, 33)
                                                .addComponent(jLabel4)))
                                .addContainerGap(144, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4)
                                .addGap(33, 33, 33)
                                .addGroup(contentPaneLayout.createParallelGroup()
                                        .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addGap(11, 11, 11)
                                                .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)
                                                .addGap(47, 47, 47)
                                                .addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
                                                .addGap(86, 86, 86)
                                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jButton1, GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                                                        .addComponent(jButton2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(28, 28, 28)
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2))
                                .addContainerGap(218, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(null);
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

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {
        StartBilling sb = new StartBilling(ed, hm);
        sb.setVisible(true);
        setVisible(false);

    }
}
