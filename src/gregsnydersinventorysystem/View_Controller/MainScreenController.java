package gregsnydersinventorysystem.View_Controller;
  
import gregsnydersinventorysystem.GregSnydersInventorySystem;
import static gregsnydersinventorysystem.Model.Inventory.removeProduct;
import gregsnydersinventorysystem.Model.Part;
import gregsnydersinventorysystem.Model.Product;
import java.io.IOException;
import java.util.Optional;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MainScreenController {

    @FXML
    private TableView<Part> partTableView;
    @FXML
    private TableColumn<Part, Integer> partIDCol;
    @FXML
    private TableColumn<Part, String> partNameCol;
    @FXML
    private TableColumn<Part, Integer> partInvCol;
    @FXML
    private TableColumn<Part, Double> partPriceCol;
    
    @FXML
    private TableView<Product> productTableView;
    @FXML
    private TableColumn<Product, Integer> productIDCol;
    @FXML
    private TableColumn<Product, String> productNameCol;
    @FXML
    private TableColumn<Product, Integer> productInvCol;
    @FXML
    private TableColumn<Product, Double> productPriceCol;
    
    
    @FXML
    private Button addPartButton;
    @FXML
    private Button editPartButton;
    @FXML
    private Button deletePartButton;
    @FXML
    private Button searchPartButton;
    @FXML
    private TextField partSearch;
    
    @FXML
    private Button addProductButton;
    @FXML
    private Button editProductButton;
    @FXML
    private Button deleteProductButton;
    @FXML
    private Button searchProductButton;
    @FXML
    private TextField productSearch;
      
    
    //Constructor
    public MainScreenController() {
    }
    
    ObservableList<Part> partsObservableList = FXCollections.observableArrayList();
    ObservableList<Product> productObservableList = FXCollections.observableArrayList();
    
    
    @FXML
    private void initialize() {
        partIDCol.setCellValueFactory(cellData -> cellData.getValue().partIDProperty().asObject());
        partNameCol.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
        partInvCol.setCellValueFactory(cellData -> cellData.getValue().inStockProperty().asObject());
        partPriceCol.setCellValueFactory(cellData -> cellData.getValue().priceProperty().asObject());
        productIDCol.setCellValueFactory(cellData -> cellData.getValue().productIDProperty().asObject());
        productNameCol.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
        productInvCol.setCellValueFactory(cellData -> cellData.getValue().inStockProperty().asObject());
        productPriceCol.setCellValueFactory(cellData -> cellData.getValue().priceProperty().asObject());
    }
    
    
    TableView<Product> table = new TableView<>();
    
    
    //Goes to add part view when clicked           
    @FXML
    void addPartClicked(ActionEvent event) throws IOException {
        Stage stage;
        Parent root;
        
            //get reference to the button's stage
            stage = (Stage)addPartButton.getScene().getWindow();
            //load the other fxml document
            root = FXMLLoader.load(getClass().getResource("InhouseScreen_Add.fxml"));
            //create a new scene with root and set the stage
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
    }

    //Goes to product view when clicked
    @FXML
    void addProductClicked(ActionEvent event) throws IOException {
        Stage stage;
        Parent root;
        
            //get reference to the button's stage
            stage = (Stage)addProductButton.getScene().getWindow();
            //load the other fxml document
            root = FXMLLoader.load(getClass().getResource("ProductScreen_Add.fxml"));
            //create a new scene with root and set the stage
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
    }

    //Deletes one or more products from the table after selected
    @FXML
    void deletePartClicked(ActionEvent event) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("Error Dialog");
        alert.setHeaderText("There was an error");
        
        alert.showAndWait();
    }
    
    //Deletes one or more parts from the table after selected
    @FXML
    void deleteProductClicked(ActionEvent event) {
        Product product = productTableView.getSelectionModel().getSelectedItem();
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.initModality(Modality.NONE);
        alert.setTitle("Confirm Delete");
        alert.setHeaderText("Confirm?");
        alert.setContentText("Are you sure you want to delete " + product.getProductName() + "?");
        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK) {
            removeProduct(product);
            updateProductTable();
            System.out.println("Product " + product.getProductName() + " was removed.");
        } else {
            System.out.println("Product " + product.getProductName() + " was not removed.");
        }
    }

    //Goes to the modify parts view when clicked
    @FXML
    void editPartClicked(ActionEvent event) throws IOException{
        Stage stage;
        Parent root;
        
            //get reference to the button's stage
            stage = (Stage)editPartButton.getScene().getWindow();
            //load the other fxml document
            root = FXMLLoader.load(getClass().getResource("InhouseScreen_Modify.fxml"));
            //create a new scene with root and set the stage
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

    }

    //Goes to the modify product view when clicked
    @FXML
    void editProductClicked(ActionEvent event) throws IOException{
        Stage stage;
        Parent root;
        
            //get reference to the button's stage
            stage = (Stage)addProductButton.getScene().getWindow();
            //load the other fxml document
            root = FXMLLoader.load(getClass().getResource("ProductScreen_Modify.fxml"));
            //create a new scene with root and set the stage
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
    }

    //Searches product in table
    @FXML
    void searchProductClicked(ActionEvent event) {

    }
    
    //Searches part in table
    @FXML
    void searchPartClicked(ActionEvent event) {

    }

    private void updateProductTable() {
    
    }

    private void updatePartTable() {
    
    }
    
  
}