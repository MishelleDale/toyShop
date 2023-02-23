package model.vendingModel;

import java.util.ArrayList;
import model.toyModel.Toy;


public class VendingMachine extends AbstractVendingMachine{
    public VendingMachine(ArrayList<Toy> list) {
        this.listToy = new ArrayList<>(list);
    }
    // Этот класс реализует конструктор абстрактного класса и позволяет создать экземпляр торгового автомата
}