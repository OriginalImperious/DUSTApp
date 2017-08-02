package application;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<Character> characters = new ArrayList<Character>();
		Character c1 = new Character("John Wayne", "Patrick M.");
		Character c2 = new Character("Yul Brenner", "Mark B.");
		Character c3 = new Character("Steve McQueen", "Dennis K.");
		Character c4 = new Character("Harvey Keitel", "Patrick M.");
		characters.add(c1);
		characters.add(c2);
		characters.add(c3);
		characters.add(c4);
		
		for (Character c : characters) {
			c.getInfo(0);
		}
		
		ArrayList<Equipment> equipment = new ArrayList<Equipment>();
		equipment.add(new Equipment("Rope, 15 meters"));
		equipment.add(new Equipment("Piton"));
		equipment.add(new Equipment("Carabiner, Light"));
		equipment.add(new Equipment("Carabiner, Medium"));
		equipment.add(new Equipment("Carabiner, Heavy"));
		equipment.add(new Equipment("Rock Spikes, 10 count"));
		equipment.add(new Equipment("Pack, back"));
		equipment.add(new Equipment("Pouch, belt"));

		for (Equipment e : equipment) {
			System.out.println(e.getInfo(4));
		}
		
	}

}
