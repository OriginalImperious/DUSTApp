package application;

import java.util.ArrayList;

public class Character {

	protected int statCycles;
	protected int statOperations;
	protected int statRuntimes;
	protected int statEnergy;
	protected int statMovement;
	protected int statAgility;
	protected int statStrength;
	protected int statStamina;
	protected SensorsChemical chemicalSensor = new SensorsChemical();
	protected SensorsOptical opticalSensor = new SensorsOptical();
	protected SensorsAcoustic acousticSensor = new SensorsAcoustic();
	protected SensorsTactile tactileSensor = new SensorsTactile();
	protected String characterName;
	protected String playerName;
	protected ArrayList<Module> modules;
	protected ArrayList<Armor> armor;
	protected ArrayList<Weapon> weapons;
	protected ArrayList<Equipment> equipment;
	private int uniqueID;
	private static int ID = 0;
	
	@Override
	public String toString() {
		return null;
	}
	
	public Character(String name) {
		this.characterName = name;
		uniqueID = ID;
		ID++;
		modules = new ArrayList<Module>();
		armor = new ArrayList<Armor>();
		weapons = new ArrayList<Weapon>();
		equipment = new ArrayList<Equipment>();
	}
	
	public Character(String name, String player) {
		this.characterName = name;
		this.playerName = player;
		uniqueID = ID;
		ID++;
		modules = new ArrayList<Module>();
		armor = new ArrayList<Armor>();
		weapons = new ArrayList<Weapon>();
		equipment = new ArrayList<Equipment>();
	}
	
	public void addEquipment(String name, String Equipment) {
		
	}
	
	public void getInfo(int sort) {		
		String infoDump;		
		switch (sort) {
		case 0:
			infoDump = String.format("%s : %s : %d", this.playerName, this.characterName, this.uniqueID);
			break;
		case 1:
			infoDump = String.format("%s : %s : %d", this.characterName, this.playerName, this.uniqueID);
			break;
		case 2:
			infoDump = String.format("%d : %s : %s", this.uniqueID, this.characterName, this.playerName);
			break;
		default:
			infoDump = "Parameterize with integer. 0 = Player Name; 1 = Character Name; 2 = Character ID";
			break;
		}				
		System.out.println(infoDump);
	}
	
}
