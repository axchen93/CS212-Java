package application;


import javafx.animation.PauseTransition;
import javafx.geometry.*;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;
import javafx.scene.Scene;
import java.util.Random;


public class GameGrid extends Player{
	
	static Random rand;
	static int []gameGrid = new int[9];
	static boolean game = false; // this is true when the game is ongoing, false when no game is going on
	static int numTurns=0;
	static boolean turn; // if true players turn, if false ai turn
	Image win = new Image(getClass().getResourceAsStream("winning.gif"));
	Image lose = new Image(getClass().getResourceAsStream("loser.gif"));
	Image draw = new Image(getClass().getResourceAsStream("draw.gif"));
	
	
	public GameGrid(String name) {
		super(name);
	}
	
	public void setEasyGame() {
		game=true;
		Button b1 = new Button();//button declaration for random fire event
		Button b2 = new Button();
		Button b3 = new Button();
		Button b4 = new Button();
		Button b5 = new Button();
		Button b6 = new Button();
		Button b7 = new Button();
		Button b8 = new Button();
		Button b9 = new Button();
		gameGrid = new int[9];
		numTurns=0;
		turn = true;
		Label top = new Label("EASY MODE");
		Label user = new Label(super.getUserName());
		Label vs = new Label("VS");
		Label ai = new Label("Lil Gary");
		VBox topPane = new VBox();
		topPane.getChildren().addAll(top, user, vs, ai);
		topPane.setSpacing(5);
		topPane.setPadding(new Insets(25, 10, 10, 5));
		topPane.setAlignment(Pos.CENTER);
	///////////////////////////BUTTTONS//////////////////////////////////////////////////////////////////////////BUTTONS//////////////////////////////////////////////	
		b1.setPrefSize(100, 100);
		b1.setShape(new Rectangle(100,100));
		b1.setStyle("-fx-background-color: #50566D; -fx-focus-color: transparent; -fx-border-color: white;");
		b1.setOnAction(e->{
			if(turn == true) {
				if (okay(0)) {
					numTurns++;
					playerTurn(0);
					b1.setText("X");
					b1.setStyle("-fx-background-color: #080707; -fx-focus-color: transparent; -fx-border-color: white;-fx-font: 40 arial; -fx-text-fill: #F90909; -fx-font-weight: bold;");
					turn = false;
					int gary = lilGary();
					if(gary==2)b2.fire();
					else if(gary==3)b3.fire();
					else if(gary==4)b4.fire();
					else if(gary==5)b5.fire();
					else if(gary==6)b6.fire();
					else if(gary==7)b7.fire();
					else if(gary==8)b8.fire();
					else if(gary==9)b9.fire();
				}
			}
			else {
				if (okay(0)) {
					numTurns++;
					otherTurn(0);
					b1.setText("O");
					b1.setStyle("-fx-background-color: #080707; -fx-focus-color: transparent; -fx-border-color: white;-fx-font: 40 arial; -fx-text-fill: #06EF37; -fx-font-weight: bold;");
					turn = true;
				}
			}
			
		});
		b2.setPrefSize(100, 100);
		b2.setShape(new Rectangle(100,100));
		b2.setStyle("-fx-background-color: #50566D; -fx-focus-color: transparent; -fx-border-color: white;");
		b2.setOnAction(e->{
			if(turn == true) {
				if (okay(1)) {
					numTurns++;
					playerTurn(1);
					b2.setText("X");
					b2.setStyle("-fx-background-color: #080707; -fx-focus-color: transparent; -fx-border-color: white;-fx-font: 40 arial; -fx-text-fill: #F90909; -fx-font-weight: bold;");
					turn = false;
					turn = false;
					int gary = lilGary();
					if(gary==1)b1.fire();
					else if(gary==3)b3.fire();
					else if(gary==4)b4.fire();
					else if(gary==5)b5.fire();
					else if(gary==6)b6.fire();
					else if(gary==7)b7.fire();
					else if(gary==8)b8.fire();
					else if(gary==9)b9.fire();
				}
			}
			else {
				if (okay(1)) {
					numTurns++;
					otherTurn(1);
					b2.setText("O");
					b2.setStyle("-fx-background-color: #080707; -fx-focus-color: transparent; -fx-border-color: white;-fx-font: 40 arial; -fx-text-fill: #06EF37; -fx-font-weight: bold;");
					turn = true;
				}
			}

		});
		b3.setPrefSize(100, 100);
		b3.setShape(new Rectangle(100,100));
		b3.setStyle("-fx-background-color: #50566D; -fx-focus-color: transparent; -fx-border-color: white;");
		b3.setOnAction(e->{
			if(turn == true) {
				if (okay(2)) {
					numTurns++;
					playerTurn(2);
					b3.setText("X");
					b3.setStyle("-fx-background-color: #080707; -fx-focus-color: transparent; -fx-border-color: white;-fx-font: 40 arial; -fx-text-fill: #F90909; -fx-font-weight: bold;");
					turn = false;
					turn = false;
					int gary = lilGary();
					if(gary==1)b1.fire();
					else if(gary==2)b2.fire();
					else if(gary==4)b4.fire();
					else if(gary==5)b5.fire();
					else if(gary==6)b6.fire();
					else if(gary==7)b7.fire();
					else if(gary==8)b8.fire();
					else if(gary==9)b9.fire();
				}
			}
			else {
				if (okay(2)) {
					numTurns++;
					otherTurn(2);
					b3.setText("O");
					b3.setStyle("-fx-background-color: #080707; -fx-focus-color: transparent; -fx-border-color: white;-fx-font: 40 arial; -fx-text-fill: #06EF37; -fx-font-weight: bold;");
					turn = true;
				}
			}

		});
		b4.setPrefSize(100, 100);
		b4.setShape(new Rectangle(100,100));
		b4.setStyle("-fx-background-color: #50566D; -fx-focus-color: transparent; -fx-border-color: white;");
		b4.setOnAction(e->{
			if(turn == true) {
				if (okay(3)) {
					numTurns++;
					playerTurn(3);
					b4.setText("X");
					b4.setStyle("-fx-background-color: #080707; -fx-focus-color: transparent; -fx-border-color: white;-fx-font: 40 arial; -fx-text-fill: #F90909; -fx-font-weight: bold;");
					turn = false;
					int gary = lilGary();
					if(gary==1)b1.fire();
					else if(gary==2)b2.fire();
					else if(gary==3)b3.fire();
					else if(gary==5)b5.fire();
					else if(gary==6)b6.fire();
					else if(gary==7)b7.fire();
					else if(gary==8)b8.fire();
					else if(gary==9)b9.fire();
				}
			}
			else {
				if (okay(3)) {
					numTurns++;
					otherTurn(3);
					b4.setText("O");
					b4.setStyle("-fx-background-color: #080707; -fx-focus-color: transparent; -fx-border-color: white;-fx-font: 40 arial; -fx-text-fill: #06EF37; -fx-font-weight: bold;");
					turn = true;
				}
			}

		});
		b5.setPrefSize(100, 100);
		b5.setShape(new Rectangle(100,100));
		b5.setStyle("-fx-background-color: #50566D; -fx-focus-color: transparent; -fx-border-color: white;");
		b5.setOnAction(e->{
			if(turn == true) {
				if (okay(4)) {
					numTurns++;
					playerTurn(4);
					b5.setText("X");
					b5.setStyle("-fx-background-color: #080707; -fx-focus-color: transparent; -fx-border-color: white;-fx-font: 40 arial; -fx-text-fill: #F90909; -fx-font-weight: bold;");
					turn = false;
					turn = false;
					int gary = lilGary();
					if(gary==1)b1.fire();
					else if(gary==2)b2.fire();
					else if(gary==3)b3.fire();
					else if(gary==4)b4.fire();
					else if(gary==6)b6.fire();
					else if(gary==7)b7.fire();
					else if(gary==8)b8.fire();
					else if(gary==9)b9.fire();
				}
			}
			else {
				if (okay(4)) {
					numTurns++;
					otherTurn(4);
					b5.setText("O");
					b5.setStyle("-fx-background-color: #080707; -fx-focus-color: transparent; -fx-border-color: white;-fx-font: 40 arial; -fx-text-fill: #06EF37; -fx-font-weight: bold;");
					turn = true;
				}
			}

		});
		b6.setPrefSize(100, 100);
		b6.setShape(new Rectangle(100,100));
		b6.setStyle("-fx-background-color: #50566D; -fx-focus-color: transparent; -fx-border-color: white;");
		b6.setOnAction(e->{
			if(turn == true) {
				if (okay(5)) {
					numTurns++;
					playerTurn(5);
					b6.setText("X");
					b6.setStyle("-fx-background-color: #080707; -fx-focus-color: transparent; -fx-border-color: white;-fx-font: 40 arial; -fx-text-fill: #F90909; -fx-font-weight: bold;");
					turn = false;
					int gary = lilGary();
					if(gary==1)b1.fire();
					else if(gary==2)b2.fire();
					else if(gary==3)b3.fire();
					else if(gary==4)b4.fire();
					else if(gary==5)b5.fire();
					else if(gary==7)b7.fire();
					else if(gary==8)b8.fire();
					else if(gary==9)b9.fire();
				}
			}
			else {
				if (okay(5)) {
					numTurns++;
					otherTurn(5);
					b6.setText("O");
					b6.setStyle("-fx-background-color: #080707; -fx-focus-color: transparent; -fx-border-color: white;-fx-font: 40 arial; -fx-text-fill: #06EF37; -fx-font-weight: bold;");
					turn = true;
				}
			}

		});
		b7.setPrefSize(100, 100);
		b7.setShape(new Rectangle(100,100));
		b7.setStyle("-fx-background-color: #50566D; -fx-focus-color: transparent; -fx-border-color: white;");
		b7.setOnAction(e->{
			if(turn == true) {
				if (okay(6)) {
					numTurns++;
					playerTurn(6);
					b7.setText("X");
					b7.setStyle("-fx-background-color: #080707; -fx-focus-color: transparent; -fx-border-color: white;-fx-font: 40 arial; -fx-text-fill: #F90909; -fx-font-weight: bold;");
					turn = false;
					int gary = lilGary();
					if(gary==1)b1.fire();
					else if(gary==2)b2.fire();
					else if(gary==3)b3.fire();
					else if(gary==4)b4.fire();
					else if(gary==5)b5.fire();
					else if(gary==6)b6.fire();
					else if(gary==8)b8.fire();
					else if(gary==9)b9.fire();
				}
			}
			else {
				if (okay(6)) {
					numTurns++;
					otherTurn(6);
					b7.setText("O");
					b7.setStyle("-fx-background-color: #080707; -fx-focus-color: transparent; -fx-border-color: white;-fx-font: 40 arial; -fx-text-fill: #06EF37; -fx-font-weight: bold;");
					turn = true;
				}
			}
	
		});
		b8.setPrefSize(100, 100);
		b8.setShape(new Rectangle(100,100));
		b8.setStyle("-fx-background-color: #50566D; -fx-focus-color: transparent; -fx-border-color: white;");
		b8.setOnAction(e->{
			if(turn == true) {
				if (okay(7)) {
					numTurns++;
					playerTurn(7);
					b8.setText("X");
					b8.setStyle("-fx-background-color: #080707; -fx-focus-color: transparent; -fx-border-color: white;-fx-font: 40 arial; -fx-text-fill: #F90909; -fx-font-weight: bold;");
					turn = false;
					int gary = lilGary();
					if(gary==1)b1.fire();
					else if(gary==2)b2.fire();
					else if(gary==3)b3.fire();
					else if(gary==4)b4.fire();
					else if(gary==5)b5.fire();
					else if(gary==6)b6.fire();
					else if(gary==7)b7.fire();
					else if(gary==9)b9.fire();
				}
			}
			else {
				if (okay(7)) {
					numTurns++;
					otherTurn(7);
					b8.setText("O");
					b8.setStyle("-fx-background-color: #080707; -fx-focus-color: transparent; -fx-border-color: white;-fx-font: 40 arial; -fx-text-fill: #06EF37; -fx-font-weight: bold;");
					turn = true;
				}
			}
			
		});
		b9.setPrefSize(100, 100);
		b9.setShape(new Rectangle(100,100));
		b9.setStyle("-fx-background-color: #50566D; -fx-focus-color: transparent; -fx-border-color: white;");
		b9.setOnAction(e->{
			if(turn == true) {
				if (okay(8)) {
					numTurns++;
					playerTurn(8);
					b9.setText("X");
					b9.setStyle("-fx-background-color: #080707; -fx-focus-color: transparent; -fx-border-color: white;-fx-font: 40 arial; -fx-text-fill: #F90909; -fx-font-weight: bold;");
					turn = false;
					int gary = lilGary();
					if(gary==1)b1.fire();
					else if(gary==2)b2.fire();
					else if(gary==3)b3.fire();
					else if(gary==4)b4.fire();
					else if(gary==5)b5.fire();
					else if(gary==6)b6.fire();
					else if(gary==7)b7.fire();
					else if(gary==8)b8.fire();
				}
			}
			else {
				if (okay(8)) {
					numTurns++;
					otherTurn(8);
					b9.setText("O");
					b9.setStyle("-fx-background-color: #080707; -fx-focus-color: transparent; -fx-border-color: white;-fx-font: 40 arial; -fx-text-fill: #06EF37; -fx-font-weight: bold;");
					turn = true;
				}
			}	

		});
		/////////////////////////////////////////////END OF BUTTON///////////////////////////////////////////////////////////////END OF BUTTON//////////////////////////////////////////////
		GridPane gamePane = new GridPane();
		gamePane.addRow(0, b1, b2, b3);
		gamePane.addRow(1, b4, b5, b6);
		gamePane.addRow(2, b7, b8, b9);
		gamePane.setAlignment(Pos.CENTER);
		gamePane.setPrefSize(300, 300);
		
		Label winCount = new Label("Wins: "+super.getWin());
		Label loseCount = new Label("Loses: "+super.getLost());
		Label drawCount = new Label("Draws: "+super.getDraw());
		Button newGame = new Button("New Game");
		newGame.setOnAction(e ->{
			Main.setNewGame();
		});
		Button changeLevel = new Button("Change Level");
		ComboBox<String> level = new ComboBox<String>();
		level.getItems().addAll( "Hardcore", "PvP");
		level.setPromptText("Easy");
		changeLevel.setOnAction(e -> {
			Main.currentLevel = level.getValue();
			if(Main.currentLevel == "Hardcore") setHardcoreGame();
			if(Main.currentLevel == "PvP") setPVP();
		});
		VBox stat = new VBox();
		stat.getChildren().addAll(user, winCount, loseCount, drawCount, level, changeLevel, newGame);
		stat.setAlignment(Pos.CENTER);
		stat.setSpacing(20);
		stat.setPadding(new Insets(5,5,5,20));
		
		BorderPane windowPane = new BorderPane();
		windowPane.setCenter(gamePane);
		windowPane.setTop(topPane);
		windowPane.setLeft(stat);
		windowPane.setStyle("  -fx-background-color: linear-gradient(to bottom, #47BAE1, #135268);");
		
		Scene gameScene = new Scene(windowPane, 500, 500);
		Main.window.setScene(gameScene);
	}
	
