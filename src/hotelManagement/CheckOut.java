package hotelManagement;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


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
