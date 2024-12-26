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

 class MarqueeExample {
    private JFrame jf;
    private JLabel marqueeLabel;
    private int pos = 0; 
    public MarqueeExample() {
        
  
		
    }
	
	public void createMarquee() {
		jf = new JFrame("Marquee Example");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(800, 200);
        jf.setLayout(null); 
        marqueeLabel = new JLabel("Hello, Java!");
        marqueeLabel.setFont(new Font("Arial", Font.PLAIN, 24));
        Dimension d = marqueeLabel.getPreferredSize();
        marqueeLabel.setSize(new Dimension(d.width+3,d.height));
        jf.add(marqueeLabel);
        marqueeLabel.setLocation(pos, 80); 
        jf.setVisible(true);
        jf.setLocationRelativeTo(null); 
	}

    public void updateMarquee() throws InterruptedException {
       Thread.sleep(10);
	   if(jf==null) return;
        pos += 2;
        if (pos > jf.getWidth()) {
            pos = -marqueeLabel.getWidth(); 
        }
        marqueeLabel.setLocation(pos, 80); 
    }


}


public class MarqueeGui {
 
       public static void main(String[] args)  {
		MarqueeExample mrq = new MarqueeExample();
        SwingUtilities.invokeLater(mrq::createMarquee);
		try{
	   while(true) 
		mrq.updateMarquee();
		}
		catch(InterruptedException e)
		{
			System.out.println(e.getMessage());
		}
    }
     

	





}