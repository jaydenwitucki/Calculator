import java.awt.*;
import java.awt.event.*;//to have access tp ActionListener and actionEvent
import javax.swing.*;
import java.util.*;

public class JavaCalculator extends JFrame{
   //instance variables
   private JButton jbtNum1;
   private JButton jbtNum2;
   private JButton jbtNum3;
   private JButton jbtNum4;
   private JButton jbtNum5;
   private JButton jbtNum6;
   private JButton jbtNum7;
   private JButton jbtNum8;
   private JButton jbtNum9;
   private JButton jbtNum0;
   private JButton jbtAdd;
   private JButton jbtSubtract;
   private JButton jbtMultiply;
   private JButton jbtDivide;
   private JButton jbtSolve;
   private JButton jbtClear;
   private double temp;
   private double solveTemp;
   private JTextField jtfResult;
   
   private boolean addBool = false;
   private boolean subtractBool = false;
   private boolean multiplyBool = false;
   private boolean divideBool = false;
   
   String display = "";
   
   //constructor
   public JavaCalculator(){
      JPanel p1 = new JPanel();
      p1.setLayout(new GridLayout(4,3));
      p1.add(jbtNum1 =  new JButton("1"));
      p1.add(jbtNum2 =  new JButton("2"));
      p1.add(jbtNum3 =  new JButton("3"));
      p1.add(jbtNum4 =  new JButton("4"));
      p1.add(jbtNum5 =  new JButton("5"));
      p1.add(jbtNum6 =  new JButton("6"));
      p1.add(jbtNum7 =  new JButton("7"));
      p1.add(jbtNum8 =  new JButton("8"));
      p1.add(jbtNum9 =  new JButton("9"));
      p1.add(jbtNum0 =  new JButton("0"));
      p1.add(jbtClear =  new JButton("C"));
      
      
      
      JPanel p2 = new JPanel();
      p2.setLayout( new FlowLayout());
      p2.add(jtfResult = new JTextField(10));
      jtfResult.setHorizontalAlignment(JTextField.RIGHT);
      jtfResult.setEditable(false);
      
      JPanel p3 = new JPanel(); 
      p3.setLayout(new GridLayout(5,1));
      p3.add(jbtSubtract = new JButton("-"));
      p3.add(jbtAdd = new JButton("+"));
      p3.add(jbtMultiply = new JButton("*"));
      p3.add(jbtDivide = new JButton("/"));
      p3.add(jbtSolve = new JButton("="));
      JPanel p = new JPanel();
      p.setLayout(new GridLayout());
      p.add(p2);
      p.add(p1);
      p.add(p3);
      add(p);
      
      //attach the listener to the button
      //attach an object with the type listen to clear to jbtClear
      // next time you click clear it will create an object that will be handled with action performed
      
      //lets create an inner class for each button


      jbtClear.addActionListener(new ListenToClear());
      jbtNum1.addActionListener(new ListenToOne());
      jbtNum2.addActionListener(new ListenToTwo());
      jbtNum3.addActionListener(new ListenToThree());
      jbtNum4.addActionListener(new ListenToFour());
      jbtNum5.addActionListener(new ListenToFive());
      jbtNum6.addActionListener(new ListenToSix());
      jbtNum7.addActionListener(new ListenToSeven());
      jbtNum8.addActionListener(new ListenToEight());
      jbtNum9.addActionListener(new ListenToNine());
      jbtNum0.addActionListener(new ListenToZero());
      jbtAdd.addActionListener(new ListenToAdd());
      jbtSubtract.addActionListener(new ListenToSub());
      jbtMultiply.addActionListener(new ListenToMulti());
      jbtDivide.addActionListener(new ListenToDivide());
      jbtSolve.addActionListener(new ListenToSolve());
      
      


    }
      
      
   class ListenToOne implements ActionListener{
      public void actionPerformed(ActionEvent event){
         display = jtfResult.getText();
         jtfResult.setText(display + "1"); //adds 1 to text field
         
      }
   }
   
