package admin;


import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;

class AddItem extends javax.swing.JFrame {

    File file;
    /**
     * Creates new form AddItem
     */
    public AddItem() {
        initComponents();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    // Generated using JFormDesigner Evaluation license - unknown
    private void initComponents() {
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jTextField1 = new JTextField();
        jLabel3 = new JLabel();
        jTextField2 = new JTextField();
        jLabel4 = new JLabel();
        jTextField3 = new JTextField();
        jLabel5 = new JLabel();
        jComboBox1 = new JComboBox<>();
        jLabel6 = new JLabel();
        jScrollPane1 = new JScrollPane();
        jTextArea1 = new JTextArea();
        jLabel7 = new JLabel();
        jButton1 = new JButton();
        jLabel8 = new JLabel();
        jButton2 = new JButton();
        //======== this ========
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                formWindowOpened(e);
            }
        });
        var contentPane = getContentPane();
        //---- jLabel1 ----
        jLabel1.setBackground(Color.white);
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
        jLabel2.setText("ID :");

        jTextField1.setEditable(false);

        jLabel3.setText("Name :");

        jLabel4.setText("Price :");

        jLabel5.setText("Categoty :");

        jComboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
                "Select Category",
                "Clothes",
                "Grossery",
                "Toys"
        }));
        //---- jLabel6 ----
        jLabel6.setText("Description :");
        //======== jScrollPane1 ========
        {
            //---- jTextArea1 ----
            jTextArea1.setColumns(20);
            jTextArea1.setRows(5);
            jScrollPane1.setViewportView(jTextArea1);
        }
        //---- jLabel7 ----

        jLabel7.setText("Select Image :");
        //---- jButton1 ----

        jButton1.addActionListener(e -> jButton1ActionPerformed(e));

        //---- jButton2 ----

        jButton2.setText("Add Item");
        jButton2.addActionListener(e -> jButton2ActionPerformed(e));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);

        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(




























    }






































        }

    }


