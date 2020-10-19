package employee;

import model.EmpDetails;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
        initComponents();
        jButton1.setEnabled(false);
        jComboBox1.setEnabled(false);
        this.ed = ed;

        System.out.println(hm);
        if (hm == null) {
            this.hm = new HashMap<>();
            jButton2.setEnabled(false);
        } else {
            this.hm = hm;

            for (Map.Entry<Integer, ArrayList> map : this.hm.entrySet()) {
                int key = map.getKey();
                if (key > count) {
                    count = key;
                }
            }

            jButton2.setEnabled(true);
        }

    }

    private void initComponents() {
        jLabel1 = new JLabel();
        jTextField1 = new JTextField();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        jLabel8 = new JLabel();
        jLabel9 = new JLabel();
        jLabel10 = new JLabel();
        jLabel12 = new JLabel();
        jScrollPane1 = new JScrollPane();
        jTextArea1 = new JTextArea();
        jButton1 = new JButton();
        jComboBox1 = new JComboBox<>();
        jLabel11 = new JLabel();
        jButton2 = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        var contentPane = getContentPane();

        jLabel1.setFont(new Font("Tahoma", Font.BOLD, 18));
        jLabel1.setForeground(new Color(255, 0, 51));
        jLabel1.setText("Back");
        jLabel1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
//        jLabel1.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                jLabel1MouseClicked(e);
//            }
//        });


//        jTextField1.addKeyListener(new KeyAdapter() {
//            @Override
//            public void keyReleased(KeyEvent e) {
//                jTextField1KeyReleased(e);
//            }
//        });


        jLabel2.setText("Item ID :");
        jLabel3.setText("Item Name :");
        jLabel4.setText("Item Price :");
        jLabel5.setText("Item Category :");
        jLabel6.setText("Item Description :");
        jLabel7.setText("Image");
        jLabel8.setText("_________________________________________");
        jLabel9.setText("_________________________________________");
        jLabel10.setText("_________________________________________");

        {
            jTextArea1.setEditable(false);
            jTextArea1.setColumns(20);
            jTextArea1.setRows(5);
            jScrollPane1.setViewportView(jTextArea1);
        }
        jButton1.setText("Add To Cart");
//        jButton1.addActionListener(e -> jButton1ActionPerformed(e));
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
//        jComboBox1.addItemListener(e -> jComboBox1ItemStateChanged(e));
        jLabel11.setText("____________________");

        jButton2.setText("Continue");
//        jButton2.addActionListener(e -> jButton2ActionPerformed(e));
        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGroup(contentPaneLayout.createParallelGroup()
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addGap(24, 24, 24)
                                                .addComponent(jLabel1))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addGap(142, 142, 142)
                                                .addGroup(contentPaneLayout.createParallelGroup()
                                                        .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(jLabel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jLabel2)
                                                                .addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jLabel5))
                                                        .addComponent(jLabel6))
                                                .addGap(79, 79, 79)
                                                .addGroup(contentPaneLayout.createParallelGroup()
                                                        .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 315, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel9)
                                                        .addComponent(jLabel10)
                                                        .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                                .addComponent(jScrollPane1, GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel8, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE))))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addGap(220, 220, 220)
                                                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)))
                                .addGroup(contentPaneLayout.createParallelGroup()
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addGap(226, 226, 226)
                                                .addComponent(jLabel7)
                                                .addContainerGap())
                                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 207, Short.MAX_VALUE)
                                                .addGroup(contentPaneLayout.createParallelGroup()
                                                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                                                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                                        .addComponent(jLabel11, GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                                                        .addComponent(jComboBox1))
                                                                .addGap(124, 124, 124))
                                                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                                                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel12, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE))
                                                                .addGap(102, 102, 102))))))
        );
        contentPaneLayout.setVerticalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel1)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel7))
                                .addGroup(contentPaneLayout.createParallelGroup()
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addGap(59, 59, 59)
                                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel8))
                                                .addGroup(contentPaneLayout.createParallelGroup()
                                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                                .addGap(76, 76, 76)
                                                                .addComponent(jLabel9))
                                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                                .addGap(67, 67, 67)
                                                                .addComponent(jLabel4)))
                                                .addGap(69, 69, 69)
                                                .addComponent(jLabel5))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addGap(253, 253, 253)
                                                .addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel12, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE)
                                                .addGap(27, 27, 27)
                                                .addComponent(jLabel10)))
                                .addGroup(contentPaneLayout.createParallelGroup()
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addGap(28, 28, 28)
                                                .addGroup(contentPaneLayout.createParallelGroup()
                                                        .addComponent(jLabel6)
                                                        .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addGap(52, 52, 52)
                                                .addComponent(jLabel11, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))
                                .addGap(95, 95, 95))
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {
        EmpPanel ep = new EmpPanel(ed);
        ep.setVisible(true);
        setVisible(false);
    }

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {
        String item_id = jTextField1.getText();
        String name = null, price = null, desc = null, category = null;
        byte[] image = null;

        try {
            Connection con = dbconnection.DbConnection.getConnect();
            PreparedStatement ps = con.prepareStatement("select * from items where item_id='" + item_id + "'");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                name = rs.getString("item_name");
                price = rs.getString("item_price");
                desc = rs.getString("item_desc");
                category = rs.getString("item_category");
                image = rs.getBytes("item_image");
            }

            jTextArea1.setText(desc);
            jLabel8.setText(name);
            jLabel9.setText(price);
            jLabel10.setText(category);
            jLabel11.setText(price);

            if (image != null) {
                Image img = Toolkit.getDefaultToolkit().createImage(image);
                Image new_imgg = img.getScaledInstance(jLabel12.getWidth(), jLabel12.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon icon = new ImageIcon(new_imgg);
                jLabel12.setIcon(icon);
                jComboBox1.setSelectedIndex(0);
                jComboBox1.setEnabled(true);

                jButton1.setEnabled(true);
            } else {
                jLabel12.setIcon(new ImageIcon(getClass().getResource("/images/no_products_found.png")));

                jComboBox1.setSelectedIndex(0);
                jComboBox1.setEnabled(false);

                jButton1.setEnabled(false);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {
        String price = jLabel9.getText();
        if (price.trim().equals("")) {
            price = "0";
        }
        if (price != null) {
            String no = (String) jComboBox1.getSelectedItem();

            int total = Integer.parseInt(price) * Integer.parseInt(no);
            jLabel11.setText(String.valueOf(total));
        } else {
            jLabel11.setText("__________________");
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(rootPane, "Item added to cart successfully");
        count = count + 1;

        String itemid = jTextField1.getText();
        String itemname = jLabel8.getText();
        String itemprice = jLabel9.getText();
        String quantity = (String) jComboBox1.getSelectedItem();

        al = new ArrayList();
        al.add(itemid);
        al.add(itemname);
        al.add(itemprice);
        al.add(quantity);
    }


}
