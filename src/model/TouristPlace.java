package model;

//Create a class called TouristPlace inside model package.
//Include appropriate getters and setters
//Include 3 argument constructor. The order in which the arguments are passed is name, destination and rank of type String.

public class TouristPlace{
	String name;
	String destination;
	String rank;
	
	public TouristPlace(String name, String destination, String rank) {
		super();
		this.name = name;
		this.destination = destination;
		this.rank = rank;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	
}