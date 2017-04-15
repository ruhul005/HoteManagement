package hotelManagement;

public class Person{
	 private String nameF;
	 private String nidF;
	 private String addressF;
	 private String phoneF;
	 private String roomF;
	 private String daysToRentF;
	// private int daysF;
	 private double totalCoastF;
	
	public Person(String nameF,String nidF,String addressF,String phoneF,String roomF,String daysToRentF,double totalCoast) {
		this.nameF=nameF ;
		this.nidF=nidF;
		this.addressF=addressF;
		this.phoneF=phoneF;
		this.roomF=roomF;
		this.daysToRentF=daysToRentF;
		//this.daysF=daysF;
		this.totalCoastF=totalCoast;
	}

	public String getNameF() {
		return  nameF;
	}

	public void setNameF(String  nameF) {
		this.nameF=nameF;
	}
	public String getNidF() {
		return  nidF;
	}
	public void setNidF(String  nidF) {
		this.nidF=nidF;
	}
	public String getAddressF() {
		return  addressF;
	}
	public void setAddressF(String  addressF) {
		this.addressF=addressF;
	}
	public String getPhoneF() {
		return  phoneF;
	}

	public void setPhoneF(String  phoneF) {
		this.phoneF=phoneF;
	}
	public String getRoomF() {
		return  roomF;
	}

	public void setRoomF(String  roomF) {
		this.roomF=roomF;
	}
	public String getDaysToRentF() {
		return  daysToRentF;
	}
	public void setDaysToRentF(String  daysToRentF) {
		this.daysToRentF=daysToRentF;
	}
//	public int getDaysF(){
		//return daysF;
	//}
	//public void setDaysF(int dayF){
		//this.daysF=daysF;
	//}
	public double getTotalCoastF() {
		return totalCoastF;
	}
	public void setTotalCoastF(double  totalCoastF) {
		this.totalCoastF=totalCoastF;
	}

	public String toString(){
		return nameF + ", " + nidF + ", " + addressF+","+phoneF+","+roomF+","+daysToRentF+","+","+totalCoastF;
	}
}


