package Pizza;

public class Diablo extends MeatPizza {

    private int gramsOfMushrooms;
    private int gramsOfOlives;
    private int gramsOfHotPeppers;
    private int gramsOfMozzarella;

    public Diablo() {
        super("thick", 35, 60, 140, true);
        this.gramsOfMushrooms = 70;
        this.gramsOfOlives = 40;
        this.gramsOfHotPeppers = 25;
        this.gramsOfMozzarella = 100;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + (gramsOfHotPeppers * 0.65 + gramsOfMozzarella * 0.5 + gramsOfOlives * 0.45 + gramsOfMushrooms * 0.3);
    }

    @Override
    public double costToMake() {
        return super.costToMake();
    }
}