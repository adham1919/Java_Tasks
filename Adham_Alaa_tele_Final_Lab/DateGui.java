import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.util.Date;

class  MyFrame {
	private JFrame jf ;
	private JLabel timeLabel;
	public MyFrame() 
	{
		
	}
	
	public void createFrame()
	{
		jf = new JFrame();
		timeLabel = new JLabel();
		jf.setTitle("Date Application");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(1000,500);
		jf.setLocationRelativeTo(null);
		jf.setVisible(true);	
		Date d= new Date();
		setLabel(d.toString());
		
	//	
	}
	
	public void setLabel(String d)
	{
		if(timeLabel!=null){
		timeLabel.setHorizontalAlignment(JLabel.CENTER);
        timeLabel.setText(d);
        jf.add(timeLabel,BorderLayout.CENTER);}
	}
	
}



public class DateGui {
public static void main(String args[ ])  
{
    
    MyFrame mf = new  MyFrame();
    SwingUtilities.invokeLater(mf::createFrame);
	try {
		 while(true){
        Date d= new Date();
		mf.setLabel(d.toString());
	   Thread.sleep(1000);
		}}
		 catch(InterruptedException x) {
			 System.out.println(x.getMessage());
		 }

}


}