	public void setHardcoreGame() {
		game=true;
		Button b1 = new Button();//button declaration for random fire event
		Button b2 = new Button();
		Button b3 = new Button();
		Button b4 = new Button();
		Button b5 = new Button();
		Button b6 = new Button();
		Button b7 = new Button();
		Button b8 = new Button();
		Button b9 = new Button();
		gameGrid = new int[9];
		numTurns=0;
		turn = true;
		Label top = new Label("HARD MODE");
		Label user = new Label(super.getUserName());
		Label vs = new Label("VS");
		Label ai = new Label("GARY");
		VBox topPane = new VBox();
		topPane.getChildren().addAll(top, user, vs, ai);
		topPane.setSpacing(5);
		topPane.setPadding(new Insets(25, 10, 10, 5));
		topPane.setAlignment(Pos.CENTER);
		
		b1.setPrefSize(100, 100);
		b1.setShape(new Rectangle(100,100));
		b1.setStyle("-fx-background-color: #50566D; -fx-focus-color: transparent; -fx-border-color: white;");
		b1.setOnAction(e->{
			if(turn == true) {
				if (okay(0)) {
					numTurns++;
					playerTurn(0);
					b1.setText("X");
					b1.setStyle("-fx-background-color: #080707; -fx-focus-color: transparent; -fx-border-color: white;-fx-font: 40 arial; -fx-text-fill: #F90909; -fx-font-weight: bold;");
					turn = false;
					int gary = Gary();
					if(gary==2)b2.fire();
					else if(gary==3)b3.fire();
					else if(gary==4)b4.fire();
					else if(gary==5)b5.fire();
					else if(gary==6)b6.fire();
					else if(gary==7)b7.fire();
					else if(gary==8)b8.fire();
					else if(gary==9)b9.fire();
				}
			}
			else {
				if (okay(0)) {
					numTurns++;
					otherTurn(0);
					b1.setText("O");
					b1.setStyle("-fx-background-color: #080707; -fx-focus-color: transparent; -fx-border-color: white;-fx-font: 40 arial; -fx-text-fill: #06EF37; -fx-font-weight: bold;");
					turn = true;
				}
			}
			
		});
		b2.setPrefSize(100, 100);
		b2.setShape(new Rectangle(100,100));
		b2.setStyle("-fx-background-color: #50566D; -fx-focus-color: transparent; -fx-border-color: white;");
		b2.setOnAction(e->{
			if(turn == true) {
				if (okay(1)) {
					numTurns++;
					playerTurn(1);
					b2.setText("X");
					b2.setStyle("-fx-background-color: #080707; -fx-focus-color: transparent; -fx-border-color: white;-fx-font: 40 arial; -fx-text-fill: #F90909; -fx-font-weight: bold;");
					turn = false;
					turn = false;
					int gary = Gary();
					if(gary==1)b1.fire();
					else if(gary==3)b3.fire();
					else if(gary==4)b4.fire();
					else if(gary==5)b5.fire();
					else if(gary==6)b6.fire();
					else if(gary==7)b7.fire();
					else if(gary==8)b8.fire();
					else if(gary==9)b9.fire();
				}
			}
			else {
				if (okay(1)) {
					numTurns++;
					otherTurn(1);
					b2.setText("O");
					b2.setStyle("-fx-background-color: #080707; -fx-focus-color: transparent; -fx-border-color: white;-fx-font: 40 arial; -fx-text-fill: #06EF37; -fx-font-weight: bold;");
					turn = true;
				}
			}

		});
		b3.setPrefSize(100, 100);
		b3.setShape(new Rectangle(100,100));
		b3.setStyle("-fx-background-color: #50566D; -fx-focus-color: transparent; -fx-border-color: white;");
		b3.setOnAction(e->{
			if(turn == true) {
				if (okay(2)) {
					numTurns++;
					playerTurn(2);
					b3.setText("X");
					b3.setStyle("-fx-background-color: #080707; -fx-focus-color: transparent; -fx-border-color: white;-fx-font: 40 arial; -fx-text-fill: #F90909; -fx-font-weight: bold;");
					turn = false;
					turn = false;
					int gary = Gary();
					if(gary==1)b1.fire();
					else if(gary==2)b2.fire();
					else if(gary==4)b4.fire();
					else if(gary==5)b5.fire();
					else if(gary==6)b6.fire();
					else if(gary==7)b7.fire();
					else if(gary==8)b8.fire();
					else if(gary==9)b9.fire();
				}
			}
			else {
				if (okay(2)) {
					numTurns++;
					otherTurn(2);
					b3.setText("O");
					b3.setStyle("-fx-background-color: #080707; -fx-focus-color: transparent; -fx-border-color: white;-fx-font: 40 arial; -fx-text-fill: #06EF37; -fx-font-weight: bold;");
					turn = true;
				}
			}

		});
		b4.setPrefSize(100, 100);
		b4.setShape(new Rectangle(100,100));
		b4.setStyle("-fx-background-color: #50566D; -fx-focus-color: transparent; -fx-border-color: white;");
		b4.setOnAction(e->{
			if(turn == true) {
				if (okay(3)) {
					numTurns++;
					playerTurn(3);
					b4.setText("X");
					b4.setStyle("-fx-background-color: #080707; -fx-focus-color: transparent; -fx-border-color: white;-fx-font: 40 arial; -fx-text-fill: #F90909; -fx-font-weight: bold;");
					turn = false;
					int gary = Gary();
					if(gary==1)b1.fire();
					else if(gary==2)b2.fire();
					else if(gary==3)b3.fire();
					else if(gary==5)b5.fire();
					else if(gary==6)b6.fire();
					else if(gary==7)b7.fire();
					else if(gary==8)b8.fire();
					else if(gary==9)b9.fire();
				}
			}
			else {
				if (okay(3)) {
					numTurns++;
					otherTurn(3);
					b4.setText("O");
					b4.setStyle("-fx-background-color: #080707; -fx-focus-color: transparent; -fx-border-color: white;-fx-font: 40 arial; -fx-text-fill: #06EF37; -fx-font-weight: bold;");
					turn = true;
				}
			}

		});
		b5.setPrefSize(100, 100);
		b5.setShape(new Rectangle(100,100));
		b5.setStyle("-fx-background-color: #50566D; -fx-focus-color: transparent; -fx-border-color: white;");
		b5.setOnAction(e->{
			if(turn == true) {
				if (okay(4)) {
					numTurns++;
					playerTurn(4);
					b5.setText("X");
					b5.setStyle("-fx-background-color: #080707; -fx-focus-color: transparent; -fx-border-color: white;-fx-font: 40 arial; -fx-text-fill: #F90909; -fx-font-weight: bold;");
					turn = false;
					turn = false;
					int gary = Gary();
					if(gary==1)b1.fire();
					else if(gary==2)b2.fire();
					else if(gary==3)b3.fire();
					else if(gary==4)b4.fire();
					else if(gary==6)b6.fire();
					else if(gary==7)b7.fire();
					else if(gary==8)b8.fire();
					else if(gary==9)b9.fire();
				}
			}
			else {
				if (okay(4)) {
					numTurns++;
					otherTurn(4);
					b5.setText("O");
					b5.setStyle("-fx-background-color: #080707; -fx-focus-color: transparent; -fx-border-color: white;-fx-font: 40 arial; -fx-text-fill: #06EF37; -fx-font-weight: bold;");
					turn = true;
				}
			}

		});
		b6.setPrefSize(100, 100);
		b6.setShape(new Rectangle(100,100));
		b6.setStyle("-fx-background-color: #50566D; -fx-focus-color: transparent; -fx-border-color: white;");
		b6.setOnAction(e->{
			if(turn == true) {
				if (okay(5)) {
					numTurns++;
					playerTurn(5);
					b6.setText("X");
					b6.setStyle("-fx-background-color: #080707; -fx-focus-color: transparent; -fx-border-color: white;-fx-font: 40 arial; -fx-text-fill: #F90909; -fx-font-weight: bold;");
					turn = false;
					int gary = Gary();
					if(gary==1)b1.fire();
					else if(gary==2)b2.fire();
					else if(gary==3)b3.fire();
					else if(gary==4)b4.fire();
					else if(gary==5)b5.fire();
					else if(gary==7)b7.fire();
					else if(gary==8)b8.fire();
					else if(gary==9)b9.fire();
				}
			}
			else {
				if (okay(5)) {
					numTurns++;
					otherTurn(5);
					b6.setText("O");
					b6.setStyle("-fx-background-color: #080707; -fx-focus-color: transparent; -fx-border-color: white;-fx-font: 40 arial; -fx-text-fill: #06EF37; -fx-font-weight: bold;");
					turn = true;
				}
			}

		});
		b7.setPrefSize(100, 100);
		b7.setShape(new Rectangle(100,100));
		b7.setStyle("-fx-background-color: #50566D; -fx-focus-color: transparent; -fx-border-color: white;");
		b7.setOnAction(e->{
			if(turn == true) {
				if (okay(6)) {
					numTurns++;
					playerTurn(6);
					b7.setText("X");
					b7.setStyle("-fx-background-color: #080707; -fx-focus-color: transparent; -fx-border-color: white;-fx-font: 40 arial; -fx-text-fill: #F90909; -fx-font-weight: bold;");
					turn = false;
					int gary = Gary();
					if(gary==1)b1.fire();
					else if(gary==2)b2.fire();
					else if(gary==3)b3.fire();
					else if(gary==4)b4.fire();
					else if(gary==5)b5.fire();
					else if(gary==6)b6.fire();
					else if(gary==8)b8.fire();
					else if(gary==9)b9.fire();
				}
			}
			else {
				if (okay(6)) {
					numTurns++;
					otherTurn(6);
					b7.setText("O");
					b7.setStyle("-fx-background-color: #080707; -fx-focus-color: transparent; -fx-border-color: white;-fx-font: 40 arial; -fx-text-fill: #06EF37; -fx-font-weight: bold;");
					turn = true;
				}
			}
	
		});
		b8.setPrefSize(100, 100);
		b8.setShape(new Rectangle(100,100));
		b8.setStyle("-fx-background-color: #50566D; -fx-focus-color: transparent; -fx-border-color: white;");
		b8.setOnAction(e->{
			if(turn == true) {
				if (okay(7)) {
					numTurns++;
					playerTurn(7);
					b8.setText("X");
					b8.setStyle("-fx-background-color: #080707; -fx-focus-color: transparent; -fx-border-color: white;-fx-font: 40 arial; -fx-text-fill: #F90909; -fx-font-weight: bold;");
					turn = false;
					int gary = Gary();
					if(gary==1)b1.fire();
					else if(gary==2)b2.fire();
					else if(gary==3)b3.fire();
					else if(gary==4)b4.fire();
					else if(gary==5)b5.fire();
					else if(gary==6)b6.fire();
					else if(gary==7)b7.fire();
					else if(gary==9)b9.fire();
				}
			}
			else {
				if (okay(7)) {
					numTurns++;
					otherTurn(7);
					b8.setText("O");
					b8.setStyle("-fx-background-color: #080707; -fx-focus-color: transparent; -fx-border-color: white;-fx-font: 40 arial; -fx-text-fill: #06EF37; -fx-font-weight: bold;");
					turn = true;
				}
			}
			
		});
		b9.setPrefSize(100, 100);
		b9.setShape(new Rectangle(100,100));
		b9.setStyle("-fx-background-color: #50566D; -fx-focus-color: transparent; -fx-border-color: white;");
		b9.setOnAction(e->{
			if(turn == true) {
				if (okay(8)) {
					numTurns++;
					playerTurn(8);
					b9.setText("X");
					b9.setStyle("-fx-background-color: #080707; -fx-focus-color: transparent; -fx-border-color: white;-fx-font: 40 arial; -fx-text-fill: #F90909; -fx-font-weight: bold;");
					turn = false;
					int gary = Gary();
					if(gary==1)b1.fire();
					else if(gary==2)b2.fire();
					else if(gary==3)b3.fire();
					else if(gary==4)b4.fire();
					else if(gary==5)b5.fire();
					else if(gary==6)b6.fire();
					else if(gary==7)b7.fire();
					else if(gary==8)b8.fire();
				}
			}
			else {
				if (okay(8)) {
					numTurns++;
					otherTurn(8);
					b9.setText("O");
					b9.setStyle("-fx-background-color: #080707; -fx-focus-color: transparent; -fx-border-color: white;-fx-font: 40 arial; -fx-text-fill: #06EF37; -fx-font-weight: bold;");
					turn = true;
				}
			}	

		});
		//////////////////////////////////////////////////END OF BUTTON///////////////////////////////////////////////////////////////END OF BUTTON//////////////////////////////////////////////
		GridPane gamePane = new GridPane();
		gamePane.addRow(0, b1, b2, b3);
		gamePane.addRow(1, b4, b5, b6);
		gamePane.addRow(2, b7, b8, b9);
		gamePane.setAlignment(Pos.CENTER);
		gamePane.setPrefSize(300, 300);
		
		Label winCount = new Label("Wins: "+super.getWin());
		Label loseCount = new Label("Loses: "+super.getLost());
		Label drawCount = new Label("Draws: "+super.getDraw());
		Button newGame = new Button("New Game");
		newGame.setOnAction(e ->{
			Main.setNewGame();
		});
		Button changeLevel = new Button("Change Level");
		ComboBox<String> level = new ComboBox<String>();
		level.getItems().addAll("Easy", "PvP");
		level.setPromptText("Can't Win?");
		changeLevel.setOnAction(e -> {
			Main.currentLevel = level.getValue();
			if(Main.currentLevel == "Easy") setEasyGame();
			if(Main.currentLevel == "PvP") setPVP();
		});
		VBox stat = new VBox();
		stat.getChildren().addAll(user, winCount, loseCount, drawCount, level, changeLevel, newGame);
		stat.setAlignment(Pos.CENTER);
		stat.setSpacing(20);
		stat.setPadding(new Insets(5,5,5,20));
		
		
		BorderPane windowPane = new BorderPane();
		windowPane.setCenter(gamePane);
		windowPane.setTop(topPane);
		windowPane.setLeft(stat);
		windowPane.setStyle("  -fx-background-color: linear-gradient(to bottom, #9E2810, #EB330E);");
		
		Scene gameScene = new Scene(windowPane, 500, 500);
		Main.window.setScene(gameScene);
	}
	
