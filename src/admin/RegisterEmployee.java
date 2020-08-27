package admin;

public class RegisterEmployee extends javax.swing.JFrame {
    public RegisterEmployee() {
        initComponents();
    }

    private void initComponents() {
        jTextField2 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18));
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
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(112, 112, 112)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel4)
                                                )
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
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
        {
            JOptionPane.showMessageDialog(rootPane, "Name is not valid", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if (!v.emailValidate(email1)) {
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


            }


        }

    }
