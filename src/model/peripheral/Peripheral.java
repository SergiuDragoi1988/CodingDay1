package model.peripheral;

import model.peripheral.peripherals.Mouse;

public class Peripheral {

    private  String  connectionComputer;
    private String brand;

    public Peripheral(String connectionComputer, String brand) {
        this.connectionComputer = connectionComputer;
        this.brand = brand;
    }

    public String getConnectionComputer() {
        return connectionComputer;
    }

    public void setConnectionComputer(String connectionComputer) {
        this.connectionComputer = connectionComputer;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String displayDetails()
    {
        String toReturn = "I'm a peripheral!";
        if(this instanceof Mouse){
            toReturn+="of type mouse with"+this.getConnectionComputer()+"connection made by "+
                    getBrand()+"and I have a wheel?"+((Mouse)this).isHasScrollWeel();

        }
        return toReturn;


    }

}