   class ListenToTwo implements ActionListener{
      public void actionPerformed(ActionEvent event){
         display = jtfResult.getText();
         jtfResult.setText(display + "2"); //adds 2 to text field
         
      }
   }
   class ListenToThree implements ActionListener{
      public void actionPerformed(ActionEvent event){
         display = jtfResult.getText();
         jtfResult.setText(display + "3"); //adds 1 to text field
         
      }
   }
   
   class ListenToFour implements ActionListener{
      public void actionPerformed(ActionEvent event){
         display = jtfResult.getText();
         jtfResult.setText(display + "4"); //adds 4 to text field
         
      }
   }
   
   class ListenToFive implements ActionListener{
      public void actionPerformed(ActionEvent event){
         display = jtfResult.getText();
         jtfResult.setText(display + "5"); //adds 4 to text field
         
      }
   }
   class ListenToSix implements ActionListener{
      public void actionPerformed(ActionEvent event){
         display = jtfResult.getText();
         jtfResult.setText(display + "6"); //adds 4 to text field
         
      }
   }
   class ListenToSeven implements ActionListener{
      public void actionPerformed(ActionEvent event){
         display = jtfResult.getText();
         jtfResult.setText(display + "7"); //adds 4 to text field
         
      }
   }
   class ListenToEight implements ActionListener{
      public void actionPerformed(ActionEvent event){
         display = jtfResult.getText();
         jtfResult.setText(display + "8"); //adds 4 to text field
         
      }
   }
   class ListenToNine implements ActionListener{
      public void actionPerformed(ActionEvent event){
         display = jtfResult.getText();
         jtfResult.setText(display + "9"); //adds 4 to text field
         
      }
   }
   class ListenToZero implements ActionListener{
      public void actionPerformed(ActionEvent event){
         display = jtfResult.getText();
         jtfResult.setText(display + "0"); //adds 4 to text field
         
      }
   }
   
   class ListenToAdd implements ActionListener{
      public void actionPerformed(ActionEvent event){
         temp = Double.parseDouble(jtfResult.getText());//convert string from text field to double
         jtfResult.setText("");
         addBool = true; // flag for add is up        
      }
   }
   class ListenToSub implements ActionListener{
      public void actionPerformed(ActionEvent event){
         temp = Double.parseDouble(jtfResult.getText());//convert string from text field to double
         jtfResult.setText("");
         subtractBool = true; // flag for add is up        
      }
   }
   class ListenToMulti implements ActionListener{
      public void actionPerformed(ActionEvent event){
         temp = Double.parseDouble(jtfResult.getText());//convert string from text field to double
         jtfResult.setText("");
         multiplyBool = true; // flag for add is up        
      }
   }
   class ListenToDivide implements ActionListener{
      public void actionPerformed(ActionEvent event){
         temp = Double.parseDouble(jtfResult.getText());//convert string from text field to double
         jtfResult.setText("");
         divideBool = true; // flag for add is up        
      }
   }
   class ListenToSolve implements ActionListener{
      public void actionPerformed(ActionEvent event){
         solveTemp = Double.parseDouble(jtfResult.getText());
         if(addBool){
            solveTemp = solveTemp + temp;
         }else if(subtractBool){
            solveTemp = temp - solveTemp;
         }else if(multiplyBool){
            solveTemp = solveTemp * temp;
         }else if(divideBool){
            solveTemp = solveTemp / temp;
         }    
         jtfResult.setText(Double.toString(solveTemp));
         addBool = false;
         subtractBool = false;
         multiplyBool = false;
         divideBool = false;

      }
   }

   


   class ListenToClear implements ActionListener{
      public void actionPerformed(ActionEvent event){
         jtfResult.setText(" "); //clear out text field
         addBool = false; 
         subtractBool = false;
         multiplyBool = false;
         divideBool = false;
         temp = 0;
         solveTemp = 0;

      }
   }
   
   
   public static void main(String[] args){
      JavaCalculator cal = new JavaCalculator();
      cal.pack();
      cal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      cal.setVisible(true);
   }
      
      
     

      
      
   
   //public interfaces
   
   //inner classes
   
   
}