package model.peripheral.peripherals.mice;

import model.peripheral.peripherals.Mouse;

public class WirelessMouse extends Mouse {
    public WirelessMouse(String connectionComputer, String brand) {
        super(connectionComputer, brand);
    }

    public WirelessMouse(String connectionComputer, String brand, boolean hasScrollWeel) {
        super(connectionComputer, brand, hasScrollWeel);
    }
}
