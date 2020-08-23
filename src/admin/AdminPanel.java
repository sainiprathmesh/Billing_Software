package admin;

import softwarebilling.Login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @author Latesh Kumari on 8/23/2020 at 11:05 AM
 **/


public class AdminPanel extends javax.swing.JFrame {
    private JPanel jPanel1;
    private JButton jButton5;
    private JLabel jLabel1;
    private JPanel jPanel2;
    private JButton jButton1;
    private JButton jButton2;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JPanel jPanel3;
    private JButton jButton3;
    private JButton jButton4;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;

    public AdminPanel() {
        initComponents();
    }



    //@SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new JPanel();
        jButton5 = new JButton();
        jLabel1 = new JLabel();
        jPanel2 = new JPanel();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jPanel3 = new JPanel();
        jButton3 = new JButton();
        jButton4 = new JButton();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        var contentPane = getContentPane();
        //======== jPanel1 ========
        {
            jPanel1.setBackground(Color.white);
            jPanel1.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax
                    .swing.border.EmptyBorder(0, 0, 0, 0), "", javax.swing
                    .border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new java.awt.
                    Font("D\u0069al\u006fg", java.awt.Font.BOLD, 12), java.awt.Color.red
            ), jPanel1.getBorder()));
            jPanel1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
                @Override
                public void propertyChange(java.beans.PropertyChangeEvent e) {
                    if ("\u0062or\u0064er".equals(e.getPropertyName(
                    ))) throw new RuntimeException();
                }
            });
            //---- jButton5 ----
            jButton5.setIcon(new ImageIcon(getClass().getResource("/images/chngpwd.png")));
            jButton5.addActionListener(e -> jButton5ActionPerformed(e));


            //---- jLabel1 ----
            jLabel1.setFont(new Font("Tahoma", Font.BOLD, 18));
            jLabel1.setForeground(new Color(255, 0, 51));
            jLabel1.setText("Logout");
            jLabel1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            jLabel1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    jLabel1MouseClicked(e);
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    jLabel1MouseEntered(e);
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    jLabel1MouseExited(e);
                }
            });
            //======== jPanel2 ========
            {
                jPanel2.setBackground(new Color(255, 204, 204));

                //---- jButton1 ----
                jButton1.setIcon(new ImageIcon(getClass().getResource("/images/addemployee.png")));
                jButton1.addActionListener(e -> jButton1ActionPerformed(e));

                //---- jButton2 ----
                jButton2.setIcon(new ImageIcon(getClass().getResource("/images/editemployee.png")));
                jButton2.addActionListener(e -> jButton2ActionPerformed(e));

                //---- jLabel2 ----
                jLabel2.setFont(new Font("Tahoma", Font.BOLD, 18));
                jLabel2.setForeground(Color.blue);
                jLabel2.setText("Add Employee");

                //---- jLabel3 ----
                jLabel3.setFont(new Font("Tahoma", Font.BOLD, 18));
                jLabel3.setForeground(Color.blue);
                jLabel3.setText("Edit Employee");

                GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                        jPanel2Layout.createParallelGroup()
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(266, 266, 266)
                                        .addGroup(jPanel2Layout.createParallelGroup()
                                                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel2))
                                        .addGroup(jPanel2Layout.createParallelGroup()
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                                                        .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
                                                        .addGap(278, 278, 278))
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addGap(62, 62, 62)
                                                        .addComponent(jLabel3)
                                                        .addContainerGap(269, Short.MAX_VALUE))))
                );
                jPanel2Layout.setVerticalGroup(
                        jPanel2Layout.createParallelGroup()
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                .addComponent(jButton1)
                                                .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE))
                                        .addGap(33, 33, 33)
                                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel3))
                                        .addContainerGap(36, Short.MAX_VALUE))
                );
            }


            //======== jPanel3 ========
            {
                jPanel3.setBackground(new Color(255, 204, 204));
                //---- jButton3 ----
                jButton3.setIcon(new ImageIcon(getClass().getResource("/images/additem.png")));
                jButton3.addActionListener(e -> jButton3ActionPerformed(e));
                //---- jButton4 ----
                jButton4.setIcon(new ImageIcon(getClass().getResource("/images/edititem.png")));
                jButton4.addActionListener(e -> jButton4ActionPerformed(e));
                //---- jLabel4 ----
                jLabel4.setFont(new Font("Tahoma", Font.BOLD, 18));
                jLabel4.setForeground(Color.blue);
                jLabel4.setText("Add Item");

                //---- jLabel5 ----
                jLabel5.setFont(new Font("Tahoma", Font.BOLD, 18));
                jLabel5.setForeground(Color.blue);
                jLabel5.setText("Edit Item");

                GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
                jPanel3.setLayout(jPanel3Layout);
                jPanel3Layout.setHorizontalGroup(
                        jPanel3Layout.createParallelGroup()
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(273, 273, 273)
                                        .addGroup(jPanel3Layout.createParallelGroup()
                                                .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addGap(12, 12, 12)
                                                        .addComponent(jLabel4)))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel3Layout.createParallelGroup()
                                                .addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
                                                .addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                        .addComponent(jLabel5)
                                                        .addGap(8, 8, 8)))
                                        .addGap(276, 276, 276))
                );

                jPanel3Layout.setVerticalGroup(
                        jPanel3Layout.createParallelGroup()
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                .addComponent(jButton3)
                                                .addComponent(jButton4))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel4)

                                                .addComponent(jLabel5))
                                        .addContainerGap(28, Short.MAX_VALUE))
                );
            }

            //---- jLabel6 ----
            jLabel6.setFont(new Font("Tahoma", Font.BOLD, 18));
            jLabel6.setForeground(Color.blue);
            jLabel6.setText("Change Password");


            //---- jLabel7 ----
            jLabel7.setFont(new Font("Tahoma", Font.BOLD, 24));
            jLabel7.setForeground(new Color(0, 153, 51));
            jLabel7.setText("Welcome : Admin");

            GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                    jPanel1Layout.createParallelGroup()
                            .addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGap(29, 29, 29)
                                    .addComponent(jLabel7)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1)
                                    .addGap(71, 71, 71))
                            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addContainerGap(348, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup()
                                            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel6)
                                                    .addGap(339, 339, 339))
                                            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jButton5, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
                                                    .addGap(364, 364, 364))))
            );
            jPanel1Layout.setVerticalGroup(
                    jPanel1Layout.createParallelGroup()
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(27, 27, 27)
                                    .addGroup(jPanel1Layout.createParallelGroup()
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel7))
                                    .addGap(30, 30, 30)
                                    .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addGap(51, 51, 51)
                                    .addComponent(jButton5)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel6)
                                    .addGap(73, 73, 73))
            );
        }
        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
                contentPaneLayout.createParallelGroup()
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
                contentPaneLayout.createParallelGroup()
                        .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );
        pack();
        setLocationRelativeTo(null);
    }

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {
        jLabel1.setForeground(Color.blue);
    }

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {
        jLabel1.setForeground(Color.red);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        //  RegisterEmployee re=new RegisterEmployee();
        // re.setVisible(true);
        setVisible(false);
    }

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {
        Login l = new Login();
        l.setVisible(true);
        setVisible(false);
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        //  EditEmployee ee=new EditEmployee();
        // ee.setVisible(true);
        setVisible(false);
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        ChangePwd cp = new ChangePwd();
        //cp.setVisible(true);
        setVisible(false);
    }


    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        // AddItem ai=new AddItem();
        //ai.setVisible(true);
        setVisible(false);
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        //   EditItem ei=new EditItem();
        // ei.setVisible(true);
        setVisible(false);
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
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPanel().setVisible(true);
            }
        });

    }

}