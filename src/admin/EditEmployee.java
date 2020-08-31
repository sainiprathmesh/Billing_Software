package admin;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EditEmployee extends javax.swing.JFrame {

    String email;

    public EditEmployee() {
        initComponents();
    }

    @SuppressWarnings("unchecked")

    private void initComponents(){
        jLabel1 = new JLabel();
        jScrollPane1 = new JScrollPane();
        jTable1 = new JTable();
        jTextField1 = new JTextField();
        jTextField2 = new JTextField();
        jTextField3 = new JTextField();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
