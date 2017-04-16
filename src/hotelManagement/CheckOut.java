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
				File f = new File("data.txt");
				Scanner x = new Scanner(f);
				String roomF = getRoom().getSelectedItem().toString();
				int room = Integer.parseInt(roomF );
				
				while(x.hasNextLine())
				{
					for(int i=0;i<=f.length();i++)
					{
						if(room==200+i)
						{
							
						}
					}
					JOptionPane.showMessageDialog(null, roomF);
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
