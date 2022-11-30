package mvc;

import People.Cook;
import People.Customer;
import People.Restaurant;
import People.Waiter;
import Pizza.*;

import java.util.Random;
import java.util.Scanner;

public interface IModel {
    int getRandomTimeTakeWaiter(Random rand);

    int IsWithSomeone(Random rand);

    int getRandomPizzaType(Random rand);

    int getHour(int hour, int newCustomers);

    boolean isNextDay(int nextDay);

    Cook getCook();

    Waiter getWaiter();

    Random getRandom();

    Scanner getScanner();

    QuattroFormaggi getQuattroFormaggi();

    Neapolitana getNeapolitana();

    Margherita getMargherita();

    Diablo getDiablo();

    Pepperoni getPepperoni();

    Capricioasa getCapricioasa();

    int getPositiveReview(int goodReview);

    boolean isDayEnded(int hour);

    int badReview(int badReview);

    void goodRaiting(Restaurant restaurant);

    int getGoodReview(int goodReview);

    int getBadReview(int badReview);

    double makePizza(BBQ bbq, Capricioasa capricioasa, Pepperoni pepperoni, Diablo diablo, Margherita margherita, Neapolitana neapolitana, QuattroFormaggi quattroFormaggi, double profitDay, int randomPizza, int pizzas);

    void badRaiting(Restaurant restaurant);

    boolean tooMuchTime(int randomTimeTakeWaiter);

    int numberOfPizza(Restaurant restaurant, Customer customer, int randomIsWithSomeone, int pizzas);

    BBQ getBbq();

    Customer getCustomer();

    Restaurant getRestaurant();
}
