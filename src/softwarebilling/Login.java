package softwarebilling;

import javax.swing.*;

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
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private JTextField jTextField1;
    private JPasswordField jPasswordField1;
    private JButton jButton1;
    private JButton jButton2;
    private JLabel jLabel1;
}
