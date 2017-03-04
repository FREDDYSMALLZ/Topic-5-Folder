import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;
import java.util.ArrayList;
//Display a rectanguloid
public class Chapter14Exercise extends Application {
	@Override //Override the start method in the Application class
	  public void start(Stage primaryStage) {       
	    Pane pane = new Pane(); // create a pane
	    //The getter and setter methods for property values
	    double paneWidth = 50;
	    double paneHeight = 20;
	    double width = 120;
	    double height = 60;
	    
	    
	    // Drawing  the front part of the  rectangle
	    Rectangle r1 = new Rectangle(50, 20, width, height);
	    r1.setFill(Color.ORANGE);
	    r1.setStroke(Color.GREEN);
	   
	    
	    // Drawing  the back part of the rectangle rectangle
	    Rectangle r2 = new Rectangle(50, 100, width, height);
	    r2.setFill(Color.ORANGE);
	    r2.setStroke(Color.GREEN);
	    
	    pane.getChildren().add(r1);
	    pane.getChildren().add(r2);
	    

	    Scene scene = new Scene(pane, paneWidth, paneHeight);
	    primaryStage.setTitle("Exercise14_14"); 
	    primaryStage.setScene(scene); 
	    primaryStage.show();
	  }

	  
	  public static void main(String[] args) {
	    launch(args);
	  }
	


	}

	       
	    
    