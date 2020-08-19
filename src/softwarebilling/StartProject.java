package softwarebilling;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author prathmeshkumarsaini on 19/08/20
 */
public class StartProject extends javax.swing.JFrame {

    int delay = 30;
    int i = 0;
    Timer t = new Timer(delay, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            i = i + 1;
            jProgressBar1.setValue(i);
            if (i == 100) {
                t.stop();
                //Login l = new Login();
                //l.setVisible(true);
                setVisible(false);
            }
            if (i == 50) {
                jLabel1.setText("50% module loaded, please wait...!!");
            }

        }
    });
}
