package model.toyModel;

public abstract class AbstactToy {
    String nameToy;
    String descriptionToy;
    double priceToy;
    int countToy;

    public void AbstractToy(String nameToy, String descriptionToy, double priceToy, int countToy) {
        this.nameToy = nameToy;
        this.descriptionToy = descriptionToy;
        this.priceToy = priceToy;
        this.countToy = countToy;
    }

    public void setCountToy(int countToy) {
        this.countToy = countToy;
    }
}
