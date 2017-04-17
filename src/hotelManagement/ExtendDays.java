package hotelManagement;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Scanner;
public class ExtendDays extends Frame implements ActionListener{
	
	private JLabel daysToExtendL;
	private JTextField daysToExtend;
	
	
	public ExtendDays()
	{
		daysToExtendL = new JLabel("How Much Day You want to extend?");
		daysToExtend = new JTextField();
		
		GridLayout g = new GridLayout(5,2);
		getFrame().setLayout(g);
		
		getFrame().add(getRoomL());
		getFrame().add(getRoom());
		getFrame().add(daysToExtendL);
		getFrame().add(daysToExtend);
		
		getFrame().add(getSubmit());
		getFrame().add(getBack());
	}
	
public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==getSubmit())
		{	
			String roomF = getRoom().getSelectedItem().toString();
			String daysToExtendF= daysToExtend.getText();
			//get customer by room no. and extend his days
			//On message we have to show customer name room no and the days we had extended
			try {
				File fr = new File("data.txt");
				Scanner x = new Scanner(fr);

				

				Scanner s = new Scanner(System.in);
				
				
				//String roomF = getRoom().getSelectedItem().toString();
				
				//int room = Integer.parseInt(roomF);
				//Person [] data = new Person [30];
				
				
				while(x.hasNextLine()){
					
					
					
					for(int i=0; i <1 ;i++)
					{	
						
						String nameF=x.nextLine();

						String nidF=x.nextLine();
						
						String addressF=x.nextLine();

						String phoneF=x.nextLine();

						String room=x.nextLine();
						
						

						String daysToRentF=x.nextLine();

						String costF=x.nextLine();
						

						if(room.equals(roomF))
							
						{
							//JOptionPane.showMessageDialog(null, "in IF condition");
							JOptionPane.showMessageDialog(null, "Days Extended\n\nRoom No: "+roomF+"extended for "+daysToExtendF+" days.");
						}
						
							}
							
						}
					}catch (Exception e1) {

				JOptionPane.showMessageDialog(null, e1.getMessage());
			}

			
			getFrame().setVisible(false);
			//JOptionPane.showMessageDialog(null, "Mr X from room no 201 extended his room for 3 days");
			new Menu();
		}
		if(e.getSource()==getBack())
		{
			getFrame().setVisible(false);
			new Menu();
		}
		
	}
	

		
}
