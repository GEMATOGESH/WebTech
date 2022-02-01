package logic;

public class Room {
	int id;
	String type;
	int cost;
	boolean booked;
	String user;
	
	public Room(int id, String type, int cost, boolean booked, String user) {
		this.id = id;
		this.type = type;
		this.cost = cost;
		this.booked = booked;
		if (booked) {
			this.user = user;
		}
		else {
			this.user = " ";
		}
	}
	
	public int getId() {
		return id;
	}
	
	public String getType() {
		return type;
	}
	
	public int getCost() {
		return cost;
	}
	
	public boolean getBooked() {
		return booked;
	}
	
	public String getUser() {
		return user;
	}
}
