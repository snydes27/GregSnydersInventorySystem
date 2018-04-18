/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gregsnydersinventorysystem.Model;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

abstract public class Part {

    private StringProperty name;
    private IntegerProperty partID;
    private DoubleProperty price;
    private IntegerProperty inStock;
    private IntegerProperty min;
    private IntegerProperty max;
    
    //Constructor
    public Part() {
        partID = new SimpleIntegerProperty();
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
    
    public IntegerProperty partIDProperty() {
        return partID;
    }
    
    public DoubleProperty priceProperty() {
        return price;
    }
    
    public IntegerProperty inStockProperty() {
        return inStock;
    }
    
    
    
    //getters and setters
    //public String getName() {
    //   return name.get();
    // }   
    
    
    public StringProperty getName() {
        return name;
    }

    public void setName(StringProperty name) {
        this.name = name;
    }

    public IntegerProperty getPartID() {
        return partID;
    }

    public void setPartID(IntegerProperty partID) {
        this.partID = partID;
    }

    public DoubleProperty getPrice() {
        return price;
    }

    public void setPrice(DoubleProperty price) {
        this.price = price;
    }

    public IntegerProperty getInstock() {
        return inStock;
    }

    public void setInstock(IntegerProperty instock) {
        this.inStock = instock;
    }

    public IntegerProperty getMin() {
        return min;
    }

    public void setMin(IntegerProperty min) {
        this.min = min;
    }
    
    public IntegerProperty getMax() {
        return max;
    }
    
    public void setMax(IntegerProperty max) {
        this.max = max;
    }
    
}
    
   


