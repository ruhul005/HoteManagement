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
				
				while(x.hasNextLine()){
					
					
					
					for(int i=0; i <1 ;i++)
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
							//JOptionPane.showMessageDialog(null, "in IF condition");
							JOptionPane.showMessageDialog(null, "Checkout Successfully \n\n "+nameF+" have to pay "+costF+" Taka");
						}
						
						
							}
							
						}
					}catch (Exception e1) {

				JOptionPane.showMessageDialog(null, e1.getMessage());
			}

			/*try {
				File fr = new File("data.txt");
				Scanner x = new Scanner(fr);
				String roomF = getRoom().getSelectedItem().toString();
				//Person [] persons = new Person[20];
				
				String[] nameF= new String[10];
				String[] nidF= new String[10];
				String[] addressF= new String[10];
				String[] phoneF= new String[10];
				String[] room= new String[10];
				String[] daysTorentF= new String[10];
				String[] costF= new String[10];
		while(x.hasNextLine()==true)
				{
					for(int i=0;i<1;i++)
					{
						 nameF[i]=x.nextLine();

						nidF[i]=x.nextLine();
						addressF[i]=x.nextLine();
						phoneF[i]=x.nextLine();
						room[i]=x.nextLine();
						daysTorentF[i]=x.nextLine();
						costF[i]=x.nextLine();
						
						if(i==2)
							JOptionPane.showMessageDialog(null, "data Readen i=2");
							
						//{
							JOptionPane.showMessageDialog(null, "data Readen");
							//JOptionPane.showMessageDialog(null, "data readen \n Name:"+nameF[i]+"\nNID:"+nidF[i]+
									//"\nAddress:"+addressF[i]+"\nPhone:"+phoneF[i]+"\nRoom No:"+room[i]+"\n Rented for"+daysTorentF[i]+"days");
						//}			
							while(x.hasNextLine()==false) {
								FileWriter fw = new FileWriter("data.txt" );
								for ( i=0;i<4;i++)
								{
									if(nameF[i]==null)
										continue;
									
									if(room[i].equals(roomF)) {
										JOptionPane.showMessageDialog(null, "Skipped");
										continue;
										}
									
									//fw.write(nameF+"\n");
									fw.write(nameF[i]+"\n");
									JOptionPane.showMessageDialog(null, "name written");
									fw.write(nidF[i]+"\n");
									fw.write(addressF[i]+"\n");
									fw.write(phoneF[i]+"\n");
									fw.write(room[i]+"\n");
									fw.write(daysTorentF[i]+"\n");
									fw.write(costF[i]+"\n");
									
									JOptionPane.showMessageDialog(null, "data Written Again");
									JOptionPane.showMessageDialog(null, "data Written \n Name:"+nameF[i]+"\nNID:"+nidF[i]+
											"\nAddress:"+addressF[i]+"\nPhone:"+phoneF[i]+"\nRoom No:"+room[i]+"\n Rented for"+daysTorentF[i]+"days");
									
							
						}
								fw.close();
								if(x.hasNextLine()==true)
									new Menu();
									
									
								}
				}
					

					
				}
		
	
				}catch (Exception e1) {
				//System.out.println(e1.getMessage());
				JOptionPane.showMessageDialog(null,e1.getMessage());
				
			}*/
			// remove or delete user data from file by room no. and get his bill info 
			//bill will be 500/- per day. if he stay 6 day bill will be 3000/-
			getFrame().setVisible(false);
			//JOptionPane.showMessageDialog(null, "CheckOut SuccessFull , X have to Pay 3000/-");
			new Menu();
			
		}
		if(e.getSource()==getBack())
		{
			getFrame().setVisible(false);
			new Menu();
		}
		
	}
	
}
