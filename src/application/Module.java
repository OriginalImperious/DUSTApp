package application;

public class Module extends Equipment{

	protected String name;
	protected int uniqueID;
	
	public Module(String n) {
		super(n);
		Equipment.ID++;
		this.uniqueID = Equipment.ID;
		this.name = n;
	}
	
	@Override
	public String toString() {		
		return String.format("%d: %s", this.uniqueID, this.name);
	}
	
}