	public void setPVP() {
		game = true;
		gameGrid = new int[9];
		numTurns=0;
		turn = true;
		Label top = new Label("PVP MODE");
		Label user = new Label(super.getUserName());
		Label vs = new Label("VS");
		Label ai = new Label("Person Next To You");
		VBox topPane = new VBox();
		topPane.getChildren().addAll(top, user, vs, ai);
		topPane.setSpacing(5);
		topPane.setPadding(new Insets(25, 10, 10, 5));
		topPane.setAlignment(Pos.CENTER);
		Button b1 = new Button();
		b1.setPrefSize(100, 100);
		b1.setShape(new Rectangle(100,100));
		b1.setStyle("-fx-background-color: #50566D; -fx-focus-color: transparent; -fx-border-color: white;");
		b1.setOnAction(e->{
			if(turn == true) {
				if (okay(0)) {
					numTurns++;
					playerTurn(0);
					b1.setText("X");
					b1.setStyle("-fx-background-color: #080707; -fx-focus-color: transparent; -fx-border-color: white;-fx-font: 40 arial; -fx-text-fill: #F90909; -fx-font-weight: bold;");
					turn = false;
				}
			}
			else {
				if (okay(0)) {
					numTurns++;
					otherTurn(0);
					b1.setText("O");
					b1.setStyle("-fx-background-color: #080707; -fx-focus-color: transparent; -fx-border-color: white;-fx-font: 40 arial; -fx-text-fill: #06EF37; -fx-font-weight: bold;");
					turn = true;
				}
			}
			
		});
		Button b2 = new Button();
		b2.setPrefSize(100, 100);
		b2.setShape(new Rectangle(100,100));
		b2.setStyle("-fx-background-color: #50566D; -fx-focus-color: transparent; -fx-border-color: white;");
		b2.setOnAction(e->{
			if(turn == true) {
				if (okay(1)) {
					numTurns++;
					playerTurn(1);
					b2.setText("X");
					b2.setStyle("-fx-background-color: #080707; -fx-focus-color: transparent; -fx-border-color: white;-fx-font: 40 arial; -fx-text-fill: #F90909; -fx-font-weight: bold;");
					turn = false;
				}
			}
			else {
				if (okay(1)) {
					numTurns++;
					otherTurn(1);
					b2.setText("O");
					b2.setStyle("-fx-background-color: #080707; -fx-focus-color: transparent; -fx-border-color: white;-fx-font: 40 arial; -fx-text-fill: #06EF37; -fx-font-weight: bold;");
					turn = true;
				}
			}

		});
		Button b3 = new Button();
		b3.setPrefSize(100, 100);
		b3.setShape(new Rectangle(100,100));
		b3.setStyle("-fx-background-color: #50566D; -fx-focus-color: transparent; -fx-border-color: white;");
		b3.setOnAction(e->{
			if(turn == true) {
				if (okay(2)) {
					numTurns++;
					playerTurn(2);
					b3.setText("X");
					b3.setStyle("-fx-background-color: #080707; -fx-focus-color: transparent; -fx-border-color: white;-fx-font: 40 arial; -fx-text-fill: #F90909; -fx-font-weight: bold;");
					turn = false;
				}
			}
			else {
				if (okay(2)) {
					numTurns++;
					otherTurn(2);
					b3.setText("O");
					b3.setStyle("-fx-background-color: #080707; -fx-focus-color: transparent; -fx-border-color: white;-fx-font: 40 arial; -fx-text-fill: #06EF37; -fx-font-weight: bold;");
					turn = true;
				}
			}

		});
		Button b4 = new Button();
		b4.setPrefSize(100, 100);
		b4.setShape(new Rectangle(100,100));
		b4.setStyle("-fx-background-color: #50566D; -fx-focus-color: transparent; -fx-border-color: white;");
		b4.setOnAction(e->{
			if(turn == true) {
				if (okay(3)) {
					numTurns++;
					playerTurn(3);
					b4.setText("X");
					b4.setStyle("-fx-background-color: #080707; -fx-focus-color: transparent; -fx-border-color: white;-fx-font: 40 arial; -fx-text-fill: #F90909; -fx-font-weight: bold;");
					turn = false;
				}
			}
			else {
				if (okay(3)) {
					numTurns++;
					otherTurn(3);
					b4.setText("O");
					b4.setStyle("-fx-background-color: #080707; -fx-focus-color: transparent; -fx-border-color: white;-fx-font: 40 arial; -fx-text-fill: #06EF37; -fx-font-weight: bold;");
					turn = true;
				}
			}

		});
		Button b5 = new Button();
		b5.setPrefSize(100, 100);
		b5.setShape(new Rectangle(100,100));
		b5.setStyle("-fx-background-color: #50566D; -fx-focus-color: transparent; -fx-border-color: white;");
		b5.setOnAction(e->{
			if(turn == true) {
				if (okay(4)) {
					numTurns++;
					playerTurn(4);
					b5.setText("X");
					b5.setStyle("-fx-background-color: #080707; -fx-focus-color: transparent; -fx-border-color: white;-fx-font: 40 arial; -fx-text-fill: #F90909; -fx-font-weight: bold;");
					turn = false;
				}
			}
			else {
				if (okay(4)) {
					numTurns++;
					otherTurn(4);
					b5.setText("O");
					b5.setStyle("-fx-background-color: #080707; -fx-focus-color: transparent; -fx-border-color: white;-fx-font: 40 arial; -fx-text-fill: #06EF37; -fx-font-weight: bold;");
					turn = true;
				}
			}

		});
		Button b6 = new Button();
		b6.setPrefSize(100, 100);
		b6.setShape(new Rectangle(100,100));
		b6.setStyle("-fx-background-color: #50566D; -fx-focus-color: transparent; -fx-border-color: white;");
		b6.setOnAction(e->{
			if(turn == true) {
				if (okay(5)) {
					numTurns++;
					playerTurn(5);
					b6.setText("X");
					b6.setStyle("-fx-background-color: #080707; -fx-focus-color: transparent; -fx-border-color: white;-fx-font: 40 arial; -fx-text-fill: #F90909; -fx-font-weight: bold;");
					turn = false;
				}
			}
			else {
				if (okay(5)) {
					numTurns++;
					otherTurn(5);
					b6.setText("O");
					b6.setStyle("-fx-background-color: #080707; -fx-focus-color: transparent; -fx-border-color: white;-fx-font: 40 arial; -fx-text-fill: #06EF37; -fx-font-weight: bold;");
					turn = true;
				}
			}

		});
		Button b7 = new Button();
		b7.setPrefSize(100, 100);
		b7.setShape(new Rectangle(100,100));
		b7.setStyle("-fx-background-color: #50566D; -fx-focus-color: transparent; -fx-border-color: white;");
		b7.setOnAction(e->{
			if(turn == true) {
				if (okay(6)) {
					numTurns++;
					playerTurn(6);
					b7.setText("X");
					b7.setStyle("-fx-background-color: #080707; -fx-focus-color: transparent; -fx-border-color: white;-fx-font: 40 arial; -fx-text-fill: #F90909; -fx-font-weight: bold;");
					turn = false;
				}
			}
			else {
				if (okay(6)) {
					numTurns++;
					otherTurn(6);
					b7.setText("O");
					b7.setStyle("-fx-background-color: #080707; -fx-focus-color: transparent; -fx-border-color: white;-fx-font: 40 arial; -fx-text-fill: #06EF37; -fx-font-weight: bold;");
					turn = true;
				}
			}
	
		});
		Button b8 = new Button();
		b8.setPrefSize(100, 100);
		b8.setShape(new Rectangle(100,100));
		b8.setStyle("-fx-background-color: #50566D; -fx-focus-color: transparent; -fx-border-color: white;");
		b8.setOnAction(e->{
			if(turn == true) {
				if (okay(7)) {
					numTurns++;
					playerTurn(7);
					b8.setText("X");
					b8.setStyle("-fx-background-color: #080707; -fx-focus-color: transparent; -fx-border-color: white;-fx-font: 40 arial; -fx-text-fill: #F90909; -fx-font-weight: bold;");
					turn = false;
				}
			}
			else {
				if (okay(7)) {
					numTurns++;
					otherTurn(7);
					b8.setText("O");
					b8.setStyle("-fx-background-color: #080707; -fx-focus-color: transparent; -fx-border-color: white;-fx-font: 40 arial; -fx-text-fill: #06EF37; -fx-font-weight: bold;");
					turn = true;
				}
			}
			
		});
		Button b9 = new Button();
		b9.setPrefSize(100, 100);
		b9.setShape(new Rectangle(100,100));
		b9.setStyle("-fx-background-color: #50566D; -fx-focus-color: transparent; -fx-border-color: white;");
		b9.setOnAction(e->{
			if(turn == true) {
				if (okay(8)) {
					numTurns++;
					playerTurn(8);
					b9.setText("X");
					b9.setStyle("-fx-background-color: #080707; -fx-focus-color: transparent; -fx-border-color: white;-fx-font: 40 arial; -fx-text-fill: #F90909; -fx-font-weight: bold;");
					turn = false;
				}
			}
			else {
				if (okay(8)) {
					numTurns++;
					otherTurn(8);
					b9.setText("O");
					b9.setStyle("-fx-background-color: #080707; -fx-focus-color: transparent; -fx-border-color: white;-fx-font: 40 arial; -fx-text-fill: #06EF37; -fx-font-weight: bold;");
					turn = true;
				}
			}	

		});
		GridPane gamePane = new GridPane();
		gamePane.addRow(0, b1, b2, b3);
		gamePane.addRow(1, b4, b5, b6);
		gamePane.addRow(2, b7, b8, b9);
		gamePane.setAlignment(Pos.CENTER);
		gamePane.setPrefSize(300, 300);
	
		Button newGame = new Button("New Game");
		newGame.setOnAction(e ->{
			Main.setNewGame();
		});
		Button changeLevel = new Button("Change Level");
		ComboBox<String> level = new ComboBox<String>();
		level.getItems().addAll("Easy", "Hardcore");
		level.setPromptText("PvP");
		changeLevel.setOnAction(e -> {
			Main.currentLevel = level.getValue();
			if(Main.currentLevel == "Hardcore") setHardcoreGame();
			if(Main.currentLevel == "Easy") setEasyGame();
		});
		VBox stat = new VBox();
		stat.getChildren().addAll(level, changeLevel, newGame);
		stat.setAlignment(Pos.CENTER);
		stat.setSpacing(20);
		stat.setPadding(new Insets(5,5,5,20));
		
		
		BorderPane windowPane = new BorderPane();
		windowPane.setCenter(gamePane);
		windowPane.setTop(topPane);
		windowPane.setLeft(stat);
		windowPane.setStyle("  -fx-background-color: linear-gradient(to bottom, #47BAE1, #135268);");
		Scene gameScene = new Scene(windowPane, 500, 500);
		Main.window.setScene(gameScene);
	}

