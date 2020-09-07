package admin;

import javax.swing.*;
import java.awt.*;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.imageio.ImageIO;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle;
import javax.swing.table.DefaultTableModel;

public class EditItem extends javax.swing.JFrame {

    File file;

    String select_itemid;

    public EditItem() {
        initComponents();
    }
    @SuppressWarnings("unchecked")

    private void initComponents() {
        jScrollPane1 = new JScrollPane();
        jTable1 = new JTable();
        jTextField1 = new JTextField();
        jTextField2 = new JTextField();
        jComboBox1 = new JComboBox<>();
        jScrollPane2 = new JScrollPane();
        jTextArea1 = new JTextArea();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jButton3 = new JButton();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                formWindowOpened(e);
            }
        });
        var contentPane = getContentPane();
        {

            //---- jTable1 ----
            jTable1.setModel(new DefaultTableModel(
                    new Object[][] {
                    },
                    new String[] {
                            "Sr. No.", "Item ID", "Item Name"
                    }
            ) {
                boolean[] columnEditable = new boolean[] {
                        false, false, false
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
                @Override
                public void mouseEntered(MouseEvent e) {
                    jTable1MouseEntered(e);
                }
            });
            jScrollPane1.setViewportView(jTable1);
        }

        //---- jComboBox1 ----
        jComboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
                "Select Category",
                "Clothes",
                "Grossery",
                "Toys"
        }));

        {

            jTextArea1.setColumns(20);
            jTextArea1.setRows(5);
            jScrollPane2.setViewportView(jTextArea1);
        }

        jButton1.setText("Update");
        jButton1.addActionListener(e -> jButton1ActionPerformed(e));

        jButton2.setText("Delete");
        jButton2.addActionListener(e -> jButton2ActionPerformed(e));

        jButton3.setText("Select Image");
        jButton3.addActionListener(e -> jButton3ActionPerformed(e));

        jLabel2.setFont(new Font("Tahoma", Font.BOLD, 18));
        jLabel2.setForeground(Color.red);
        jLabel2.setText("Back");
        jLabel2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jLabel2MouseClicked(e);
            }
        });

        jLabel3.setText("Name :");

        jLabel4.setText("Price :");

        jLabel5.setText("Category :");

        jLabel6.setText("Description :");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel2)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGroup(contentPaneLayout.createParallelGroup()
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addGap(115, 115, 115)
                                                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
                                                .addGap(64, 64, 64)
                                                .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
                                                .addGap(171, 171, 171))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addGap(62, 62, 62)
                                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 413, GroupLayout.PREFERRED_SIZE)
                                                .addGroup(contentPaneLayout.createParallelGroup()
                                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jLabel3)
                                                                .addGap(58, 58, 58))
                                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                                .addGap(58, 58, 58)
                                                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabel5)
                                                                        .addComponent(jLabel4)
                                                                        .addComponent(jLabel6, GroupLayout.Alignment.LEADING))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)))))
                                .addGap(31, 31, 31)
                                .addGroup(contentPaneLayout.createParallelGroup()
                                        .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 276, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton3))
                                        .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 276, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, 276, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 276, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(256, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGroup(contentPaneLayout.createParallelGroup()
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addGap(126, 126, 126)
                                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel3))
                                                .addGap(40, 40, 40)
                                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel4))
                                                .addGap(50, 50, 50)
                                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel5))
                                                .addGroup(contentPaneLayout.createParallelGroup()
                                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                                .addGap(111, 111, 111)
                                                                .addComponent(jLabel6))
                                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                                .addGap(56, 56, 56)
                                                                .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(contentPaneLayout.createParallelGroup()
                                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                                .addGap(45, 45, 45)
                                                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                                .addGap(107, 107, 107)
                                                                .addComponent(jButton3))))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addGap(22, 22, 22)
                                                .addComponent(jLabel2)
                                                .addGap(52, 52, 52)
                                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 585, GroupLayout.PREFERRED_SIZE)
                                                .addGap(50, 50, 50)
                                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jButton1, GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                                        .addComponent(jButton2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addContainerGap(36, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(null);
    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {

        DefaultTableModel dtm=(DefaultTableModel)jTable1.getModel();
        String id, name, price, desc, category;
        int srno=0;
        try
        {
            Connection con=dbconnection.DbConnection.getConnect();
            PreparedStatement ps=con.prepareStatement("select * from items");
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                srno=srno+1;
                id=rs.getString("item_id");
                name=rs.getString("item_name");
//                price=rs.getString("price");
//                desc=rs.getString("description");
//                category=rs.getString("category");
                Object[] o={srno, id, name};
                dtm.addRow(o);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {

        int row=jTable1.getSelectedRow();
        select_itemid=(String)jTable1.getValueAt(row, 1);

        String id, name = null, price = null, desc = null, category = null;
        byte[] image=null;
        try
        {
            Connection con=dbconnection.DbConnection.getConnect();
            PreparedStatement ps=con.prepareStatement("select * from items where item_id='"+select_itemid+"'");
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                name=rs.getString("item_name");
                price=rs.getString("item_price");
                desc=rs.getString("item_desc");
                category=rs.getString("item_category");
                image=rs.getBytes("item_image");
            }

            jTextArea1.setText(desc);
            jTextField1.setText(name);
            jTextField2.setText(price);
            jComboBox1.setSelectedItem(category);

            Image img = Toolkit.getDefaultToolkit().createImage(image);
            Image new_imgg=img.getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(new_imgg);
            jLabel1.setIcon(icon);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {

        JFileChooser filechooser=new JFileChooser();
        filechooser.showOpenDialog(rootPane);
        file=filechooser.getSelectedFile();

        BufferedImage img = null;
        try
        {
            img = ImageIO.read(new File(file.getAbsolutePath()));
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        Image dimg = img.getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ii=new ImageIcon(dimg);
        jLabel1.setIcon(ii);

    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String name=jTextField1.getText();
        String price=jTextField2.getText();
        String desc=jTextArea1.getText();
        String category=(String) jComboBox1.getSelectedItem();

        try
        {
            if(file != null)
            {
                File imgfile = new File(file.getAbsolutePath());
                FileInputStream fis = new FileInputStream(imgfile);

                Connection con=dbconnection.DbConnection.getConnect();
                PreparedStatement ps=con.prepareStatement("update items set item_name=?, item_price=?, item_category=?, item_description=?, item_image=? where item_id='"+select_itemid+"'");
                ps.setString(1, name);
                ps.setString(2, price);
                ps.setString(3, category);
                ps.setString(4, desc);
                ps.setBinaryStream(5, (InputStream)fis,(int)imgfile.length());
                int i=ps.executeUpdate();
                if(i>0)
                {
                    JOptionPane.showMessageDialog(rootPane, "Item updated successfully");

                    EditItem ei=new EditItem();
                    ei.setVisible(true);
                    setVisible(false);
                }
                else
                {
                    JOptionPane.showMessageDialog(rootPane, "Item not updated sue to some error", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            else
            {
                Connection con=dbconnection.DbConnection.getConnect();
                PreparedStatement ps=con.prepareStatement("update items set item_name=?, item_price=?, item_category=?, item_desc=? where item_id='"+select_itemid+"'");
                ps.setString(1, name);
                ps.setString(2, price);
                ps.setString(3, category);
                ps.setString(4, desc);
                int i=ps.executeUpdate();
                if(i>0)
                {
                    JOptionPane.showMessageDialog(rootPane, "Item updated successfully");

                    EditItem ei=new EditItem();
                    ei.setVisible(true);
                    setVisible(false);
                }
                else
                {
                    JOptionPane.showMessageDialog(rootPane, "Item not updated sue to some error", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {
        AdminPanel ap=new AdminPanel();
        ap.setVisible(true);
        setVisible(false);

    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        try
        {
            Connection con=dbconnection.DbConnection.getConnect();
            PreparedStatement ps=con.prepareStatement("delete from items where item_id='"+select_itemid+"'");
            int i=ps.executeUpdate();
            if(i>0)
            {
                JOptionPane.showMessageDialog(rootPane, "item deleted successfuly");

                EditItem ei=new EditItem();
                ei.setVisible(true);
                setVisible(false);
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "Item not deleted due to some error", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }

    private void jTable1MouseEntered(java.awt.event.MouseEvent evt) {
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
            java.util.logging.Logger.getLogger(EditItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditItem().setVisible(true);
            }
        });
    }

    private JScrollPane jScrollPane1;
    private JTable jTable1;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JComboBox<String> jComboBox1;
    private JScrollPane jScrollPane2;
    private JTextArea jTextArea1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
}
