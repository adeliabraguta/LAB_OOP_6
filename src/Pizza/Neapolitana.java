package Pizza;

public class Neapolitana extends MeatPizza {
    private int gramsOfMushrooms;
    private int gramsOfMozzarella;

    public Neapolitana() {
        super("thin", 25, 50, 100, true);
        this.gramsOfMushrooms = 50;
        this.gramsOfMozzarella = 75;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + gramsOfMozzarella * 0.5 + gramsOfMushrooms * 0.3;
    }

    @Override
    public double costToMake() {
        return super.costToMake();
    }
}