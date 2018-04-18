package gregsnydersinventorysystem.View_Controller;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ProductScreenController {

    @FXML
    private Button searchPartButton;
    @FXML
    private Button addPartButton;
    @FXML
    private Button deletePartButton;
    @FXML
    private Button cancelProductButton;
    @FXML
    private Button saveProductButton;
    @FXML
    private TextField productID;
    @FXML
    private TextField searchPartField;
    @FXML
    private TextField productName;
    @FXML
    private TextField productCount;
    @FXML
    private TextField productPrice;
    @FXML
    private TextField productMax;
    @FXML
    private TextField productMin;
    
    @FXML
    void addPartClicked(ActionEvent event) {

    }

    @FXML
    void cancelProductClicked(ActionEvent event) throws IOException {
        Stage stage;
        Parent root;
            //get reference to the button's stage
            stage = (Stage)cancelProductButton.getScene().getWindow();
            //load up other fxml document
            root = FXMLLoader.load(getClass().getResource("MainScreen.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
    }

    @FXML
    void deletePartClicked(ActionEvent event) {

    }

    @FXML
    void saveProductClicked(ActionEvent event) {

    }

    @FXML
    void searchPartClicked(ActionEvent event) {

    }

}