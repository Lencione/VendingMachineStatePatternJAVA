package states;

import interfaces.VendingMachineState;

public class HasCoinState implements VendingMachineState {
    @Override
    public void insertCoin() {
        System.out.println("Coin already inserted");
    }

    @Override
    public void ejectCoin() {
        System.out.println("Coin ejected");
    }

    @Override
    public void selectProduct() {
        System.out.println("Product selected");
    }

    @Override
    public void dispense() {
        System.out.println("Product dispensed");
    }
}
