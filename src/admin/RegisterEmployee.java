package admin;

import validations.Validations;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class RegisterEmployee extends javax.swing.JFrame {
    public RegisterEmployee() {
        initComponents();
    }
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
   public static void main(String args[]) {
       try {
           for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
               if ("Nimbus".equals(info.getName())) {
                   javax.swing.UIManager.setLookAndFeel(info.getClassName());
                   break;
               }
           }
       } catch (ClassNotFoundException ex) {
           java.util.logging.Logger.getLogger(RegisterEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
           java.util.logging.Logger.getLogger(RegisterEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       } catch (javax.swing.UnsupportedLookAndFeelException ex) {
           java.util.logging.Logger.getLogger(RegisterEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       }
       java.awt.EventQueue.invokeLater(new Runnable() {
           public void run() {
               new RegisterEmployee().setVisible(true);
           }
       });
   }

    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Back");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jLabel2.setText("Name");
        jLabel3.setText("Email :");
        jLabel4.setText("Password :");
        jLabel5.setText("Phone No :");
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(jLabel1))
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(112, 112, 112)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel5))
                                        .addGap(84, 84, 84)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                                                .addComponent(jTextField2)
                                                .addComponent(jPasswordField1)
                                                .addComponent(jTextField3)))
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(382, 382, 382)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(360, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1)
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5))
                        .addGap(82, 82, 82)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(102, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(null);
    }
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {
        AdminPanel ap = new AdminPanel();
        ap.setVisible(true);
        setVisible(false);
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        String name1 = jTextField1.getText();
        String email1 = jTextField2.getText();
        String pass1 = jPasswordField1.getText();
        String phno1 = jTextField3.getText();
        Validations v = new Validations();
        if (!v.nameValidate(name1)) {
            JOptionPane.showMessageDialog(rootPane, "Name is not valid", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (!v.emailValidate(email1)) {
            JOptionPane.showMessageDialog(rootPane, "Email is not valid", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (!v.passValidate(pass1)) {
            JOptionPane.showMessageDialog(rootPane, "Password is not valid", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (!v.phoneValidate(phno1)) {
            JOptionPane.showMessageDialog(rootPane, "Phone No is not valid", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            boolean temp = false;
            int i = 1;
            try {
                Connection con = dbconnection.DbConnection.getConnect();
                PreparedStatement ps = con.prepareStatement("select * from register");
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    String email2 = rs.getString("email");
                    if (email1.equals(email2)) {
                        temp = true;
                        break;
                    }
                    i = i + 1;
                }
                con.close();
            } catch (Exception e) {
                System.out.println(e);
            }
            if (temp == false) {
                try {
                    Connection con = dbconnection.DbConnection.getConnect();
                    PreparedStatement ps = con.prepareStatement("insert into register values(?,?,?,?,?,?)");
                    ps.setInt(1, i);
                    ps.setString(2, name1);
                    ps.setString(3, email1);
                    ps.setString(4, pass1);
                    ps.setString(5, phno1);
                    ps.setString(6, "employee");
                    int res = ps.executeUpdate();
                    if (res > 0) {
                        JOptionPane.showMessageDialog(rootPane, "Employee registered successfully");
                        jTextField1.setText("");
                        jTextField2.setText("");
                        jTextField3.setText("");
                        jPasswordField1.setText("");
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Employee not registered due to some error", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    con.close();
                } catch (Exception e) {
                    System.out.println(e);
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Email id is already in our database", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
