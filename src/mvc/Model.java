package mvc;

import People.Cook;
import People.Customer;
import People.Restaurant;
import People.Waiter;
import Pizza.*;

import java.util.Random;
import java.util.Scanner;

public class Model implements IModel {
    @Override
    public int getRandomTimeTakeWaiter(Random rand) {
        return rand.nextInt(20) + 1;
    }
    @Override
    public int IsWithSomeone(Random rand) {
        return rand.nextInt(2) + 1;
    }
    @Override
    public int getRandomPizzaType(Random rand) {
        return rand.nextInt(7) + 1;
    }
    @Override
    public int getHour(int hour, int newCustomers) {
        hour += newCustomers;
        return hour;
    }
    @Override
    public boolean isNextDay(int nextDay) {
        return nextDay == 1;
    }
    @Override
    public Cook getCook() {
        return new Cook();
    }
    @Override
    public Waiter getWaiter() {
        return new Waiter();
    }
    @Override
    public Random getRandom() {
        return new Random();
    }
    @Override
    public Scanner getScanner() {
        return new Scanner(System.in);
    }
    @Override
    public QuattroFormaggi getQuattroFormaggi() {
        return new QuattroFormaggi();
    }
    @Override
    public Neapolitana getNeapolitana() {
        return new Neapolitana();
    }
    @Override
    public Margherita getMargherita() {
        return new Margherita();
    }
    @Override
    public Diablo getDiablo() {
        return new Diablo();
    }
    @Override
    public Pepperoni getPepperoni() {
        return new Pepperoni();
    }
    @Override
    public Capricioasa getCapricioasa() {
        return new Capricioasa();
    }
    @Override
    public int getPositiveReview(int goodReview) {
        goodReview++;
        return goodReview;
    }
    @Override
    public boolean isDayEnded(int hour) {
        return hour > 480;
    }
    @Override
    public int badReview(int badReview) {
        badReview++;
        return badReview;
    }
    @Override
    public void goodRaiting(Restaurant restaurant) {
        restaurant.setRating(restaurant.getRating() + 0.1);
    }
    @Override
    public int getGoodReview(int goodReview) {
        goodReview++;
        return goodReview;
    }
    @Override
    public int getBadReview(int badReview) {
        badReview++;
        return badReview;
    }
    @Override
    public double makePizza(BBQ bbq, Capricioasa capricioasa, Pepperoni pepperoni, Diablo diablo, Margherita margherita, Neapolitana neapolitana, QuattroFormaggi quattroFormaggi, double profitDay, int randomPizza, int pizzas) {
        switch (randomPizza) {
            case 1:
                profitDay += bbq.getPrice() * pizzas;
                break;
            case 2:
                profitDay += capricioasa.getPrice() * pizzas;
                break;
            case 3:
                profitDay += diablo.getPrice() * pizzas;
                break;
            case 4:
                profitDay += margherita.getPrice() * pizzas;
                break;
            case 5:
                profitDay += neapolitana.getPrice() * pizzas;
                break;
            case 6:
                profitDay += pepperoni.getPrice() * pizzas;
                break;
            case 7:
                profitDay += quattroFormaggi.getPrice() * pizzas;
                break;
        }
        return profitDay;
    }
    @Override
    public void badRaiting(Restaurant restaurant) {
        restaurant.setRating((restaurant.getRating() - 0.1));
    }
    @Override
    public boolean tooMuchTime(int randomTimeTakeWaiter) {
        return randomTimeTakeWaiter > 15;
    }
    @Override
    public int numberOfPizza(Restaurant restaurant, Customer customer, int randomIsWithSomeone, int pizzas) {
        if (randomIsWithSomeone == 2) {
            pizzas = customer.pizzaOrdered(restaurant.getRating());
        }
        return pizzas;
    }
    @Override
    public BBQ getBbq() {
        return new BBQ();
    }
    @Override
    public Customer getCustomer() {
        return new Customer();
    }
    @Override
    public Restaurant getRestaurant() {
        return new Restaurant("Runea", 3, 10_000);
    }

}
