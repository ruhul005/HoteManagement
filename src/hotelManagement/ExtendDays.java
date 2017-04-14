package hotelManagement;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ExtendDays extends Frame implements ActionListener{
	
	private JLabel DaysToExtendL;
	private JTextField DaysToExtend;
	
	
	public ExtendDays()
	{
		DaysToExtendL = new JLabel("How Much Day You want to extend?");
		DaysToExtend = new JTextField();
		
		GridLayout g = new GridLayout(5,2);
		getFrame().setLayout(g);
		
		getFrame().add(getRoomL());
		getFrame().add(getRoom());
		getFrame().add(DaysToExtendL);
		getFrame().add(DaysToExtend);
		
		getFrame().add(getSubmit());
		getFrame().add(getBack());
	}
	
public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==getSubmit())
		{
			//get customer by room no. and extend his days
			//On message we have to show customer name room no and the days we had extended
			
			getFrame().setVisible(false);
			JOptionPane.showMessageDialog(null, "Mr X from room no 201 extended his room for 3 days");
			new Menu();
		}
		if(e.getSource()==getBack())
		{
			getFrame().setVisible(false);
			new Menu();
		}
		
	}
	

		
}
