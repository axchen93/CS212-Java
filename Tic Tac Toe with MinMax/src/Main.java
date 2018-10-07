package application;
	
import javafx.animation.PauseTransition;
import javafx.application.*;
import javafx.geometry.*;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Scene;


public class Main extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}
	
	static Stage window;
	static Scene launch, main, newPlayer, newGame;
	static GameGrid newPlay, currentPlay;
	static String currentLevel;
	Image logo = new Image(getClass().getResourceAsStream("logo.png"));

	@Override
	public void start(Stage primaryStage) {
		
		//Launch scene ******************************************************************************************
		window = new Stage();
		window.setTitle("UTLIMATE TIC TAC TOE");
		ImageView main = new ImageView();
		main.setImage(logo);
		main.setFitHeight(200);
		main.setFitWidth(200);
		Label welcome = new Label("ULTIMATE TIC TAC TOE");
		welcome.setStyle("-fx-font-size: 30px helvetica;-fx-font-weight: bold; -fx-text-fill: #C42114;");
		Label loading = new Label("Loading...");
		loading.setStyle("-fx-font-size: 20px; -fx-font-style: oblique; -fx-text-fill: #74E700; -fx-font-weight: bold;");
		VBox pane = new VBox();
		pane.getChildren().addAll(welcome, main, loading);
		pane.setAlignment(Pos.CENTER);
		pane.setSpacing(10);
		pane.setPadding(new Insets(50,0,50,0));
		pane.setStyle("  -fx-background-color: linear-gradient(to bottom, #47BAE1, #135268);");
		launch = new Scene(pane, 500,500);
		window.setScene(launch);
		window.show();
		PauseTransition pause = new PauseTransition(Duration.seconds(2));
		pause.setOnFinished(event -> setMain());
		pause.play();
		
	}
	
	private void setMain() {
		
		Button newGame = new Button("New Game");
		newGame.setPrefSize(100, 100);
		newGame.setShape(new Circle(100));
		newGame.setStyle("-fx-background-color: #27FEFE; -fx-text-fill: #342E2E; -fx-focus-color: #0B0B0B;");
		newGame.setOnAction(e -> setNewPlayer());
		ImageView tic = new ImageView();
		tic.setImage(logo);
		tic.setFitHeight(300);
		tic.setFitWidth(300);
		VBox launchPane = new VBox();
		launchPane.getChildren().addAll(tic,newGame);
		launchPane.setAlignment(Pos.CENTER);
		launchPane.setSpacing(10);
		launchPane.setStyle("  -fx-background-color: linear-gradient(to bottom, #47BAE1, #135268);");
		main = new Scene(launchPane, 500, 500);
		window.setScene(main);
	}
	
	private void setNewPlayer() {
		
		Label newPlayerLabel = new Label("Welcome to ULTIMATE TIC TAC TOE NOOB");
		Label userName = new Label("Enter your user name: ");
		TextField user = new TextField();
		Button play = new Button("Play");
		user.setMinWidth(20);
		ComboBox<String> level = new ComboBox<String>();
		level.getItems().addAll("Easy", "Hardcore", "PvP");
		level.setPromptText("---Select your level---");
		play.setOnAction(e->{
			newPlay = new GameGrid(user.getText());
			currentPlay = newPlay;
			currentLevel = level.getValue();
			if(currentLevel == "Easy") newPlay.setEasyGame();
			if(currentLevel == "Hardcore") newPlay.setHardcoreGame();
			if(currentLevel == "PvP") newPlay.setPVP();
		});
		GridPane newPane = new GridPane();
		newPane.setAlignment(Pos.CENTER);
		newPane.setHgap(20);
		newPane.setVgap(50);
		newPane.addRow(1, newPlayerLabel);
		newPane.addRow(2, userName, user);
		newPane.addRow(3, level);
		newPane.addRow(4, play);
		newPane.setStyle("  -fx-background-color: linear-gradient(to bottom, #47BAE1, #135268);");
		newPlayer = new Scene(newPane, 500, 500);
		window.setScene(newPlayer);
		
	}

	public static void setNewGame() {
		Label newPlayerLabel = new Label("Welcome to ULTIMATE TIC TAC TOE NOOB");
		Button play = new Button("Play");
		ComboBox<String> level = new ComboBox<String>();
		level.getItems().addAll("Easy", "Hardcore", "PvP");
		level.setPromptText("---Select your level---");
		play.setOnAction(e->{
			currentLevel = level.getValue();
			if(currentLevel == "Easy") newPlay.setEasyGame();
			if(currentLevel == "Hardcore") newPlay.setHardcoreGame();
			if(currentLevel == "PvP") newPlay.setPVP();
		});
		VBox newPane = new VBox();
		newPane.getChildren().addAll(newPlayerLabel,level, play);
		newPane.setAlignment(Pos.CENTER);
		newPane.setSpacing(100);
		newPane.setStyle("  -fx-background-color: linear-gradient(to bottom, #47BAE1, #135268);");
		newGame = new Scene(newPane, 500, 500);
		window.setScene(newGame);
	}

}
