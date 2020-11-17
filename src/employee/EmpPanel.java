package employee;
/**
 * @author Latesh on 8/23/2020 at 2:33 PM
 */
import model.EmpDetails;
import softwarebilling.Login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.HashMap;


public class EmpPanel extends javax.swing.JFrame {
    EmpDetails ed;

    public EmpPanel(EmpDetails ed) {
        initComponents();
        this.ed = ed;
    }

    //    @SuppressWarnings("unchecked")
    private void initComponents() {
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jButton1 = new JButton();
        jButton2 = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                formWindowOpened(e);
            }
        });
        var contentPane = getContentPane();
        jLabel1.setText("Welcome :");

        jLabel2.setText("_____________________________");

        jLabel3.setFont(new Font("Tahoma", Font.BOLD, 18));
        jLabel3.setForeground(new Color(255, 0, 102));
        jLabel3.setText("Logout");
        jLabel3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jLabel3MouseClicked(e);
            }
        });

        jButton1.setText("Start Billing");
        jButton1.addActionListener(e -> jButton1ActionPerformed(e));

        jButton2.setText("Change Password");
        jButton2.addActionListener(e -> jButton2ActionPerformed(e));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel1)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 657, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(66, 66, 66))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGap(321, 321, 321)
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton2, GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                                        .addComponent(jButton1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );


        contentPaneLayout.setVerticalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGroup(contentPaneLayout.createParallelGroup()
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addGap(35, 35, 35)
                                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel1)
                                                        .addComponent(jLabel2)))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addGap(24, 24, 24)
                                                .addComponent(jLabel3)))
                                .addGap(110, 110, 110)
                                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
                                .addGap(154, 154, 154)
                                .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(221, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(null);
    }


    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {
        Login l = new Login();
        l.setVisible(true);
        setVisible(false);

    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {

        String name = ed.getName();
        jLabel2.setText(name);

    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {

        ChangePwd cp = new ChangePwd(ed);
        cp.setVisible(true);
        setVisible(false);

    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

        HashMap hm = new HashMap();
        StartBilling sb = new StartBilling(ed, hm);
        sb.setVisible(true);
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
            java.util.logging.Logger.getLogger(EmpPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmpPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmpPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmpPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmpPanel(null).setVisible(true);
            }
        });
    }

    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JButton jButton1;
    private JButton jButton2;
}