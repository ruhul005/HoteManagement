package hotelManagement;
import java.awt.GridLayout;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Scanner;

public class RoomDetails extends Frame implements ActionListener {
	
	private JLabel messageL;
	
	public RoomDetails()
	{
		messageL=new JLabel("Select Which Room You want the details?");
		
		GridLayout g = new GridLayout(5,2);
		getFrame().setLayout(g);
		
		getFrame().add(messageL);
		getFrame().add(getRoomL());
		getFrame().add(getRoom());
		getFrame().add(getSubmit());
		getFrame().add(getBack());
		
		
	}
	
public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==getSubmit())
		{
			//get info by room no. and show all info from file
			
			try {
				File f = new File("data.txt");
				Scanner x = new Scanner(f);
				int index = 0;
				
				
				
				String roomF = getRoom().getSelectedItem().toString();
				
				int room = Integer.parseInt(roomF);
				
				
				while(x.hasNextLine()){
					
					String roomS []  = new String [30];
					
					for(int i=0;i<roomS.length ;i++)
					{
						if(roomS[i]==x.nextLine())
						{
							//if(roomS[i]==roomF)
							JOptionPane.showMessageDialog(getRoom(), "Record Found");
						}
					}
					index++;
					
					
					
					
				}
			}catch (Exception e1) {
				//System.out.println(e1.getMessage());
				JOptionPane.showMessageDialog(null, e1.getMessage());
			}
		
			
			
			getFrame().setVisible(true);
			JOptionPane.showMessageDialog(null, "Mr X booked this room for 3 days \nHis Phone:\nHis Address");
			//new Menu();
		}
		else if(e.getSource()==getBack())
		{
			getFrame().setVisible(false);
			new Menu();
		}
	

}
}
