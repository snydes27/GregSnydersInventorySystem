package gregsnydersinventorysystem.Model;

import java.util.ArrayList;
import gregsnydersinventorysystem.Model.Part;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class Product {
    
    ArrayList parts = new ArrayList<>();
    
    private IntegerProperty productID;
    private StringProperty name;
    private DoubleProperty price;
    private IntegerProperty inStock;
    private IntegerProperty min;
    private IntegerProperty max;
    
    //Constructor
    public Product() {
        productID = new SimpleIntegerProperty();
        name = new SimpleStringProperty();
        price = new SimpleDoubleProperty();
        inStock = new SimpleIntegerProperty();
        min = new SimpleIntegerProperty();
        max = new SimpleIntegerProperty();
        
    } 

    //properties for binding to mainscreencontroller
    public StringProperty nameProperty() {
        return name;
    }
    
    public IntegerProperty productIDProperty() {
        return productID;
    }
    
    public DoubleProperty priceProperty() {
        return price;
    }
    
    public IntegerProperty inStockProperty() {
        return inStock;
    }
    
    //getters and setters
    public String getProductName() {
        return this.name.get();
    }
    
    
}
