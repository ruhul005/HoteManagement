package hotelManagement;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Frame implements ActionListener{
	private JFrame frame;
	
	private JLabel roomL;
	private JLabel messageL;
	private JComboBox room;
	private JButton submit;
	private JButton back;
	
	public Frame()
	{
		frame = new JFrame();
		
		roomL= new JLabel("Room No");
		messageL=new JLabel ("");
		
		String[]options = {"201","202","203","204","205","206","207","208","209","210"};
		room= new JComboBox<Object>(options);
		//new BookRoom();
		
		submit = new JButton("Submit");
		submit.addActionListener(this);
		back = new JButton("Back");
		back.addActionListener(this);
		
		
		frame.setSize(640, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setTitle("Hotel Management System");
		
		
		
	}
	
	public  JLabel getRoomL()
	{
		return roomL;
	}
	public JComboBox getRoom()
	{
		return room;
	}
	public JButton getSubmit()
	{
		return submit;
	}
	public JButton getBack()
	{
		return back;
	}
	
	public JFrame getFrame()
	{
		return frame;
	}
	public JLabel getMessageL() {
		return messageL;
	}

	public void setMessageL(JLabel messageL) {
		this.messageL = messageL;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		

		
	}

	
	
}
