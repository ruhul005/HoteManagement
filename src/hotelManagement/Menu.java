package hotelManagement;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends Frame implements ActionListener {
	
	
	public JButton bookRoom;
	public JButton checkOut;
	public JButton roomDetails;
	public JButton extendDays;
	public JButton dining;
	
	public Menu()
	{
		
		
		bookRoom = new JButton("Book Room");
		bookRoom.addActionListener(this);
		checkOut = new JButton("Checkout");
		checkOut.addActionListener(this);
		roomDetails= new JButton("Room Details");
		roomDetails.addActionListener(this);
		extendDays= new JButton("Extend Days");
		extendDays.addActionListener(this);
		dining = new JButton("Dining");
		dining.addActionListener(this);
		
		
		
		
		GridLayout g = new GridLayout(5, 0);
		getFrame().setLayout(g);
		
		
		getFrame().add(bookRoom);
		getFrame().add(checkOut);
		getFrame().add(extendDays);
		getFrame().add(roomDetails);
		getFrame().add(dining);
		
		
		//getFrame().setSize(640, 250);
		//getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getFrame().setVisible(true);
		//getFrame().setTitle("");
		
		
		
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==bookRoom)
		{
			getFrame().setVisible(false);
			new BookRoom();
			
		}
		
		else if(e.getSource()== checkOut)
		{	
			getFrame().setVisible(false);
			new CheckOut();
		}
		else if(e.getSource()== extendDays)
		{	
			getFrame().setVisible(false);
			new ExtendDays();
		}
		else if(e.getSource()== roomDetails)
		{	
			getFrame().setVisible(false);
			new RoomDetails();
		}
		
		
	}
	

}
