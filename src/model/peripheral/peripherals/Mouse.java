package model.peripheral.peripherals;

import model.peripheral.Peripheral;

public class Mouse extends Peripheral {

    private boolean hasScrollWeel;
    public Mouse(String connectionComputer, String brand) {
        super(connectionComputer, brand);
        this.hasScrollWeel = false;

    }

    public Mouse(String connectionComputer, String brand, boolean hasScrollWeel) {
        super(connectionComputer, brand);
        this.hasScrollWeel = hasScrollWeel;
    }

    public boolean isHasScrollWeel() {
        return hasScrollWeel;
    }

    @Override
    public String displayDetails() {
        return super.displayDetails();
    }
}
