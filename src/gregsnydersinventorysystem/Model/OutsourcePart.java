package gregsnydersinventorysystem.Model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


public class OutsourcePart extends Part {
    
    protected SimpleStringProperty companyName;
   
    // Constructor
    public OutsourcePart(){
        companyName = new SimpleStringProperty(); 
    }
    
    // Getter
    public SimpleStringProperty getcompanyName() {
        return companyName;
    }

    // Setter
    public void setcompanyName(SimpleStringProperty companyName) {
        this.companyName = companyName;
    }
}
