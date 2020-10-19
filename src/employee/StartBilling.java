package employee;

import model.EmpDetails;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StartBilling extends javax.swing.JFrame {
    ArrayList al;
    HashMap<Integer, ArrayList> hm;
    int count = 0;
    EmpDetails ed;

    private JLabel jLabel1;
    private JTextField jTextField1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JLabel jLabel10;
    private JLabel jLabel12;
    private JScrollPane jScrollPane1;
    private JTextArea jTextArea1;
    private JButton jButton1;
    private JComboBox<String> jComboBox1;
    private JLabel jLabel11;
    private JButton jButton2;

    public StartBilling(EmpDetails ed, HashMap hm) {
        initComponents();
        jButton1.setEnabled(false);
        jComboBox1.setEnabled(false);
        this.ed = ed;

        System.out.println(hm);
        if (hm == null) {
            this.hm = new HashMap<>();
            jButton2.setEnabled(false);
        } else {
            this.hm = hm;

            for (Map.Entry<Integer, ArrayList> map : this.hm.entrySet()) {
                int key = map.getKey();
                if (key > count) {
                    count = key;
                }
            }

            jButton2.setEnabled(true);
        }

    }

    private void initComponents() {
        jLabel1 = new JLabel();
        jTextField1 = new JTextField();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        jLabel8 = new JLabel();
        jLabel9 = new JLabel();
        jLabel10 = new JLabel();
        jLabel12 = new JLabel();
        jScrollPane1 = new JScrollPane();
        jTextArea1 = new JTextArea();
        jButton1 = new JButton();
        jComboBox1 = new JComboBox<>();
        jLabel11 = new JLabel();
        jButton2 = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        var contentPane = getContentPane();

        jLabel1.setFont(new Font("Tahoma", Font.BOLD, 18));
        jLabel1.setForeground(new Color(255, 0, 51));
        jLabel1.setText("Back");
        jLabel1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
//        jLabel1.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                jLabel1MouseClicked(e);
//            }
//        });


//        jTextField1.addKeyListener(new KeyAdapter() {
//            @Override
//            public void keyReleased(KeyEvent e) {
//                jTextField1KeyReleased(e);
//            }
//        });


        jLabel2.setText("Item ID :");
        jLabel3.setText("Item Name :");
        jLabel4.setText("Item Price :");
        jLabel5.setText("Item Category :");
        jLabel6.setText("Item Description :");
        jLabel7.setText("Image");
        jLabel8.setText("_________________________________________");
        jLabel9.setText("_________________________________________");
        jLabel10.setText("_________________________________________");

        {
            jTextArea1.setEditable(false);
            jTextArea1.setColumns(20);
            jTextArea1.setRows(5);
            jScrollPane1.setViewportView(jTextArea1);
        }
        jButton1.setText("Add To Cart");
//        jButton1.addActionListener(e -> jButton1ActionPerformed(e));
        jComboBox1.setModel(new DefaultComboBoxModel<>(new String[]{
                "1",
                "2",
                "3",
                "4",
                "5",
                "6",
                "7",
                "8",
                "9",
                "10"
        }));
//        jComboBox1.addItemListener(e -> jComboBox1ItemStateChanged(e));
        jLabel11.setText("____________________");

        jButton2.setText("Continue");
//        jButton2.addActionListener(e -> jButton2ActionPerformed(e));
    }

}
