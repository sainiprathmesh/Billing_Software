/**
 * @author gps on 29-08-2020 at 08:08
 */
package employee;


import model.EmpDetails;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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

                jLabel1 = new JLabel();
                jTextField1 = new JTextField();
                jPasswordField1 = new JPasswordField();
                jPasswordField2 = new JPasswordField();
                jButton1 = new JButton();
                //======== this ========
                setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                var contentPane = getContentPane();
                //---- jLabel1 ----
                JLabel jLabel1 = null;
                JPasswordField jPasswordField2;
                JButton jButton1;

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




        }



        }



    }


}
