package javalab.labThird;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class currencyConverter {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(300,150);

        jf.setLayout(new FlowLayout(FlowLayout.RIGHT,20,0));
        
        JTextField doll = new JTextField(15);
        JTextField nrp = new JTextField(15);
        JTextField euro = new JTextField(15);
        jf.add(new Label("Dollor"));
        jf.add(doll);
        jf.add(new Label("Nepalese"));
        jf.add(nrp);
        jf.add(new Label("Euro"));
        jf.add(euro);

        jf.setVisible(true);

        doll.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                String text = doll.getText().trim();
                if (text.isEmpty()) {
                    nrp.setText("");
                    euro.setText("");
                    return;
                }
                double dollar = Double.parseDouble(text);
                nrp.setText(Double.toString(141.8 * dollar));
                euro.setText(Double.toString(0.86 * dollar));
            }
        });
        nrp.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                String text = nrp.getText().trim();
                if (text.isEmpty()) {
                    doll.setText("");
                    euro.setText("");
                    return;
                }
                double nep = Double.parseDouble(text);
                doll.setText(Double.toString( 0.0071 * nep));
                euro.setText(Double.toString(0.0061 * nep));
            }
        });
        euro.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                String text = euro.getText().trim();
                if (text.isEmpty()) {
                    nrp.setText("");
                    doll.setText("");
                    return;
                }
                double dollar = Double.parseDouble(text);
                nrp.setText(Double.toString(164.54 * dollar));
                doll.setText(Double.toString(1.16 * dollar));
            }
        });

    }    
}
