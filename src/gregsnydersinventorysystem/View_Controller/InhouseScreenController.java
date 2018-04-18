package gregsnydersinventorysystem.View_Controller;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class InhouseScreenController {

    @FXML
    private RadioButton inhouseRadio;
    @FXML
    private RadioButton outsourceRadio;
    @FXML
    private TextField partID;
    @FXML
    private Button saveButton;
    @FXML
    private Button cancelButton;
    @FXML
    private TextField partName;
    @FXML
    private TextField partCount;
    @FXML
    private TextField partPrice;
    @FXML
    private TextField partMax;
    @FXML
    private TextField partMin;
    @FXML
    private TextField machineID;
    
    @FXML
    void cancelPartClicked(ActionEvent event) throws IOException {
        Stage stage;
        Parent root;
            //get reference to the button's stage
            stage = (Stage)cancelButton.getScene().getWindow();
            //load up other fxml document
            root = FXMLLoader.load(getClass().getResource("MainScreen.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
    }
   
    @FXML
    void inhouseRadioSelected(ActionEvent event) {

    }

    @FXML
    void outsourceRadioSelected(ActionEvent event) {

    }

    @FXML
    void savePartClicked(ActionEvent event) {

    }

}
