package model.peripheral.peripherals.mice;

import model.peripheral.peripherals.Mouse;

public class WireMouse extends Mouse {
    public WireMouse(String connectionComputer, String brand) {
        super(connectionComputer, brand);
    }

    public WireMouse(String connectionComputer, String brand, boolean hasScrollWeel) {
        super(connectionComputer, brand, hasScrollWeel);
    }
}
