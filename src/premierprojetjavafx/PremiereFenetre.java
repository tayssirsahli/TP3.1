package premierprojetjavafx;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;


public class PremiereFenetre extends Application {
	@Override
	public void start(Stage primaryStage) {
		Group root = new Group();
		Scene scene = new Scene(root, 300, 250, Color.WHITE);
		primaryStage.setTitle("Ma première fenêtre");
		primaryStage.setScene(scene);
		
		
		  Rectangle r = new Rectangle(20 , 20, 200,100); ObservableList<Node> liste =
		  root.getChildren(); liste.add(r);
		 
		
		Line l = new Line(30,30,60,60);
		ObservableList<Node> liste2 = root.getChildren();
		
		l.setFill(Color.RED);
		liste2.add(l);
		
		
		Circle c = new Circle(7000, 5000, 5000);
		ObservableList<Node> liste3 = root.getChildren();

		liste2.add(c);

		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
