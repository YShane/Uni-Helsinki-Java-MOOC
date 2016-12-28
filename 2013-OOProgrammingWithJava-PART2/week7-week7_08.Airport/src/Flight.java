/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shane Yankam 
 * Shaneyankam.com
 * Samyyankam@gmail.com
 */

public class Flight {
    
    private String planeId;
    private String depApCode;
    private String desApCode;
    
    
    public Flight(String id, String depCO, String desCO){
        
        this.planeId = id;
        this.depApCode= depCO;
        this.desApCode = desCO;
        
        
    }

    public String getPlaneId() {
        return planeId;
    }

    public void setPlaneId(String planeId) {
        this.planeId = planeId;
    }

    public String getDepApCode() {
        return depApCode;
    }

    public void setDepApCode(String depApCode) {
        this.depApCode = depApCode;
    }

    public String getDesApCode() {
        return desApCode;
    }

    public void setDesApCode(String desApCode) {
        this.desApCode = desApCode;
    }

    
}
