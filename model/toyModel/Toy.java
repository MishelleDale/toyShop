package model.toyModel;

public class Toy extends AbstactToy {
    protected int idToy;
    protected String type;

    public Toy (int idToy, String nameToy, String descriptionToy, double priceToy, int countToy) {
        super();
        this.idToy = idToy;
        this.type = "Не определен";
    }
}
