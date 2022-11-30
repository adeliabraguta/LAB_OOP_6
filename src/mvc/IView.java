package mvc;

import People.Cook;
import People.Restaurant;
import People.Waiter;
import Pizza.*;

public interface IView {
    void randomReview(int randomReview);
    void nextCoustomer(int newCustomers);

    void initRestaurant(Restaurant restaurant);

    void endSimulation();

    void daylyProfit(double profitDay, int day);

    void statisticsRestaurant(Restaurant restaurant, int badReview, int goodReview);

    void border1();

    void daylyStatistic(Restaurant restaurant, int workHours, Waiter waiter, Cook cook);

    void randomPizza(BBQ bbq, Capricioasa capricioasa, Pepperoni pepperoni, Diablo diablo, Margherita margherita, Neapolitana neapolitana, QuattroFormaggi quattroFormaggi, int randomPizza, int pizzas);

    void rendomTime(int randomTimeTakeWaiter);

    void condition1(int randomTimeTakeWaiter);
}
