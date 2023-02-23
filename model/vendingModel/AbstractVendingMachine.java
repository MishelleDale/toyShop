package model.vendingModel;

import java.util.ArrayList;
import model.toyModel.Toy;

public class AbstractVendingMachine {
    public ArrayList<Toy> listToy;

    AbstractVendingMachine() {
        this.listToy = new ArrayList<>();
    }
}
