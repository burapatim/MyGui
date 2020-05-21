/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mygui;


import java.awt.Button;
import java.awt.Color;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.plaf.PanelUI;

/**
 *
 * @author Rundorn Music
 */
public class MyGui {

    public static void main(String[] args) {
         MyFrame mf =new MyFrame();
         mf.btn.addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent e) {
                 mf.txt2.setText("20 Bath");
             }
         });
        
    
    }
}

class MyFrame extends JFrame{
    Panel pnl = new Panel();
    Panel pnl2 = new Panel();
    Label lbl1 = new Label();
    Label lbl2 = new Label();
    Label lbl3 = new Label();
    ButtonGroup btnG = new ButtonGroup();
    JRadioButton rbtn1 = new JRadioButton("Bensin");
    JRadioButton rbtn2 = new JRadioButton("Sohol95");
    JRadioButton rbtn3 = new JRadioButton("Sohol E20");
    JTextField txt1 = new JTextField();
    JTextField txt2 = new JTextField();
    JButton btn = new JButton("UPDATE");
    
    public MyFrame(){
      
      setBounds(0, 0, 516, 338);
      setLocationRelativeTo(null);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(null);
      
      
      pnl.setBounds(0, 0, 500, 300);
      pnl.setBackground(Color.lightGray);
      pnl.setLayout(null);
      this.add(pnl);
      
      lbl1.setBounds(10, 10, 110, 30);
      lbl1.setText("Kind of fill the tank");
      pnl.add(lbl1);
      
      rbtn1.setBounds(10, 45, 70, 50);
      rbtn1.setBackground(Color.lightGray);
      pnl.add(rbtn1);
      
      rbtn2.setBounds(150, 45, 85, 50);
      rbtn2.setBackground(Color.lightGray);
      pnl.add(rbtn2);
      
      rbtn3.setBounds(300, 45, 85, 50);
      rbtn3.setBackground(Color.lightGray);
      pnl.add(rbtn3);
      
      btnG.add(rbtn1);
      btnG.add(rbtn2);
      btnG.add(rbtn3);
      
      lbl2.setBounds(10, 105, 200, 30);
      lbl2.setText("How many liters do you want to fill?");
      pnl.add(lbl2);
      
      txt1.setBounds(10, 150, 230, 30);
      txt1.setHorizontalAlignment(SwingConstants.CENTER);
      
      pnl.add(txt1);
      
      
      btn.setBounds(260, 150, 230, 30);
      pnl.add(btn);
      
      pnl2.setBounds(10, 220, 480, 50);
      pnl2.setBackground(Color.GRAY);
      pnl.add(pnl2);
      
      
      lbl3.setBounds(10, 10, 220, 20);
      lbl3.setText("The money you have to pay is equal to");
      lbl3.setBackground(Color.WHITE);
      pnl2.add(lbl3);
      
      txt2.setBounds(250, 10, 220, 20);
      txt2.setBackground(Color.white);
      txt2.setHorizontalAlignment(SwingConstants.CENTER);
      pnl2.setLayout(null);
      pnl2.add(txt2);
      
      
      
      setVisible(true);
  }
    
}