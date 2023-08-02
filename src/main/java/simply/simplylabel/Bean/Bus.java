package simply.simplylabel.Bean;

import javax.persistence.Id;

public class Bus {

	@Id
	private String name;
	private int number;
	private String town;
	public Bus(String name, int number, String town) {
		super();
		this.name = name;
		this.number = number;
		this.town = town;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	@Override
	public String toString() {
		return "Bus [name=" + name + ", number=" + number + ", town=" + town + "]";
	}
	
}

