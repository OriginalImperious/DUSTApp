package application;

public class Armor extends Equipment {

	// Needs to initialize an ArrayList<Equipment> from a local file.
	// Local file will be built using utilities and shipped with download and updated as needed.
	
	protected int resistanceImpact = 0;
	protected int resistanceCutting = 0;
	protected int resistanceEdged = 0;
	protected int resistanceThermal = 0;
	protected int resistanceEnergy = 0;
	protected int resistanceAcid = 0;
	protected int equipSlot = 0;
	protected String equipArea = " ";
	protected int armorType = 0;
	protected String armorTypeName = " ";	

	public Armor(String name) {
		super(name);
		Equipment.ID++;
		this.uniqueID = Equipment.ID;
		this.name = name;
	}

	
	
	
	
}
