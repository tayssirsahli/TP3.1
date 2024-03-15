package premierprojetjavafx;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Welcomeform extends Application {
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("JavaFX Welcome");

		GridPane root = new GridPane();
		
		Scene scene = new Scene(root, 300, 275, Color.WHITE);
		primaryStage.setScene(scene);
		root.setAlignment(Pos.CENTER);
		root.setStyle("-fx-background-color: lightblue;");
		root.setHgap(10);
		root.setVgap(10);
		root.setPadding(new Insets(25));
		Text scenetitle = new Text("Welcome");
		scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		root.add(scenetitle, 0, 0, 2, 1);
		Label userName = new Label("User Name:");
		root.add(userName, 0, 1);
		TextField userTextField = new TextField();
		root.add(userTextField, 1, 1);
		Label pw = new Label ("Password");
		root.add(pw, 0, 2);
		
		
		Text X = new Text("xxxxxxx");
		 X.setFill(Color.FIREBRICK);
		root.add(X, 1, 4);
		Button btn = new Button("Sign in");
		HBox hbBtn = new HBox(10);
		hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
		hbBtn.getChildren().add(btn);
		root.add(hbBtn, 1, 6);

		PasswordField pwBox = new PasswordField();
		root.add(pwBox, 1, 2);
		
		
		Button btn2 = new Button("Exit");

		hbBtn.getChildren().add(btn2);
		
		btn.setOnAction(new EventHandler<ActionEvent>() {
			 @Override
			 public void handle(ActionEvent e) {
				 if(pwBox.getText().equals("123"))
				 {
					 X.setFill(Color.GREEN);
					 X.setText("Sign in confirmed");
				 }else {
					 X.setFill(Color.RED);
					 X.setText("Incorrect password");
				 }
				 
				 
			 }
			});
		
		btn2.setOnAction(new EventHandler<ActionEvent>() {
			 @Override
			 public void handle(ActionEvent e) {
				Platform.exit();
			 }
			});

		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
