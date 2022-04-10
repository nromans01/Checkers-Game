import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;  
  
public class startGUI { // startGUI class start

   private int psel;

    public startGUI() { // constructor start
    
        JFrame strtGUI = new JFrame(); // creates the main window that houses the GUI and contains the panel
        
        JPanel pan = new JPanel(); // Creates the panel that contains all other parts
        ImageIcon img = new ImageIcon("checkerBoard.png"); // creats the image that will be used as the background for the frame
        
        
        JLabel lab = new JLabel("", img, JLabel.CENTER); // creates a label AND NOW gives it the background of the checkerboard
        JLabel lab2 = new JLabel("Welcome to checkers!"); // creates a label
        JLabel lab3 = new JLabel("Please select either single player or multiplayer!");
        
        JButton single = new JButton("Single player"); // creates a button that makes the game player v computer
        JButton multi = new JButton("Two player"); // creates a button that makes the game PvP
        JButton confirm = new JButton("Confirm"); // creates a button to confirm selection
        
        strtGUI.add(pan); 
        strtGUI.setSize(600, 800);
        strtGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        strtGUI.setVisible(true);
        strtGUI.setLocationRelativeTo(null);
        
        pan.setLayout(null); // no layout is made for the panel so things can be placed wherever on it
        pan.add(single);
        pan.add(multi);
        pan.add(confirm);
        confirm.setVisible(false);
        pan.add(lab);
        pan.add(lab2);
        pan.add(lab3);
        single.setBounds(50, 400, 150, 50);
        multi.setBounds(400, 400, 150, 50);
        confirm.setBounds(500, 650, 100, 150);
        confirm.setBackground(Color.YELLOW);
        confirm.setVerticalAlignment(SwingConstants.CENTER);
        confirm.setHorizontalAlignment(SwingConstants.CENTER);
        lab.setBounds(0, 50, 600, 600);
        lab2.setBounds(250, 0, 600, 50);
        lab3.setBounds(165, 650, 600, 50);
        
        single.addActionListener(new ActionListener()
   		{
   			public void actionPerformed(ActionEvent mouseClick)
   			{
               multi.setVisible(false);
               lab3.setBounds(155, 650, 600, 50);
               lab3.setText("You have chosen single player! Press confirm to continue!");
               psel = 1;
               confirm.setVisible(true);
   			}
      	});
         
         multi.addActionListener(new ActionListener()
   		{
   			public void actionPerformed(ActionEvent mouseClick)
   			{
               single.setVisible(false);
               lab3.setBounds(160, 650, 600, 50);
               lab3.setText("You have chosen two player! Press confirm to continue!");
               psel = 2;
               confirm.setVisible(true);
   			}
      	});
         
         confirm.addActionListener(new ActionListener()
   		{
   			public void actionPerformed(ActionEvent mouseClick)
   			{
               single.setVisible(false);
               multi.setVisible(false);
               confirm.setVisible(false);
               lab2.setVisible(false);
               lab3.setBounds(165, 650, 600, 50);
               lab3.setText("Action confirmed! The game will start shortly!");
               
               if (psel == 1){
                  // create one instance of the player class
                  // create one instance of the computer class
               }
               else if (psel == 2) {
                  // create two instances of the player class
               }
               
   			}
      	});
         
          
    } // constructor end
    
    
} // startGUI class end