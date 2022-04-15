package tp1_javafx_ex1;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class PremiereFenetre extends Application {
	 @Override
	 public void start(Stage primaryStage) {
		 Rectangle r = new Rectangle();
	 Group root = new Group(r);
	 r.setFill(Color.BLUEVIOLET);
	 r.setX(50);
	 r.setY(50);
	 r.setWidth(200);
	 r.setHeight(100);
	 r.setArcWidth(20);
	 r.setArcHeight(20);
	 
	 Scene scene = new Scene(root, 300, 250, Color.WHITE);
	 
	 primaryStage.setTitle("Ma première fenêtre");
	 primaryStage.setScene(scene);
	 primaryStage.show();
	 }
	 public static void main(String[] args) {
	 launch(args);
	 }
	}