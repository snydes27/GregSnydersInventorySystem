package gregsnydersinventorysystem;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

 public class GregSnydersInventorySystem extends Application {
    
    private Stage primaryStage;
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Inventory Manager");
        
        initMainScreen();
        showMainScreen();
        
    }

    public void initMainScreen() {
        
      try{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(GregSnydersInventorySystem.class.getResource("View_Controller/MainScreen.fxml"));
        AnchorPane MainView = (AnchorPane) loader.load();
    
        Scene scene = new Scene(MainView);
        primaryStage.setScene(scene);
        primaryStage.show();
       
      }  catch (IOException e) {
      }
    }
    
     public void showMainScreen() {
        try {
            
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(GregSnydersInventorySystem.class.getResource("View_Controller/MainScreen.fxml"));
            AnchorPane mainScreen = (AnchorPane) loader.load();

        
          
        } catch (IOException e) {
        }
    }
    
    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public static void main(String[] args) {
        launch(args);
    }
    
    
}
