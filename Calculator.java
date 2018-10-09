//Colin Lesser
//Calculator App

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame
{ 
   private final int WINDOW_WIDTH = 450;
   private final int WINDOW_HEIGHT = 600;
   private JTextField result;
   private float calc;
   private float solve;
   boolean addB = false;
   boolean minusB = false;
   boolean multB= false;
   boolean divB = false;
   String screen = "";
   
   public Calculator()
   {    
      JFrame window = new JFrame();
      window.setResizable(false);
      
      window.setTitle("Homework 5 Calculator");
      window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);      
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      JPanel p1 = new JPanel();
      window.add(p1);
      
      JTextField screen = new JTextField();
      
      JPanel p2 = new JPanel();
      p1.setLayout(new FlowLayout());
      p2.add(result = new JTextField(20));
      result.setHorizontalAlignment(JTextField.RIGHT);
      result.setEditable(false);
      window.add(p2);
      
      window.add(p2);
      
      JButton nine = new JButton("9");
      nine.setPreferredSize(new Dimension(80, 50));
      nine.addActionListener(new NineListener());
      
      JButton eight = new JButton("8");
      eight.setPreferredSize(new Dimension(80, 50));
      eight.addActionListener(new EightListener());
      
      JButton seven = new JButton("7");
      seven.setPreferredSize(new Dimension(80, 50));
      seven.addActionListener(new SevenListener());
      
      JButton six = new JButton("6");
      six.setPreferredSize(new Dimension(80, 50));
      six.addActionListener(new SixListener());
      
      JButton five = new JButton("5");
      five.setPreferredSize(new Dimension(80, 50));
      five.addActionListener(new FiveListener());
      
      JButton four = new JButton("4");
      four.setPreferredSize(new Dimension(80, 50));
      four.addActionListener(new FourListener());
      
      JButton three = new JButton("3");
      three.setPreferredSize(new Dimension(80, 50));
      three.addActionListener(new ThreeListener());
      
      JButton two = new JButton("2");
      two.setPreferredSize(new Dimension(80, 50));
      two.addActionListener(new TwoListener());
      
      JButton one = new JButton("1");
      one.addActionListener(new OneListener());
      one.setPreferredSize(new Dimension(80, 50));
      
      JButton zero = new JButton("0");
      zero.setPreferredSize(new Dimension(80, 50));
      zero.addActionListener(new ZeroListener());
      
      p1.add(nine);
      p1.add(eight);
      p1.add(seven);
      p1.add(six);
      p1.add(five);
      
      p1.add(four);
      p1.add(three);
      p1.add(two);
      p1.add(one);          
      p1.add(zero);
     
      JPanel p3 = new JPanel();
      p3.setLayout(new FlowLayout());
      window.add(p3);
         
      JButton plus = new JButton("+");
      plus.setPreferredSize(new Dimension(80, 50));
      plus.addActionListener(new PlusListener());
      
      JButton minus = new JButton("-");
      minus.setPreferredSize(new Dimension(80, 50));
      minus.addActionListener(new MinusListener());
      
      JButton multiply = new JButton("x");
      multiply.setPreferredSize(new Dimension(80, 50));
      multiply.addActionListener(new MultiplyListener());
      
      JButton divide = new JButton("/");
      divide.setPreferredSize(new Dimension(80, 50));
      divide.addActionListener(new DivideListener());
      
      JButton clear = new JButton("Clear");
      clear.setPreferredSize(new Dimension(80, 50));
      clear.addActionListener(new ClearListener());
      
      JButton enter = new JButton("Enter");
      enter.setPreferredSize(new Dimension(80, 50));
      enter.addActionListener(new EnterListener()); 
      
      JButton decimal = new JButton(".");
      decimal.setPreferredSize(new Dimension(80, 50));
      decimal.addActionListener(new DecimalListener());
      
      p3.add(multiply);
      p3.add(divide);
      p3.add(minus);
      p3.add(plus);
      p3.add(decimal);
      p3.add(enter);
      p3.add(clear);
      
      JPanel p = new JPanel();
      p.setLayout(new GridLayout(3,1));
      
      p.add(p2);
      p.add(p1); 
      p.add(p3);
          
      window.add(p);
      p.setBorder(BorderFactory.createLineBorder(Color.black, 5));
               
      window.setVisible(true);
   }
   private class ZeroListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         screen = result.getText();
         result.setText(screen + "0");
      }
   }
   private class OneListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         screen = result.getText();
         result.setText(screen + "1");
      }
   }
   private class TwoListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         screen = result.getText();
         result.setText(screen + "2");
      }
   }
   private class ThreeListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         screen = result.getText();
         result.setText(screen + "3");
      }
   }
   private class FourListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         screen = result.getText();
         result.setText(screen + "4");
      }
   } 
   private class FiveListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         screen = result.getText();
         result.setText(screen + "5");
      }
   }   
   private class SixListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         screen = result.getText();
         result.setText(screen + "6");
      }
   }  
   private class SevenListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         screen = result.getText();
         result.setText(screen + "7");
      }
   }  
   private class EightListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         screen = result.getText();
         result.setText(screen + "8");
      }
   }  
   private class NineListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         screen = result.getText();
         result.setText(screen + "9");
      }
   }
   private class PlusListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         calc = Float.parseFloat(result.getText());
         result.setText("");
         addB = true;
      }
   }
   private class MinusListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         calc = Float.parseFloat(result.getText());
         result.setText("");
         minusB = true;
      }
   }
   private class MultiplyListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         calc = Float.parseFloat(result.getText());
         result.setText("");
         multB = true;
      }
   }
   private class DivideListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         calc = Float.parseFloat(result.getText());
         result.setText("");
         divB = true;
      }
   }
   private class DecimalListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         screen = result.getText();
         result.setText(screen + ".");
      }
   }
    private class ClearListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         result.setText("");
         addB = false;
         minusB= false;
         multB = false;
         divB = false;
         
         calc = 0;
         solve = 0;
      }
   }
   private class EnterListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         solve = Float.parseFloat(result.getText());
         if(addB == true)
            solve = solve + calc;
         else if(minusB == true)
            solve = calc - solve;
         else if(multB == true)
            solve = solve * calc;
         else if(divB == true)
            solve = calc / solve;
         if(solve == calc / 0)
            result.setText("error");
         else
            result.setText(Float.toString(solve));
         
         addB = false;
         minusB = false;
         multB = false;
         divB = false;
      }
   }          
   public static void main(String[] args)
   {
      new Calculator();
   }
}
