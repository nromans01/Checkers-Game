import javax.swing.*;
import java.awt.*;

class WinGUI { // WinGUI class start
   
   public WinGUI(String w) { // default constructor start
   
      JFrame wnGUI = new JFrame();
      
      JPanel pan = new JPanel();
      ImageIcon img = new ImageIcon("checkerBoard.png"); 
      ImageIcon img2 = new ImageIcon("wood.png");
      
      JLabel lab = new JLabel("", img, JLabel.CENTER); 
      JLabel lab2 = new JLabel("", img2, JLabel.CENTER);
      JLabel lab3 = new JLabel("GAME OVER");
      JLabel lab4 = new JLabel(w + " is the winner!");
      
      
      wnGUI.add(pan);
      wnGUI.setSize(600, 800);
      wnGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      wnGUI.setVisible(true);
      wnGUI.setLocationRelativeTo(null);
   
      pan.setLayout(null);
      pan.add(lab);
      pan.add(lab2);
      pan.add(lab3);
      pan.add(lab4);
      lab.setBounds(0, 100, 600, 600);
      lab2.setBounds(0,0, 600, 100);
      lab3.setBounds(260, 690, 600, 50);
      lab4.setBounds(235, 710, 600, 50);
   
   } // default constructor end

} // WinGUI class end