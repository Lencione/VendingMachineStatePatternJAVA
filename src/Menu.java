import states.VendingMachine;

import java.util.Scanner;

public class Menu {
    public void showMenu() {
        VendingMachine vendingMachine = new VendingMachine();
        Scanner scanner = new Scanner(System.in);

        int choice;

        do {
            System.out.println("===== Vending Machine Menu =====");
            System.out.println("1. Insert Coin");
            System.out.println("2. Eject Coin");
            System.out.println("3. Select Product");
            System.out.println("4. Dispense Product");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            System.out.println("===================\n\n");

            switch (choice) {
                case 1:
                    vendingMachine.insertCoin();
                    System.out.println("===================\n\n");
                    break;

                case 2:
                    vendingMachine.ejectCoin();
                    System.out.println("===================\n\n");
                    break;

                case 3:
                    vendingMachine.selectProduct();
                    System.out.println("===================\n\n");
                    break;

                case 4:
                    vendingMachine.dispense();
                    System.out.println("===================\n\n");
                    break;

                case 0:
                    System.out.println("Exiting Vending Machine. Goodbye!");
                    System.out.println("===================\n\n");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    System.out.println("===================\n\n");
                    break;
            }

        } while (choice != 0);

        scanner.close();
    }
}