	private int lilGary() { // Easy mode ai// Randomly pick an available position
		if(game==true) {
			rand = new Random();
			int randButton = rand.nextInt(9);
			while(!okay(randButton)) {
				randButton = rand.nextInt(9);
			}
			return randButton+1;
		}
		return 0;
	}
	
	private int Gary(){
		if(game==true) {
			int optimalMove = Integer.MIN_VALUE;
			int move=0;
			for(int i=0; i<9; i++) {
				if(okay(i)) {
					gameGrid[i]=2;
					int nextMove = miniMax(1, false);
					if(nextMove > optimalMove) {
						optimalMove = nextMove;
						move = i;
					}
					gameGrid[i]=0;
				}
			}
			return move+1;
		}
		return 0;
	}
	
	private int miniMax(int depth, boolean aiTurn) {
		int score = evaluation();
		if(score==10) return score-depth;
		if(score==-10) return score+depth;
		if(!movesLeft())return 0;
		if(aiTurn) {
			int best = Integer.MIN_VALUE;
			for(int i =0; i<9; i++) {
				if(okay(i)) {
					gameGrid[i]=2;
					best= Math.max(best, miniMax(depth+1, !aiTurn));
					gameGrid[i]=0;
				}
			}
			return best;
		}else {
			int best = Integer.MAX_VALUE;
			for(int i =0; i<9; i++) {
				if(okay(i)) {
					gameGrid[i]=1;
					best= Math.min(best, miniMax(depth+1, !aiTurn));
					gameGrid[i]=0;
				}
			}
			return best;
		}
	}
		
