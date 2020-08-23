package employee;

import model.EmpDetails;

import javax.swing.*;
import java.util.HashMap;

/**
 * @author Latesh on 8/23/2020 at 2:33 PM
 */
public class EmpPanel extends javax.swing.JFrame {
    EmpDetails ed;

    public EmpPanel(EmpDetails ed) {
        initComponents();
        this.ed = ed;
    }


    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JButton jButton1;
    private JButton jButton2;

    //    @SuppressWarnings("unchecked")
    private void initComponents() {
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jButton1 = new JButton();
        jButton2 = new JButton();


    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {

        //ChangePwd cp=new ChangePwd(ed);
        //cp.setVisible(true);
        setVisible(false);

    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

        HashMap hm = new HashMap();

        // StartBilling sb=new StartBilling(ed, hm);
        //sb.setVisible(true);
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

}