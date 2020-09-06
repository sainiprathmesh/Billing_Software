package employee;

import model.EmpDetails;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author prathmeshkumarsaini on 06/09/20 at 11:57 PM
 */
public class ChangePwd extends javax.swing.JFrame {
    EmpDetails ed;

    public ChangePwd(EmpDetails ed) {
        this.ed = ed;
        initComponents();
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {
        jLabel1 = new JLabel();
        jTextField1 = new JTextField();
        jPasswordField1 = new JPasswordField();
        jPasswordField2 = new JPasswordField();
        jButton1 = new JButton();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        var contentPane = getContentPane();

        //---- jLabel1 ----
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

        //---- jButton1 ----
        jButton1.setText("Change Password");
        jButton1.addActionListener(e -> jButton1ActionPerformed(e));

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
                                                .addGap(321, 321, 321)
                                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jTextField1)
                                                        .addComponent(jPasswordField1)
                                                        .addComponent(jPasswordField2, GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addGap(446, 446, 446)
                                                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(338, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel1)
                                .addGap(53, 53, 53)
                                .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(jPasswordField1, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(jPasswordField2, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)
                                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(193, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(null);
    }

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:

        EmpPanel ep = new EmpPanel(ed);
        ep.setVisible(true);
        setVisible(false);

    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        String old_pwd = jTextField1.getText();
        String new_pwd = jPasswordField1.getText();
        String cnew_pwd = jPasswordField2.getText();

        String dboldpwd = null;
        Connection con = null;
        try {
            con = dbconnection.DbConnection.getConnect();

            PreparedStatement ps = con.prepareStatement("select * from register where email='" + ed.getEmail() + "'");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                dboldpwd = rs.getString("password");
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(admin.ChangePwd.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (!old_pwd.equals(dboldpwd)) {
            JOptionPane.showMessageDialog(rootPane, "Old password didnt matched", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (!new_pwd.equals(cnew_pwd)) {
            JOptionPane.showMessageDialog(rootPane, "Confirm password didnt matched", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                Connection con1 = dbconnection.DbConnection.getConnect();

                PreparedStatement ps = con1.prepareStatement("update register set password='" + new_pwd + "' where email='" + ed.getEmail() + "'");
                int i = ps.executeUpdate();
                if (i > 0) {
                    JOptionPane.showMessageDialog(rootPane, "Password updated successfully");

                    jTextField1.setText("");
                    jPasswordField1.setText("");
                    jPasswordField2.setText("");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Password not updated due to some error", "Error", JOptionPane.ERROR_MESSAGE);
                }

                con1.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }

    private JLabel jLabel1;
    private JTextField jTextField1;
    private JPasswordField jPasswordField1;
    private JPasswordField jPasswordField2;
    private JButton jButton1;
}
