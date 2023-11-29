package states;

import interfaces.VendingMachineState;

public class VendingMachine {
    private VendingMachineState currentState;

    public VendingMachine() {
        currentState = new NoCoinState();
    }

    public void setState(VendingMachineState state) {
        currentState = state;
    }

    public void insertCoin() {
        currentState.insertCoin();
        if (currentState instanceof NoCoinState) {
            setState(new HasCoinState());
        }
    }

    public void ejectCoin() {
        currentState.ejectCoin();
        if (currentState instanceof HasCoinState) {
            setState(new NoCoinState());
        }
    }

    public void selectProduct() {
        currentState.selectProduct();
        if (currentState instanceof HasCoinState) {
            setState(new NoCoinState());
        }
    }

    public void dispense() {
        currentState.dispense();
        if (currentState instanceof HasCoinState) {
            setState(new NoCoinState());
        }
    }
}
