package model.vendingModel;

import java.util.ArrayList;
import model.toyModel.Toy;

public interface IOptionVendingMachine {
    String addToy(VendingMachine vendingMachine, Toy toy);
    int returnToy(VendingMachine vendingMachine, int iDToy);
    ArrayList<Toy> checkCountToy(VendingMachine vendingMachine);
    void updateCountToy(VendingMachine vendingMachine, Toy toy, int count);
}
