 import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.Date;
import java.awt.Rectangle;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.*;
import java.awt.*;

 class BallFrame {
    private JFrame jf;
    private JLabel ballLabel;
    private int xpos = 5;
    private int ypos = 5;	
	private int xdir = 1;	
	private int ydir = 1;
    private int ymax ;	
    private int xmax ;		
     
	
	public void createBall() {
		jf = new JFrame("Ball Example");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(800, 200);
        jf.setLayout(null); 
        ballLabel = new JLabel(new ImageIcon("C:/Users/theda/Documents/dumb courese/CoreJava/tasks/New folder/ball.png"));
        ballLabel.setSize(ballLabel.getPreferredSize());
        jf.add(ballLabel);
        ballLabel.setLocation(xpos, ypos); 
        jf.setVisible(true);
        jf.setLocationRelativeTo(null); 

	}

    public void updateBall() throws InterruptedException {
       Thread.sleep(25);
	    if(jf==null || ballLabel==null) return;
	    xmax=jf.getWidth()-ballLabel.getPreferredSize().width;
		ymax=jf.getHeight()-ballLabel.getPreferredSize().height-40;
        xpos += 10*xdir;
		ypos += 10*ydir;
        if (xpos >= xmax) 
            xdir = -1;
	    if (ypos >= ymax) 
            ydir = -1; 
		if (xpos <= 0) 
            xdir = 1; 
	    if (ypos <= 0) 
            ydir = 1; 
        ballLabel.setLocation(xpos, ypos); 
    }


}


public class BallGui {
 
       public static void main(String[] args)  {
		BallFrame mrq = new BallFrame();
        SwingUtilities.invokeLater(mrq::createBall);
		try {
	   while(true) mrq.updateBall();	
		}
		catch(InterruptedException e)
		{
			System.out.println(e.getMessage());
		}
    }
     

	





}