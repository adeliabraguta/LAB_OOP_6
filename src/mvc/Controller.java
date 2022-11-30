package mvc;

import People.Cook;
import People.Customer;
import People.Restaurant;
import People.Waiter;
import Pizza.*;

import java.util.Random;
import java.util.Scanner;

public class Controller implements IController {
    IView view = new View();
    Model model = new Model();

    @Override
    public void display() {
        Restaurant restaurant = model.getRestaurant();
        view.initRestaurant(restaurant); //view
        Customer customer = model.getCustomer();
        BBQ bbq = model.getBbq();
        Capricioasa capricioasa = model.getCapricioasa();
        Pepperoni pepperoni = model.getPepperoni();
        Diablo diablo = model.getDiablo();
        Margherita margherita = model.getMargherita();
        Neapolitana neapolitana = model.getNeapolitana();
        QuattroFormaggi quattroFormaggi = model.getQuattroFormaggi();
        Scanner scanner = model.getScanner();
        Random rand = model.getRandom();
        Waiter waiter = model.getWaiter();
        Cook cook = model.getCook();
        double profitDay = 0;
        int nextDay = 1;
        int day = 1;
        int badReview = 0;
        int goodReview = 0;
        int workHours = 480;
        int hour = 0;
        while (model.isNextDay(nextDay)) {
            int newCustomers = customer.timeBetweenCustomers(restaurant.getRating());
            view.nextCoustomer(newCustomers); //view
            hour = model.getHour(hour, newCustomers);
            int randomPizza = model.getRandomPizzaType(rand);
            int randomIsWithSomeone = model.IsWithSomeone(rand);
            int pizzas = 1;
            pizzas = model.numberOfPizza(restaurant, customer, randomIsWithSomeone, pizzas);
            int randomTimeTakeWaiter = model.getRandomTimeTakeWaiter(rand);
            hour += randomTimeTakeWaiter;
            view.condition1(randomTimeTakeWaiter); //view
            if (model.tooMuchTime(randomTimeTakeWaiter)) {
                model.badRaiting(restaurant);
                badReview = model.badReview(badReview);
            } else {
                if (randomTimeTakeWaiter <= 5) {
                    model.goodRaiting(restaurant);
                    goodReview = model.getGoodReview(goodReview);
                }
                hour += randomTimeTakeWaiter;
                view.rendomTime(randomTimeTakeWaiter); //view
                view.randomPizza(bbq, capricioasa, pepperoni, diablo, margherita, neapolitana, quattroFormaggi, randomPizza, pizzas); //view
                profitDay = model.makePizza(bbq, capricioasa, pepperoni, diablo, margherita, neapolitana, quattroFormaggi, profitDay, randomPizza, pizzas);
                hour += 15 * (pizzas / 2) + (pizzas % 2);
                int randomReview = rand.nextInt(3) + 1;
                view.randomReview(randomReview); //view
                switch (randomReview) {
                    case 1:
                        restaurant.setRating((restaurant.getRating() - 0.2));
                        badReview = model.getBadReview(badReview);
                        break;
                    case 3:
                        restaurant.setRating((restaurant.getRating() + 0.2));
                        goodReview = model.getPositiveReview(goodReview);
                        break;
                }
            }
            view.border1();
            if (model.isDayEnded(hour)) {
                view.daylyStatistic(restaurant, workHours, waiter, cook);
                profitDay -= waiter.getSalary(workHours) + cook.getSalary(workHours) + restaurant.bills(workHours);
                view.daylyProfit(profitDay, day);
                day++;
                restaurant.setBudget(restaurant.getBudget() + profitDay);
                view.statisticsRestaurant(restaurant, badReview, goodReview);
                profitDay = 0;
                hour = 0;
                goodReview = 0;
                badReview = 0;
                view.endSimulation();
                nextDay = scanner.nextInt();
            }
        }
    }

}
