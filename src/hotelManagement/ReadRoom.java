package hotelManagement;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Scanner;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import fileio.Student;

public class ReadRoom extends Frame implements ActionListener{
	
	
private JLabel messageL;
	
	public ReadRoom()
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
			Person [] persons = new Person [5];
			Scanner s = new Scanner(System.in);
			Person []data = new Person[100];
			int index = 0;
			//Person temp = new Person();
			try {
				
				
				File f = new File("data.txt");
				Scanner x = new Scanner(f);
				while(x.hasNextLine())
				{
					
					String name = x.nextLine();
					String nid = x.nextLine();
					String address = x.nextLine();
					String phone = x.nextLine();
					String daysToRentF = x.nextLine();
					String coastF = x.nextLine();
					// data is stored in file as String, even numbers
					
					double daysToRent = Double.parseDouble(daysToRentF);
					double coast = Double.parseDouble(coastF);
					Person temp = new Person(name,nid,address,phone,daysToRent, coast);
					data[index] = temp;
					index++;
				}
				
				

				
				

				}catch (Exception e1) {

				JOptionPane.showMessageDialog(null, e1.getMessage());
			}
			getFrame().setVisible(true);
			//JOptionPane.showMessageDialog(null, "Mr X booked this room for 3 days \nHis Phone:\nHis Address");

		}
		else if(e.getSource()==getBack())
		{
			getFrame().setVisible(false);
			new Menu();
		}
	

}
}

