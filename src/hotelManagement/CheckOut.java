package hotelManagement;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;


public class CheckOut extends Frame implements ActionListener{
	
		
		private JLabel messageL;
		
	
	public CheckOut(){
	
		messageL=new JLabel("Which room to checkout?");
		
		GridLayout g = new GridLayout(5,2);
		getFrame().setLayout(g);
		
		getFrame().add(messageL);
		getFrame().add(getRoomL());
		getFrame().add(getRoom());
		getFrame().add(getSubmit());
		getFrame().add(getBack());
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==getSubmit())
		{
			try {
				File fr = new File("data.txt");
				Scanner x = new Scanner(fr);
				Scanner s = new Scanner(System.in);
				String roomF = getRoom().getSelectedItem().toString();
				
				
				while(x.hasNextLine())
				{
					for(int i=0;i<1;i++)
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
							JOptionPane.showMessageDialog(null, "in IF condition");
							JOptionPane.showMessageDialog(null, "data readen \n Name:"+nameF+"\nNID:"+nidF+
									"\nAddress:"+addressF+"\nPhone:"+phoneF+"\nRoom No:"+roomF+"\n Rented for"+daysToRentF+"days");
						}
						
					}
					//JOptionPane.showMessageDialog(null, roomF);
				}
				
				
				
				
			} catch (Exception e1) {
				System.out.println(e1.getMessage());
			}
			// remove or delete user data from file by room no. and get his bill info 
			//bill will be 500/- per day. if he stay 6 day bill will be 3000/-
			getFrame().setVisible(false);
			JOptionPane.showMessageDialog(null, "CheckOut SuccessFull , X have to Pay 3000/-");
			new Menu();
			
		}
		if(e.getSource()==getBack())
		{
			getFrame().setVisible(false);
			new Menu();
		}
		
	}
	
}
