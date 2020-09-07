package admin;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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

    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddItem().setVisible(true);
            }
        });
    }

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

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                formWindowOpened(e);
            }
        });
        var contentPane = getContentPane();
        jLabel1.setBackground(Color.white);
        jLabel1.setFont(new Font("Tahoma", Font.BOLD, 18));
        jLabel1.setForeground(new Color(255, 0, 51));
        jLabel1.setText("Back");
        jLabel1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jLabel1MouseClicked(e);
            }
        });
        jLabel2.setText("ID :");
        jTextField1.setEditable(false);
        jLabel3.setText("Name :");
        jLabel4.setText("Price :");
        jLabel5.setText("Categoty :");
        jComboBox1.setModel(new DefaultComboBoxModel<>(new String[]{
                "Select Category",
                "Clothes",
                "Grossery",
                "Toys"
        }));

        jLabel6.setText("Description :");
        {

            jTextArea1.setColumns(20);
            jTextArea1.setRows(5);
            jScrollPane1.setViewportView(jTextArea1);
        }

        jLabel7.setText("Select Image :");

        jButton1.setText("Select Image");
        jButton1.addActionListener(e -> jButton1ActionPerformed(e));

        jButton2.setText("Add Item");
        jButton2.addActionListener(e -> jButton2ActionPerformed(e));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGroup(contentPaneLayout.createParallelGroup()
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addGap(31, 31, 31)
                                                .addComponent(jLabel1))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addGap(134, 134, 134)
                                                .addGroup(contentPaneLayout.createParallelGroup()
                                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabel4)
                                                                        .addGroup(contentPaneLayout.createParallelGroup()
                                                                                .addComponent(jLabel2)
                                                                                .addComponent(jLabel3)))
                                                                .addGroup(contentPaneLayout.createParallelGroup()
                                                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                                                .addGap(105, 105, 105)
                                                                                .addGroup(contentPaneLayout.createParallelGroup()
                                                                                        .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 327, GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 327, GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, 335, GroupLayout.PREFERRED_SIZE)))
                                                                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                                                                                .addGap(97, 97, 97)
                                                                                .addGroup(contentPaneLayout.createParallelGroup()
                                                                                        .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 335, GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, 335, GroupLayout.PREFERRED_SIZE))))
                                                                .addGap(180, 180, 180)
                                                                .addGroup(contentPaneLayout.createParallelGroup()
                                                                        .addComponent(jButton1)
                                                                        .addComponent(jLabel7)
                                                                        .addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                                .addGap(5, 5, 5)
                                                                .addGroup(contentPaneLayout.createParallelGroup()
                                                                        .addComponent(jLabel6)
                                                                        .addComponent(jLabel5)))))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addGap(359, 359, 359)
                                                .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(28, 28, 28)
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7))
                                .addGroup(contentPaneLayout.createParallelGroup()
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addGap(37, 37, 37)
                                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
                                                .addGap(37, 37, 37)
                                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel4))
                                                .addGap(91, 91, 91)
                                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel5)
                                                        .addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
                                                .addGroup(contentPaneLayout.createParallelGroup()
                                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                                .addGap(56, 56, 56)
                                                                .addComponent(jLabel6))
                                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                                .addGap(43, 43, 43)
                                                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton1)
                                                .addGap(49, 49, 49)
                                                .addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)))
                                .addGap(78, 78, 78)
                                .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(null);
    }

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {

        AdminPanel ap = new AdminPanel();
        ap.setVisible(true);
        setVisible(false);

    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {

        String id = jTextField1.getText();
        String name = jTextField2.getText();
        String price = jTextField3.getText();
        String category = (String) jComboBox1.getSelectedItem();
        String desc = jTextArea1.getText();

        try {
            File imgfile = new File(file.getAbsolutePath());
            FileInputStream fis = new FileInputStream(imgfile);

            Connection con = dbconnection.DbConnection.getConnect();

            PreparedStatement ps = con.prepareStatement("insert into items values(?,?,?,?,?,?)");
            ps.setString(1, id);
            ps.setString(2, name);
            ps.setString(3, price);
            ps.setString(4, category);
            ps.setString(5, desc);
            ps.setBinaryStream(6, (InputStream) fis, (int) imgfile.length());
            int i = ps.executeUpdate();
            if (i > 0) {
                JOptionPane.showMessageDialog(rootPane, "Item added successfully");

                AddItem ai = new AddItem();
                ai.setVisible(true);
                setVisible(false);
            } else {
                JOptionPane.showMessageDialog(rootPane, "item not added due to some error", "Error", JOptionPane.ERROR_MESSAGE);
            }

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {
        int count = 1;
        try {
            Connection con = dbconnection.DbConnection.getConnect();

            PreparedStatement ps = con.prepareStatement("select * from items");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                count = count + 1;
            }

            jTextField1.setText("itm/bt1/" + count);

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

        JFileChooser filechooser = new JFileChooser();
        filechooser.showOpenDialog(rootPane);
        file = filechooser.getSelectedFile();

        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(file.getAbsolutePath()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Image dimg = img.getScaledInstance(jLabel8.getWidth(), jLabel8.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ii = new ImageIcon(dimg);
        jLabel8.setIcon(ii);
    }
}
