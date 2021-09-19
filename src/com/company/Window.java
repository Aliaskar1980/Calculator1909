package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Window extends JFrame implements WindowListener, ActionListener {
    private TextField f = new TextField();
    private JButton b9 = new JButton("9");
    private JButton b8 = new JButton("8");
    private JButton b7 = new JButton("7");
    private JButton b6 = new JButton("6");
    private JButton b5 = new JButton("5");
    private JButton b4 = new JButton("4");
    private JButton b3 = new JButton("3");
    private JButton b2 = new JButton("2");
    private JButton b1 = new JButton("1");
    private JButton b0 = new JButton("0");
    private JButton bComma = new JButton(".");
    private JButton bEquals = new JButton("=");
    private JButton bPlus = new JButton("+");
    private JButton bMinus = new JButton("-");
    private JButton del = new JButton("C");
    JButton[] jButtons = {b0,b1,b2,b3,b4,b5,b6,b7,b8,b9};
    JButton[] jButtons1 = {b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,del,bMinus,bPlus,bComma,bEquals};

    private String text = "";
    private int width = 60;
    private int height = 60;
    private int a=0;
    private int b=0;
    private char z;
        public  Window(){
            Font ex = new Font("Impact",Font.BOLD,40);
            setLayout(null);
            setSize(400,600);
            setVisible(true);
            setLocation(600,100);
            f.setFont(ex);
            f.setSize(330,60);
            f.setLocation(25,25);
            f.setVisible(true);
            add(f);

            for (JButton jtn1: jButtons1     ) {
                jtn1.setFont(ex);
                jtn1.setSize(width,height);
                jtn1.setVisible(true);
                add(jtn1);

            }


            b0.setLocation(25,345);
            bComma.setLocation(105,345);
            bEquals.setLocation(185,345);

            b1.setLocation(25,280);
            b2.setLocation(105,280);
            b3.setLocation(185,280);

            b4.setLocation(25,215);
            b5.setLocation(105,215);
            b6.setLocation(185,215);

            b7.setLocation(25,150);
            b8.setLocation(105,150);
            b9.setLocation(185,150);

            del.setLocation(295,150);
            bPlus.setLocation(295,215);
            bMinus.setLocation(295,280);

            for (JButton jbnt1: jButtons1        ) {
                jbnt1.addActionListener(this);
            }
        }

    @Override
    public void actionPerformed(ActionEvent e) {

            for (JButton jbtn: jButtons      ) {
                if (e.getSource()==jbtn){
                    text = text+jbtn.getText();
                    f.setText(text);
                }
            }

            if(e.getSource() == del){
                text ="";
                f.setText(text);
            }

            if(e.getSource() == bPlus){
                a = Integer.parseInt(text);
                f.setText(text+bPlus.getText());
                text ="";
                z = '+';
            }
            if(e.getSource() == bMinus){
                a = Integer.parseInt(text);
                f.setText(text+bMinus.getText());
                text ="";
                z = '-';
            }

            if(e.getSource() == bEquals){
                if(z=='+'){
                    b = Integer.parseInt(text);
                    f.setText(String.valueOf(a+b));
                } else if(z=='-'){
                    b = Integer.parseInt(text);
                    f.setText(String.valueOf(a-b));
                }

            }

    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
