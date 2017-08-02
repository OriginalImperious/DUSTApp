package Utilities;

import java.io.Serializable;

public class Person implements Serializable{

	private static final long serialVersionUID = -5419985590672845992L;
	private int id;
	private String name;
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return String.format("Person [ID = %d, Name = %s]\n", this.id, this.name);
	}
	
}
