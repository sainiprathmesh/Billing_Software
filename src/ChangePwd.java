/**
 * @author gps on 29-08-2020 at 08:08
 */
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

public class ChangePwd {
    public class ChangePwd extends javax.swing.JFrame {
/**
 * Creates new form ChangePwd
 */

EmpDetails ed;
        public ChangePwd(EmpDetails ed) {
            this.ed=ed;
            initComponents();
            /**
             * This method is called from within the constructor to initialize the form.
             * WARNING: Do NOT modify this code. The content of this method is always
             * regenerated by the Form Editor.
             */
            // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
            // Generated using JFormDesigner Evaluation license - unknown
            private void initComponents();
            {
                JTextField jTextField1;
                JPasswordField jPasswordField1;
                JPasswordField jPasswordField2;
                JLabel jLabel1 = null;
                JButton jButton1;

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
                        jLabel1MouseClicked(e));
                    }
                });
                //---- jButton1 ----
                jButton1.setText("Change Password");
                jButton1.addActionListener(e -> jButton1ActionPerformed(e));
                GroupLayout contentPaneLayout = new GroupLayout(contentPane);
                contentPane.setLayout(contentPaneLayout);
                contentPaneLayout.setHorizontalGroup();
                contentPaneLayout.createParallelGroup();

                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(31, 31, 31)
                            .addComponent(jLabel1))
                    .addGap(53, 53, 53)
                    .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
                    .addGap(51, 51, 51)
                    .addComponent(jPasswordField1, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
                    .addGap(51, 51, 51);
                    .addComponent(jPasswordField2, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE);
                    .addGap(78, 78, 78);
                    .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE);
                    .addContainerGap(193, Short.MAX_VALUE))
                pack();
                setLocationRelativeTo(null);
            }// </editor-fold>//GEN-END:initComponents
            private void jLabel1MouseClicked(java.awt.event.MouseEvent ) {
                    //GEN-FIRST:event_jLabel1MouseClicked
                    // TODO add your handling code here:
                    EmpPanel ep = new EmpPanel(ed);

            ep.setVisible(true);
            setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked
            private void jButton1ActionPerformed(java.awt.event.ActionEvent); {//GEN-FIRST:event_jButton1ActionPerformed
                // TODO add your handling code here:

                String old_pwd=jTextField1.getText();
                String new_pwd=jPasswordField1.getText();
                String cnew_pwd=jPasswordField2.getText();
                String dboldpwd=null;
                Connection con = null;
                try
                {
                    con=dbconnection.DbConnection.getConnect();
                    PreparedStatement ps=con.prepareStatement("select * from register where email='"+ed.getEmail()+"'");
                    ResultSet rs=ps.executeQuery();

                    {
                        dboldpwd=rs.getString("password");
                    }
                catch(Exception e)
                    {
                        System.out.println(e);
                    }
        finally
                    {
                        try {
                            con.close();
                        } catch (SQLException ex) {
                            Logger.getLogger(admin.ChangePwd.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    if(!old_pwd.equals(dboldpwd))
                    {
                        JOptionPane.showMessageDialog(rootPane, "Old password didnt matched", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    con1.close();
                }
                catch(Exception e)







                    }



        }



    }

    private void initComponents() {
    }

    private void addContainerGap(int i, short maxValue) {
    }

    private void addComponent(JTextField jTextField1, int preferredSize, int i, int preferredSize1) {
    }

    private void addGap(int i, int i1, int i2) {
    }

    private void addGroup(GroupLayout.SequentialGroup addGroup) {
    }


}
