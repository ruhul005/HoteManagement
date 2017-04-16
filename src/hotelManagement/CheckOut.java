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
			
				String roomF = getRoom().getSelectedItem().toString();
				
				
				Person [] persons = new Person[20];
				
				
				
				String[] nameF= new String[10];
				String[] nidF= new String[10];
				String[] addressF= new String[10];
				String[] phoneF= new String[10];
				String[] room= new String[10];
				String[] daysTorentF= new String[10];
				String[] costF= new String[10];
				
				
				
				
				
				while(x.hasNextLine()==true)
				{
					for(int i=0;i<persons.length;i++)
					{
						 nameF[i]=x.nextLine();

						nidF[i]=x.nextLine();
						addressF[i]=x.nextLine();
						phoneF[i]=x.nextLine();
						room[i]=x.nextLine();
						daysTorentF[i]=x.nextLine();
						costF[i]=x.nextLine();
						
						//if(room.equals(roomF))
							
						//{
							JOptionPane.showMessageDialog(null, "data Readen");
							//JOptionPane.showMessageDialog(null, "data readen \n Name:"+nameF[i]+"\nNID:"+nidF[i]+
									//"\nAddress:"+addressF[i]+"\nPhone:"+phoneF[i]+"\nRoom No:"+room[i]+"\n Rented for"+daysTorentF[i]+"days");
						//}
							while(x.hasNextLine()==false) {
								for (int j=0;j<persons.length;j++)
								{
									FileWriter fw = new FileWriter("data.txt",false );
									
									if(roomF.equals(room)) {
										continue;}
									
									
									fw.write(nameF[j]);
									JOptionPane.showMessageDialog(null, "name written");
									fw.write(nidF[j]);
									fw.write(addressF[j]);
									fw.write(phoneF[j]);
									fw.write(room[j]);
									fw.write(daysTorentF[j]);
									fw.write(costF[j]);
									JOptionPane.showMessageDialog(null, "data Written Again");
									JOptionPane.showMessageDialog(null, "data readen \n Name:"+nameF[j]+"\nNID:"+nidF[j]+
											"\nAddress:"+addressF[j]+"\nPhone:"+phoneF[j]+"\nRoom No:"+room[j]+"\n Rented for"+daysTorentF[j]+"days");
								
							
						}
								}
				}
					JOptionPane.showMessageDialog(null,"Centers block of two for");
					
				
				
				
				}
				
				
				}catch (Exception e1) {
				//System.out.println(e1.getMessage());
				JOptionPane.showMessageDialog(null,e1.getMessage());
				
				
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
