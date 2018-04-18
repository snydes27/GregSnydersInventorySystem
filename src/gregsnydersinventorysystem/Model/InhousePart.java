package gregsnydersinventorysystem.Model;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.IntegerProperty;


public class InhousePart extends Part {
    
    protected SimpleIntegerProperty machineID;
   
    // Constructor
    public InhousePart(){
        machineID = new SimpleIntegerProperty(); 
    }
    
    // Getter
    public SimpleIntegerProperty getMachineID() {
        return machineID;
    }

    // Setter
    public void setMachineID(SimpleIntegerProperty machineID) {
        this.machineID = machineID;
    }
}
