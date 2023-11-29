package states;

import interfaces.VendingMachineState;

public class NoCoinState implements VendingMachineState {
    @Override
    public void insertCoin() {
        System.out.println("Coin inserted");
    }

    @Override
    public void ejectCoin() {
        System.out.println("No coin to eject");
    }

    @Override
    public void selectProduct() {
        System.out.println("Please insert a coin");
    }

    @Override
    public void dispense() {
        System.out.println("Please insert a coin to dispense");
    }
}
