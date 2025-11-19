package javalab.labFourth;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class studentInfo {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Student Info Form");
        jf.setDefaultCloseOperation(3);
        jf.setSize(6000,100);
        
        jf.setLayout(new BorderLayout());
        

        JPanel info = new JPanel(new GridLayout(6,2));
        info.add(new Label("Name:"));
        JTextField name = new JTextField(20);
        info.add(name);
        
        info.add(new Label("Address:"));
        JTextField addr = new JTextField(15);
        info.add(addr);

        info.add(new Label("Gender"));
        JPanel gn = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JRadioButton male = new JRadioButton("male");
        JRadioButton fem = new JRadioButton("fem");
        ButtonGroup gender = new ButtonGroup();
        gender.add(male);
        gender.add(fem);
        gn.add(male);
        gn.add(fem);
        info.add(gn);
        
        info.add(new Label("Program"));
        String[] list = {"BIM","BCA","BBM","BHM"};
        JComboBox<String> prgm = new JComboBox<>(list);
        info.add(prgm);

        info.add(new Label("Phone: "));
        JTextField phn = new JTextField();
        info.add(phn);

        info.add(new Label("Email:"));
        JTextField em = new JTextField();
        info.add(em);

        jf.add(info, BorderLayout.CENTER);

        JPanel btnLay = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton add = new JButton("Add");
        JButton rst = new JButton("Reset");
        JButton can = new JButton("Cancel");

        btnLay.add(add);
        btnLay.add(rst);
        btnLay.add(can);

        
        jf.add(btnLay, BorderLayout.SOUTH); // buttons at bottom
        jf.pack();
        jf.setResizable(false);
        jf.setVisible(true);

        add.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String nam = name.getText();
                String address = addr.getText();
                JRadioButton[] box = { male, fem, };
                String gen = "";
                for (JRadioButton sel : box) {
                    if (sel.isSelected()) {
                        gen = sel.getText();
                    }
                }
                String prog = (String) prgm.getSelectedItem();
                String phone = phn.getText();
                String email = em.getText();

                JOptionPane.showMessageDialog(jf, 
                    "Name: "+nam+"\naddress: "+address+"\ngender: "+gen+"\nprogram: "+prog+"\nphone: "+phone+"\nemail: "+email
                );
            }
        });
        rst.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                name.setText("");
                addr.setText("");
                phn.setText("");
                em.setText("");
                gender.clearSelection();
                prgm.setSelectedIndex(0);
            }
        });
        can.addMouseListener(new MouseAdapter() {
            @Override
            public  void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
        });
    }
}
