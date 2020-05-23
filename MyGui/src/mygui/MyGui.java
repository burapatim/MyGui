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
import javax.swing.JLabel;
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
        
        int money;
        Money m = new Money();
        int moneyTotal ;
        moneyTotal = m.setMoney();
        MyFrame mf =new MyFrame();
        money = Integer.parseInt(mf.txt1.getText());
        moneyTotal = money + moneyTotal;
         mf.btn.addActionListener(new ActionListener() {
             
             @Override
             public void actionPerformed(ActionEvent e) {
                 if(mf.rbtn1.isSelected()){
//                    moneyTotal = money + moneyTotal;
                    mf.txt1.setText(Integer.toString(moneyTotal));
                 }
             }
         });
        
    
    }
}

class MyFrame extends JFrame{
    Panel pnl = new Panel();
    Panel pnl2 = new Panel();
    Label lbl1 = new Label();
    Label lbl2 = new Label();
    JLabel lbl3 = new JLabel();
    ButtonGroup btnG = new ButtonGroup();
    JRadioButton rbtn1 = new JRadioButton("Deposit money");
    JRadioButton rbtn2 = new JRadioButton("Withdraw money");
   
    JTextField txt1 = new JTextField();
    JTextField txt2 = new JTextField();
    JButton btn = new JButton("UPDATE");
    JButton btn2 = new JButton("CHECK MONEY");
    
    public MyFrame(){
      
      setBounds(0, 0, 516, 338);
      setLocationRelativeTo(null);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(null);
      
      
      pnl.setBounds(0, 0, 500, 300);
      pnl.setBackground(Color.lightGray);
      pnl.setLayout(null);
      this.add(pnl);
      
      
      rbtn1.setBounds(10, 10, 110, 50);
      rbtn1.setBackground(Color.lightGray);
      pnl.add(rbtn1);
      
      rbtn2.setBounds(10, 45, 130, 50);
      rbtn2.setBackground(Color.lightGray);
      pnl.add(rbtn2);
      

      
      txt1.setBounds(10, 100, 230, 30);
      txt1.setHorizontalAlignment(SwingConstants.CENTER);
      
      pnl.add(txt1);
      
      
      btn.setBounds(10, 150, 230, 30);
      pnl.add(btn);
      btn2.setBounds(260, 150, 230, 30);
      pnl.add(btn2);
      
      pnl2.setBounds(10, 220, 480, 50);
      pnl2.setBackground(Color.GRAY);
      pnl.add(pnl2);
      
      
      lbl3.setBounds(10, 10, 220, 20);
      lbl3.setText("Total");
      lbl3.setHorizontalAlignment(SwingConstants.CENTER);
      lbl3.setBackground(Color.lightGray);
      pnl2.add(lbl3);
      
      txt2.setBounds(250, 10, 220, 20);
      txt2.setBackground(Color.white);
      txt2.setHorizontalAlignment(SwingConstants.CENTER);
      pnl2.setLayout(null);
      pnl2.add(txt2);
      btnG.add(rbtn1);
      btnG.add(rbtn2);
      
      
      setVisible(true);
  }
    
}
class Money{
    private int money = 1000;
    public int setMoney(){
    return money;
    
    }

}