 	private int evaluation() {
 		//check row for either X(1) or O(2) victory
 		for(int i=0; i<9; i+=3) {
 			if(gameGrid[i]==gameGrid[i+1] && gameGrid[i+1]==gameGrid[i+2]) {
 				if(gameGrid[i]==2) return +10;
 				else if (gameGrid[i]==1) return -10;			}
 		}
 		//check col
 		for(int i=0; i<3; i++) {
 			if(gameGrid[i]==gameGrid[i+3] && gameGrid[i+3]==gameGrid[i+6]) {
 				if(gameGrid[i]==2) return +10;
 				else if (gameGrid[i]==1) return -10;			}
 		}
 		//check dia
 		if(gameGrid[0]==gameGrid[4] && gameGrid[4]==gameGrid[8]) {
 			if(gameGrid[0]==2) return +10;
 			else if(gameGrid[0]==1) return -10;
 		}
 		if(gameGrid[2]==gameGrid[4] && gameGrid[4]==gameGrid[6]) {
 			if(gameGrid[2]==2) return +10;
 			else if(gameGrid[2]==1) return -10;
 		}
 		
 		return 0;
 		
 	}
 	
 	private boolean movesLeft() {
		for(int i=0; i<9; i++) {
			if(gameGrid[i]==0) return true;
		}
		return false;
	}

