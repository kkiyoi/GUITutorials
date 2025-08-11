

import javax.swing.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;

public class MyFrame extends JFrame{

//MyFrame is the subclass or child class; JFrame is the parent class or super class

MyFrame(){
    //JFrame = a GUI window to add components to

		this.setSize(450, 450); //Sets the x and y dimensions of the frame. 
		this.setTitle("JFrame title goes here"); //Sets the title of the frame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Exit out of the application
		// this.setResizeable(false); Uncomment to make the frame never change. 
		this.setVisible(true); //Makes the frame visible

		ImageIcon image = new ImageIcon("cat1.jpeg");
		this.setIconImage(image.getImage()); //Change the icon image of the frame. 

		//change color of background
		// this.getContentPane().setBackground(new Color(123,50,250)); //Using RGB numbers

		// this.getContentPane().setBackground(new Color(0x123456)); //Using hexidecimal numbers

		this.getContentPane().setBackground(Color.green); 

}
	}	


