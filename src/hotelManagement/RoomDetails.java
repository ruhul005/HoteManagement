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
				File fr = new File("data.txt");
				Scanner x = new Scanner(fr);
				int index = 0;
				
				Person [] persons = new Person[10];
				Scanner s = new Scanner(System.in);
				
				
				String roomF = getRoom().getSelectedItem().toString();
				
				//int room = Integer.parseInt(roomF);
				Person [] data = new Person [30];
				
				
				while(x.hasNextLine()){
					
					
					
					for(int i=0; i <1 ;i++)
					{	
						
						String nameF=x.nextLine();

						String nidF=x.nextLine();
						
						String addressF=x.nextLine();
						//JOptionPane.showMessageDialog(null, "Address readen");
						String phoneF=x.nextLine();
						//JOptionPane.showMessageDialog(null, "Phone readen");
						String room=x.nextLine();
						
						
						//JOptionPane.showMessageDialog(null, "room readen");
						String daysToRentF=x.nextLine();
						//JOptionPane.showMessageDialog(null, "days readen");
						String costF=x.nextLine();
						
						//JOptionPane.showMessageDialog(null, "all data readen");
						if(room.equals(roomF))
							
						{
							JOptionPane.showMessageDialog(null, "in IF condition");
							JOptionPane.showMessageDialog(null, "data readen \n Name:"+nameF+"\nNID:"+nidF+
									"\nAddress:"+addressF+"\nPhone:"+phoneF+"\nRoom No:"+roomF+"\n Rented for"+daysToRentF+"days");
						}
						
						
						
						//JOptionPane.showMessageDialog(null, nameF);
						
						//Person temp = new Person(nameF,nidF,addressF,phoneF,room,daysToRent,tottalCost);
						//persons[i] = temp;
						//data[index] = temp;
						//index++;
						//for( i = 0; i < data.length; i++){
							//if(data[i] != null){ // object is not null
								//JOptionPane.showMessageDialog(null, data[i]);
							}
							
						}
						
					//}
					
				//}
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