	private boolean okay(int r) {
		if(gameGrid[r]==0)return true;
		else return false;
	}
		
	private void playerTurn(int r) {
		gameGrid[r]=1;
		if(checkWin(r, 1)) {
			super.setWin();
			game = false;
			setWinScene();
		}else if(numTurns==9) {
			super.setDraw();
			game = false;
			setDrawScene();
		}else return;
	}
	
	private void otherTurn(int r) {
		gameGrid[r]=2;
		if(checkWin(r, 2)) {
			super.setLose();
			game = false;
			setLoseScene();
		}else return;
	}
	
	private boolean checkWin(int i, int check) {
		int index = i, row = index/3, col=index%3;
		if (rowTest(row, col, check)) return true;	
		if (colTest(row, col, check)) return true;
		if(index%2==0)
			if(diaTest(row, col, check)) return true;
		return false;
	
	}
	
	private boolean diaTest(int r, int c, int x) {
		int count=0;
		int index = (r*3)+(c%3);
		if(index == 4) {
			for(int i=2; i<8; i+=2)
				if(gameGrid[i]==x) count++;
			if(count ==3) return true;
			else count=0;
			for(int i=0; i<9 ; i+=4)
				if(gameGrid[i]==x) count++;
			if(count ==3) return true;
			else count=0;
		}
		
		if(index%4==0) {
			for(int i=0; i<9 ; i+=4)
				if(gameGrid[i]==x) count++;
			if(count ==3) return true;
			else count=0;
		}
		if(index%4!=0) {
			for(int i=2; i<8; i+=2)
				if(gameGrid[i]==x) count++;
			if(count ==3) return true;
			else count=0;
		}
		return false;
	}
		
