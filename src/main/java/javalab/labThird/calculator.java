package javalab.labThird;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class calculator {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Calculator");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(400,200);

        Panel mainPn = new Panel(new GridLayout(4, 1));

        Panel num1Pn = new Panel(new FlowLayout());
        num1Pn.add(new Label("Number 1"));
        JTextField num1 = new JTextField(15);
        num1Pn.add(num1);

        Panel num2Pn = new Panel(new FlowLayout());
        num2Pn.add(new Label("Number 2"));
        JTextField num2 = new JTextField(15);
        num2Pn.add(num2);

        Panel rstPn = new Panel(new FlowLayout());
        rstPn.add(new Label("Result"));
        JTextField relt = new JTextField(15);
        relt.setEnabled(false);
        relt.setDisabledTextColor(Color.BLACK);
        relt.setBackground(Color.white);
        rstPn.add(relt);
        
        Panel btnsPn = new Panel(new FlowLayout());
        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton mult = new JButton("*");
        JButton div = new JButton("/");
        btnsPn.add(plus);
        btnsPn.add(minus);
        btnsPn.add(mult);
        btnsPn.add(div);

        mainPn.add(num1Pn);
        mainPn.add(num2Pn);
        mainPn.add(rstPn);
        mainPn.add(btnsPn);

        jf.add(mainPn);
        jf.setVisible(true);

        plus.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fstNum,sndNum;
                try {
                    fstNum = Integer.parseInt(num1.getText());
                    sndNum = Integer.parseInt(num2.getText());
                } catch (NumberFormatException ex) {
                    relt.setText("Please input a valid number");
                    return;
                }
                int sum = fstNum+sndNum;
                relt.setText(Integer.toString(sum));
                
            }
        });
        minus.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fstNum,sndNum;
                try {
                    fstNum = Integer.parseInt(num1.getText());
                    sndNum = Integer.parseInt(num2.getText());
                } catch (NumberFormatException ex) {
                    relt.setText("Please input a valid number");
                    return;
                }
                int sum = fstNum-sndNum;
                relt.setText(Integer.toString(sum));
                
            }
        });
        mult.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fstNum,sndNum;
                try {
                    fstNum = Integer.parseInt(num1.getText());
                    sndNum = Integer.parseInt(num2.getText());
                } catch (NumberFormatException ex) {
                    relt.setText("Please input a valid number");
                    return;
                }
                int sum = fstNum*sndNum;
                relt.setText(Integer.toString(sum));
                
            }
        });
        div.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fstNum,sndNum;
                try {
                    fstNum = Integer.parseInt(num1.getText());
                    sndNum = Integer.parseInt(num2.getText());
                } catch (NumberFormatException ex) {
                    relt.setText("Please input a valid number");
                    return;
                }
                int sum = fstNum/sndNum;
                relt.setText(Integer.toString(sum));
                
            }
        });
        
    }    
}
