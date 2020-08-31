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
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                formWindowOpened(e);
            }
        });
        var contentPane = getContentPane();
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
        {
            jTable1.setModel(new DefaultTableModel(
                    new Object[][] {
                    },
                    new String[] {
                            "Sr. No", "Name", "Email"
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
            });
            jScrollPane1.setViewportView(jTable1);
        }
        jButton1.setText("Update");
        jButton1.addActionListener(e -> jButton1ActionPerformed(e));
        jButton2.setText("Delete");
        jButton2.addActionListener(e -> jButton2ActionPerformed(e));
        jLabel2.setText("Name :");
        jLabel3.setText("Password :");
        jLabel4.setText("Phone No :");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGroup(contentPaneLayout.createParallelGroup()
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addGap(22, 22, 22)
                                                .addComponent(jLabel1))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addGap(54, 54, 54)
                                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 361, GroupLayout.PREFERRED_SIZE)
                                                .addGroup(contentPaneLayout.createParallelGroup()
                                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                                .addGap(92, 92, 92)
                                                                .addGroup(contentPaneLayout.createParallelGroup()
                                                                        .addComponent(jLabel2)
                                                                        .addComponent(jLabel3)
                                                                        .addComponent(jLabel4))
                                                                .addGap(78, 78, 78)
                                                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(jTextField1)
                                                                        .addComponent(jTextField2)
                                                                        .addComponent(jTextField3, GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)))
                                                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                                                                .addGap(111, 111, 111)
                                                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                                        .addComponent(jButton2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jButton1, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
                                                                .addGap(89, 89, 89)))))
                                )
        );
    }
}