	private boolean rowTest(int r, int c, int x) {
		int count =0;
		int row = r;
		for(int i=0; i<2; i++) {
			int index = ((row+1)%3*3)+(c%3);
			if(gameGrid[index]==x) count++;
			row++;
		}
		if(count==2)return true;
		else return false;
	}
		
	private boolean colTest(int r, int c, int x) {
		int count =0;
		int col = c;
		for(int i=0; i<2; i++) {
			int index = ((col+1)%3)+(r*3);
			if(gameGrid[index]==x) count++;
			col++;
		}
		if(count==2)return true;
		else return false;
	}
	
	private void setWinScene() {
		Main.window.setTitle("YOU WON!!!");
		Label winLabel = new Label("YOU WON!!!");
		winLabel.setStyle("-fx-font-size: 50px; -fx-text-fill: #FFCD15; -fx-font-weight: bold;"); 
		ImageView won = new ImageView();
		won.setImage(win);
		VBox pane = new VBox();
		pane.getChildren().addAll(winLabel, won);
		pane.setAlignment(Pos.CENTER);
		pane.setSpacing(100);
		pane.setStyle("  -fx-background-color: linear-gradient(to bottom, #47BAE1, #135268);");
		Scene winScene = new Scene(pane, 500,500);
		Main.window.setScene(winScene);
		PauseTransition pause = new PauseTransition(Duration.seconds(3));
		pause.setOnFinished(event ->{
			if(Main.currentLevel == "Easy") setEasyGame();
			if(Main.currentLevel == "Hardcore") setHardcoreGame();
			if(Main.currentLevel == "PvP") setPVP();
		});
		pause.play();
	}
	
