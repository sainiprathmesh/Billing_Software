package softwarebilling;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

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
            if (i == 80) {
                jLabel1.setText("Project is going to start, thank you...!!");
            }
        }
    });


    /*
     * GUI designing code
     * */
    @SuppressWarnings("unchecked")

    private void initComponents() {
        jProgressBar1 = new JProgressBar();
        jLabel1 = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                fromWidowOpened(e);
            }
        });

        var contentPane = getContentPane();

        jLabel1.setText("Project Module loading...!!");
    }

    private void fromWidowOpened(java.awt.event.WindowEvent evt) {
        t.start();
    }

    private JProgressBar jProgressBar1;
    private JLabel jLabel1;
}
