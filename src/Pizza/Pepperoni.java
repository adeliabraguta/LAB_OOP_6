package Pizza;

public class Pepperoni extends MeatPizza {

    private int gramsOfMozzarella;
    private int paprikaAndChilly;

    public Pepperoni() {
        super("thin", 30, 50, 100, true);
        this.gramsOfMozzarella = 100;
        this.paprikaAndChilly = 15;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + paprikaAndChilly * 0.15 + gramsOfMozzarella * 0.5;
    }

    @Override
    public double costToMake() {
        return super.costToMake();
    }
}