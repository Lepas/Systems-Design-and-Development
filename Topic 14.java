
import javax.swing.*;

public class topic14 {

//Main Class that calls SimpleFrame Class

	public static void main(String[] args) {
		
		SimpleFrame s=new SimpleFrame();
		s.setVisible(true);
	}

}

--------------------------------------------------------------------
// SimpleFrame Class

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class SimpleFrame extends JFrame {
	 private JButton button = new JButton("Press me!");
	 private JLabel label= new JLabel("Go on, press me");
	 private JPanel backround=new JPanel();
	 private Actionlistener asd = new Actionlistener(label);
   
	 public SimpleFrame()
	{
  
   button.addActionListener(asd); //we call Actionlistener Class
  
	 backround.add(button); //add button to backround
	 backround.add(label);  //add label to backround
		 
	 getContentPane().add(backround);
	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //gives functionality to the close button
	 pack();
	 }
}

---------------------------------------------------------------------------
//Actionlistener Class

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;



public class Actionlistener implements ActionListener{
	
	JLabel label;
	
	Actionlistener(JLabel label){
		this.label=label;
	}
	
public void actionPerformed(ActionEvent e){
		label.setText("what the fuck");
}
}
