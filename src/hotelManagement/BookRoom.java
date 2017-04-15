package hotelManagement;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;

import javax.swing.*;

public class BookRoom extends Frame implements ActionListener {
	
	private JLabel nameL;
	private JLabel nidL;
	private JLabel addressL;
	private JLabel phoneL;
	//private JLabel roomL;
	private JLabel daysToRentL;
	private JTextField name;
	
	private JTextField nid;
	private JTextField address;
	private JTextField phone;
	//private JComboBox<?> room;
	private JTextField daysToRent;
	
	public BookRoom()
	{
		
		nameL= new JLabel("Name");
		nidL= new JLabel("Nid");
		addressL= new JLabel("Address");
		phoneL= new JLabel("Phone");
		//roomL=new JLabel("Room");
		daysToRentL= new JLabel("Days To Rent");
		
		name = new JTextField();
		nid= new JTextField();
		address= new JTextField();
		phone= new JTextField();
		
	//	String[]options = {"201","202","203"};
		//room= new JComboBox<Object>(options);
		daysToRent=new JTextField();
		
	GridLayout g = new GridLayout(7,2);
		getFrame().setLayout(g);
		
		getFrame().add(nameL);
		getFrame().add(name);
		getFrame().add(nidL);
		getFrame().add(nid);
		getFrame().add(addressL);
		getFrame().add(address);
		getFrame().add(phoneL);
		getFrame().add(phone);
		getFrame().add(getRoomL());
		getFrame().add(getRoom());
		getFrame().add(daysToRentL);
		getFrame().add(daysToRent);
		//getFrame().add(back);
		//getFrame().add(submit);
		getFrame().add(getSubmit());
		getFrame().add(getBack());
		
	}
public void actionPerformed(ActionEvent e) {
	
		if(e.getSource()==getSubmit())
		{
			String nameF= name.getText();
			String nidF=nid.getText();
			String addressF=address.getText();
			String phoneF=phone.getText();
			String roomF = getRoom().getSelectedItem().toString();
			String daysToRentF= daysToRent.getText();
			double days = Double.parseDouble(daysToRentF);
			double totalCost= days*600;
			//write Info to file in append Mode
			
			try {
				FileWriter fw = new FileWriter("data.txt", true);
				
				
				fw.write(nameF+"\n");
				fw.write(nidF+"\n");
				fw.write(addressF+"\n");
				fw.write(phoneF+"\n");
				fw.write(roomF+" \n");
				fw.write(daysToRentF+"\n");
				fw.write(totalCost+"\n");
				
				JOptionPane.showMessageDialog(null, "data Added\n Name:"+nameF+"\nNID:"+nidF+
						"\nAddress:"+addressF+"\nPhone:"+phoneF+"\nRoom No:"+roomF+"\n Rented for"+daysToRentF+"days");
				
				
				
				fw.close();
			} catch (Exception e1) {
				System.out.println(e1.getMessage());
			}
			getFrame().setVisible(false);
			JOptionPane.showMessageDialog(null, "Customer Added Succesfully");
			new Menu();
		}
		else if(e.getSource()==getBack())
		{
			getFrame().setVisible(false);
			new Menu();
			
		}

		
	}
	
	
	
}