	private void setLoseScene() {
		Main.window.setTitle("YOU LOST!!!");
		Label winLabel = new Label("YOU LOST!!");
		winLabel.setStyle("-fx-font-size: 50px; -fx-text-fill: #FF1515; -fx-font-weight: bold;"); 
		ImageView loser = new ImageView();
		loser.setImage(lose);
		VBox pane = new VBox();
		pane.getChildren().addAll(winLabel, loser);
		pane.setAlignment(Pos.CENTER);
		pane.setSpacing(100);
		pane.setStyle("  -fx-background-color: linear-gradient(to bottom, #47BAE1, #135268);");
		Scene winScene = new Scene(pane, 500,500);
		Main.window.setScene(winScene);
		PauseTransition pause = new PauseTransition(Duration.seconds(3));
		pause.setOnFinished(event ->{
			if(Main.currentLevel == "Easy") setEasyGame();
			if(Main.currentLevel == "Hardcore") setHardcoreGame();
			if(Main.currentLevel == "PvP") setPVP();
		});
		pause.play();
	}
	
	private void setDrawScene() {
		Main.window.setTitle("DRAW!!!");
		Label drawLabel = new Label("DRAW!!!");
		drawLabel.setStyle("-fx-font-size: 50px; -fx-text-fill: #1CFF15; -fx-font-weight: bold;"); 
		ImageView tie = new ImageView();
		tie.setImage(draw);
		tie.setFitHeight(200);
		VBox pane = new VBox();
		pane.getChildren().addAll(drawLabel, tie);
		pane.setAlignment(Pos.CENTER);
		pane.setSpacing(100);
		pane.setStyle("  -fx-background-color: linear-gradient(to bottom, #47BAE1, #135268);");
		Scene winScene = new Scene(pane, 500,500);
		Main.window.setScene(winScene);
		PauseTransition pause = new PauseTransition(Duration.seconds(3));
		pause.setOnFinished(event ->{
			if(Main.currentLevel == "Easy") setEasyGame();
			if(Main.currentLevel == "Hardcore") setHardcoreGame();
			if(Main.currentLevel == "PvP") setPVP();
		});
		pause.play();
	}
}


