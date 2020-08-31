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
                                .addContainerGap(122, Short.MAX_VALUE))
        );

        contentPaneLayout.setVerticalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel1)
                                .addGroup(contentPaneLayout.createParallelGroup()
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addGap(52, 52, 52)
                                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 518, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addGap(66, 66, 66)
                                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel2))
                                                .addGap(35, 35, 35)
                                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel3))
                                                .addGap(45, 45, 45)
                                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel4))
                                                .addGap(59, 59, 59)
                                                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                                                .addGap(53, 53, 53)
                                                .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(101, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(null);
    }

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {
        AdminPanel ap=new AdminPanel();
        ap.setVisible(true);
        setVisible(false);
    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {

        DefaultTableModel dtm=(DefaultTableModel)jTable1.getModel();

        int srno=0;
        String name, email;

        try
        {
            Connection con=dbconnection.DbConnection.getConnect();
            PreparedStatement ps=con.prepareStatement("select * from register");
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                srno=srno+1;
                name=rs.getString("name");
                email=rs.getString("email");

                Object[] ob={srno, name, email};
                dtm.addRow(ob);
            }
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {

        int row=jTable1.getSelectedRow();
        email=(String)jTable1.getValueAt(row, 2);

        String name = null, pass = null, phno = null;
        try
        {
            Connection con=dbconnection.DbConnection.getConnect();

            PreparedStatement ps=con.prepareStatement("select * from register where email='"+email+"'");
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                name=rs.getString("name");
                pass=rs.getString("password");
                phno=rs.getString("phone_no");
            }

            jTextField1.setText(name);
            jTextField2.setText(pass);
            jTextField3.setText(phno);

            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        String name1=jTextField1.getText();
        String pass1=jTextField2.getText();
        String phno1=jTextField3.getText();

        try
        {
            Connection con=dbconnection.DbConnection.getConnect();

            PreparedStatement ps=con.prepareStatement("update register set name='"+name1+"', password='"+pass1+"', phone_no='"+phno1+"' where email='"+email+"'");
            int i=ps.executeUpdate();
            if(i>0)
            {
                JOptionPane.showMessageDialog(rootPane, "Updation completed successfully");
                EditEmployee ee=new EditEmployee();
                ee.setVisible(true);
                setVisible(false);
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "Not updated due to some error", "Error", JOptionPane.ERROR_MESSAGE);
            }

            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        try
        {
            Connection con=dbconnection.DbConnection.getConnect();

            PreparedStatement ps=con.prepareStatement("delete from register where email='"+email+"'");
            int i=ps.executeUpdate();
            if(i>0)
            {

            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "Not deleeted due to some error", "Error", JOptionPane.ERROR_MESSAGE);
            }

            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
