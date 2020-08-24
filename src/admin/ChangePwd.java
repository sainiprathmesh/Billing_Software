package admin;
public class ChangePwd extends javax.swing.JFrame {
    public ChangePwd() {
        initComponents();
    }

    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {

                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ChangePwd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePwd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePwd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        private void initComponents () {

            jLabel1 = new javax.swing.JLabel();
            jTextField1 = new javax.swing.JTextField();
            jTextField2 = new javax.swing.JTextField();
            jTextField3 = new javax.swing.JTextField();
            jButton1 = new javax.swing.JButton();
            jLabel2 = new javax.swing.JLabel();
            jLabel3 = new javax.swing.JLabel();
            jLabel4 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18));
                jLabel1.setText("Back");
                jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        jLabel1MouseClicked(evt);
                    }
                });
                jButton1.setText("Change Password");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton1ActionPerformed(evt);
                    }
                });
                jLabel2.setText("Old Password :");
                jLabel3.setText("New Password :");
                jLabel4.setText("Confirm New Password :");
                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGap(33, 33, 33).addComponent(jLabel1))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGap(325, 325, 325)
                                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))).addContainerGap(435, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3))
                                .addComponent(jLabel2)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(196, 196, 196))
        );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(jLabel1)
                                        .addGap(59, 59, 59)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel3))
                                                .addGap(51, 51, 51)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel4))
                                                .addGap(93, 93, 93)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(112, Short.MAX_VALUE))
                                );
                pack();
                setLocationRelativeTo(null);
                private void jLabel1MouseClicked (java.awt.event.MouseEvent evt){//GEN-FIRST:event_jLabel1MouseClicked
                    AdminPanel ap = new AdminPanel();
                    ap.setVisible(true);
                    setVisible(false);
                }
                private void jButton1ActionPerformed (java.awt.event.ActionEvent evt){
                    String old_pwd = jTextField1.getText();
                    String new_pwd = jTextField2.getText();
                    String cnew_pwd = jTextField3.getText();
                    String dboldpwd = null;
                    Connection con = null;
                    try {
                        con = dbconnection.DbConnection.getConnect();
                        PreparedStatement ps = con.prepareStatement("select * from register where email='admin@gmail.com'");
                        ResultSet rs = ps.executeQuery();
                        while (rs.next()) {
                            dboldpwd = rs.getString("password");
                        }
                    } catch (Exception e) {
                        System.out.println(e);
                    } finally {
                        con.close();
                    }catch(SQLException ex){
                        Logger.getLogger(ChangePwd.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if (!old_pwd.equals(dboldpwd)) {
                    JOptionPane.showMessageDialog(rootPane, "Old password didnt matched", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (!new_pwd.equals(cnew_pwd)) {
                    JOptionPane.showMessageDialog(rootPane, "Confirm password didnt matched", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    try {
                        Connection con1 = dbconnection.DbConnection.getConnect();
                        PreparedStatement ps = con1.prepareStatement("update register set password='" + new_pwd + "' where email='admin@gmail.com'");
                        int i = ps.executeUpdate();
                        if (i > 0) {
                            JOptionPane.showMessageDialog(rootPane, "Password updated successfully");
                            jTextField1.setText("");
                            jTextField2.setText("");
                            jTextField3.setText("");
                        } else {
                            JOptionPane.showMessageDialog(rootPane, "Password not updated due to some error", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                        con1.close();
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }

            }//GEN-LAST:event_jButton1Action


        

