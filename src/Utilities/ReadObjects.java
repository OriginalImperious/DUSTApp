package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadObjects {

	public static void main(String args[]) {
		System.out.println("Reading objects ... ");

		try (FileInputStream fi = new FileInputStream("test.ser"); 
				ObjectInputStream os = new ObjectInputStream(fi)) {

			Person[] folks = (Person[]) os.readObject();

			for (Person p : folks) {
				System.out.println(p.toString());
			}

			@SuppressWarnings("unchecked")
			ArrayList<Person> folksList = (ArrayList<Person>) os.readObject();
			for (Person p : folksList) {
				System.out.printf(" --------------------------------\n %s -------------------------------- \n",
						p.toString());
			}

			int num = os.readInt();

			for (int i = 0; i < num; i++) {
				Person person = (Person) os.readObject();
				System.out.println(person);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
