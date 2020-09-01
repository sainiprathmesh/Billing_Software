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

        {
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
