package Utilities;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteObjects {

	public static void main(String args[]) {
		System.out.println("Writing objects ... ");

		Person[] people = { new Person(1, "Sue"), new Person(2, "John"), new Person(3, "Mark"), new Person(4, "Gary"),
				new Person(5, "Allen"), new Person(6, "Albert"), new Person(7, "Arthur"), new Person(8, "Kathleen"),
				new Person(9, "Jennifer"), new Person(10, "Jenny"), new Person(11, "Audrey"), new Person(12, "Wayne"),
				new Person(13, "Dennis"), new Person(14, "Lisa"), new Person(15, "Shawn"), new Person(16, "Erica"),
				new Person(17, "Matt"), new Person(18, "David"), new Person(19, "Erin"), new Person(20, "Terry"), };

		ArrayList<Person> peopleList = new ArrayList<Person>(Arrays.asList(people));

		try (FileOutputStream fs = new FileOutputStream("test.ser");
				ObjectOutputStream os = new ObjectOutputStream(fs)) {

			os.writeObject(people);

			os.writeObject(peopleList);

			os.writeInt(peopleList.size());

			for (Person p : peopleList) {
				os.writeObject(p);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
