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
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();


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
