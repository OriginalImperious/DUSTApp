package application;

public class Weapon extends Equipment {

	protected int DamageType;
	protected int Damage;
	protected int Size;
	protected int AttackSpeed;
	protected int Range;
	protected int WeaponType;
	protected String WeaponName;
	
	public Weapon(String n) {
		super(n);
		Equipment.ID++;
		this.uniqueID = Equipment.ID;
		this.name = n;
	}
	
	

}
