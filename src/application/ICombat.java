package application;

public interface ICombat {

	int degreeAttackSuccess(Character attacker, Character defender);
	int armorMitigation(int dos, Weapon weapon, Character defender);
	int attackDamage();
	String damageLocations(int dos);
	
	
	
}
