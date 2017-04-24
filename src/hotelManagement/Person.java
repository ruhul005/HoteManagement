package hotelManagement;

public class Person {
	
	private String name;
	private String nid;
	private String address;
	private String phone;
	private double daysToRent;
	private double coast;
	
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", nid=" + nid + ", address=" + address + ", phone=" + phone + ", daysToRent="
				+ daysToRent + ", coast=" + coast + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNid() {
		return nid;
	}
	public void setNid(String nid) {
		this.nid = nid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public double getDaysToRent() {
		return daysToRent;
	}
	public void setDaysToRent(double daysToRent) {
		this.daysToRent = daysToRent;
	}
	public double getCoast() {
		return coast;
	}
	public void setCoast(double coast) {
		this.coast = coast;
	}

}
