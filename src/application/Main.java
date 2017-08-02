package application;	
import java.util.ArrayList;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


@SuppressWarnings("unused")
public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
//		ArrayList<Character> characters = new ArrayList<Character>();
//		Character c1 = new Character("John Wayne");
//		Character c2 = new Character("Yul Brenner");
//		Character c3 = new Character("Steve McQueen");
//		Character c4 = new Character("Harvey Keitel");
//		characters.add(c1);
//		characters.add(c2);
//		characters.add(c3);
//		characters.add(c4);
//		
//		for (Character c : characters) {
//			c.getInfo(0);
//		}
	}
}
