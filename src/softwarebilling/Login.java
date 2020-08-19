package softwarebilling;

import model.EmpDetails;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import admin.AdminPanel;
//import employee.EmpPanel;

/**
 * @author prathmeshkumarsaini on 19/08/20 at 9:12 PM
 */
public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

    /*
     * GUI Design Code
     * */
    @SuppressWarnings("unchecked")
    private void initComponents() {
        jTextField1 = new JTextField();
        jPasswordField1 = new JPasswordField();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jLabel1 = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        var contentPane = getContentPane();

        // --- jButton1 ---
        jButton1.setText("Login");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        // --- jButton2 ---
        jButton2.setText("Exit");
        jButton2.addActionListener(this::jButton2ActionPerformed);

        // --- jLabel1 ---
        jLabel1.setIcon(new ImageIcon(getClass().getResource("/image/login.png")));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGroup(contentPaneLayout.createParallelGroup()
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addGap(411, 411, 411)
                                                .addComponent(jLabel1))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addGap(230, 230, 230)
                                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                        .addGroup(GroupLayout.Alignment.LEADING, contentPaneLayout.createSequentialGroup()
                                                                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jTextField1, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
                                                        .addComponent(jPasswordField1, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE))))
                                .addContainerGap(565, Short.MAX_VALUE))
        );

        contentPaneLayout.setVerticalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)
                                .addComponent(jPasswordField1, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100)
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton2, GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                                        .addComponent(jButton1, GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                                .addContainerGap(123, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(null);
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        String email1 = jTextField1.getText();
        String pass1 = jPasswordField1.getText();

        String module = "", name = "", phno = "";

        try {
            Connection con = dbconnection.DbConnection.getConnect();
            PreparedStatement ps = con.prepareStatement("select * from register where email='" + email1 + "' and password='" + pass1 + "'");
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                module = rs.getString("module");
                name = rs.getString("name");
                phno = rs.getString("phone_no");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Email and password didnt matched", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        if (module.equals("admin")) {
            //AdminPanel ap=new AdminPanel();
            //ap.setVisible(true);
            setVisible(false);
        } else if (module.equals("employee")) {
            EmpDetails ed = new EmpDetails();
            ed.setEmail(email1);
            ed.setName(name);
            ed.setPhno(phno);

            //EmpPanel ep=new EmpPanel(ed);
            //ep.setVisible(true);
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    private JTextField jTextField1;
    private JPasswordField jPasswordField1;
    private JButton jButton1;
    private JButton jButton2;
    private JLabel jLabel1;
}
