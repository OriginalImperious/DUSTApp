package application;

public class Equipment {

	protected String name = "";
	protected String mountLocation = "";
	protected int durabilityTotal = 0;
	protected int durabilityCurrent = durabilityTotal;
	protected int weight = 0;
	protected int equipmentType = 0;
	protected String equipmentTypeName = "";
	protected int uniqueID = 0;
	protected static int ID = 0;
	
	public Equipment(String name) {
		super();
		this.uniqueID = ID;
		ID++;
		this.name = name;
		this.mountLocation = "Undeclared";
		this.durabilityTotal = 10;
		this.durabilityCurrent = 10;
		this.weight = 5;
		this.equipmentType = 0;
		this.equipmentTypeName = "Undeclared";
	}
	
	

	public Equipment(String name, String mountLocation, int durabilityTotal, int weight, int equipmentType,
			String equipmentTypeName) {
		super();
		this.name = name;
		this.mountLocation = mountLocation;
		this.durabilityTotal = durabilityTotal;
		this.durabilityCurrent = durabilityTotal;
		this.weight = weight;
		this.equipmentType = equipmentType;
		this.equipmentTypeName = equipmentTypeName;
		this.uniqueID = ID;
		ID++;
	}

	public String getInfo(int info) {
		String string;
		switch (info) {
		case 1:
			string = String.format("%d : %s", this.uniqueID, this.name);
			break;
		case 2:
			string = String.format("%s : %d : %s", this.equipmentTypeName, this.uniqueID, this.name);
			break;
		case 3:
			string = String.format("%s : %d : %s : %s", this.name, this.uniqueID, this.mountLocation, this.equipmentTypeName);
			break;
		case 4:
			string = String.format("%s : %d : %s : %s : %d/%d", this.name, this.uniqueID, this.mountLocation, this.equipmentTypeName, this.durabilityCurrent, this.durabilityTotal);
			break;
		default:
			string = String.format("%s", this.name);
			break;
		}
		
		return string;
	}

	@Override
	public String toString() {
		return String.format("%d: %s",this.uniqueID, this.name);
	}
	
}
