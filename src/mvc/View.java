package mvc;

import People.Cook;
import People.Restaurant;
import People.Waiter;
import Pizza.*;

public class View implements IView {
    @Override
    public void randomReview(int randomReview) {
        switch (randomReview) {
            case 1:
                System.out.println("The customer disliked the service and left a bad review");
                break;
            case 2:
                System.out.println("The customer left no reviews");
                break;
            case 3:
                System.out.println("The customer was pleased with the service and left a good review");
                break;
        }
    }

    @Override
    public void nextCoustomer(int newCustomers) {
        System.out.println("Next customer came in " + newCustomers + " minutes");
    }

    @Override
    public void initRestaurant(Restaurant restaurant) {
        System.out.println(restaurant.getName() + " restaurant's initial rating and budget: " + restaurant.getRating()
                + ", " + restaurant.getBudget());
    }

    @Override
    public void endSimulation() {
        System.out.println("*******************************************************************************");
        System.out.println("Type 0 to end the simulation or 1 to continue to the next day");
    }

    @Override
    public void daylyProfit(double profitDay, int day) {
        System.out.println("Profit for day " + day + ": " + profitDay);
    }

    @Override
    public void statisticsRestaurant(Restaurant restaurant, int badReview, int goodReview) {
        System.out.println("Today were left " + goodReview + " good reviews and " + badReview + " bad reviews");
        System.out.println(restaurant.getName() + " restaurant rating: " + restaurant.getRating());
        System.out.println(restaurant.getName() + " restaurant budget: " + restaurant.getBudget());
    }

    @Override
    public void border1() {
        System.out.println("**********************************++*********************************************");
    }

    @Override
    public void daylyStatistic(Restaurant restaurant, int workHours, Waiter waiter, Cook cook) {
        System.out.println("Work day ended");
        System.out.println("The waiter was payed " + waiter.getSalary(workHours) + " and the cook " + cook.getSalary(workHours));
        System.out.println("Bill price for this day: " + restaurant.bills(workHours));
    }

    @Override
    public void randomPizza(BBQ bbq, Capricioasa capricioasa, Pepperoni pepperoni, Diablo diablo, Margherita margherita, Neapolitana neapolitana, QuattroFormaggi quattroFormaggi, int randomPizza, int pizzas) {
        switch (randomPizza) {
            case 1:
                System.out.println("The customer ordered " + pizzas + " BBQ pizza");
                System.out.println("The check price was: " + bbq.getPrice() * pizzas);
                break;
            case 2:
                System.out.println("The customer ordered " + pizzas + " Capricioasa pizza");
                System.out.println("The check price was: " + capricioasa.getPrice() * pizzas);
                break;
            case 3:
                System.out.println("The customer ordered " + pizzas + " Diablo pizza");
                System.out.println("The check price was: " + diablo.getPrice() * pizzas);
                break;
            case 4:
                System.out.println("The customer ordered " + pizzas + " Margherita pizza");
                System.out.println("The check price was: " + margherita.getPrice() * pizzas);
                break;
            case 5:
                System.out.println("The customer ordered " + pizzas + " Neapolitana pizza");
                System.out.println("The check price was: " + neapolitana.getPrice() * pizzas);
                break;
            case 6:
                System.out.println("The customer ordered " + pizzas + " Pepperoni pizza");
                System.out.println("The check price was: " + pepperoni.getPrice() * pizzas);
                break;
            case 7:
                System.out.println("The customer ordered " + pizzas + " Quattro Formaggi pizza");
                System.out.println("The check price was: " + quattroFormaggi.getPrice() * pizzas);
                break;
        }
    }

    @Override
    public void rendomTime(int randomTimeTakeWaiter) {
        System.out.println("Waiter came in " + randomTimeTakeWaiter + " minutes");
    }

    @Override
    public void condition1(int randomTimeTakeWaiter) {
        if (randomTimeTakeWaiter > 15) {
            System.out.println("Waiter took too long so the customers left");
            System.out.println(randomTimeTakeWaiter + " minutes waisted");
        } else {
            if (randomTimeTakeWaiter <= 5) {
                System.out.println("Waiter came really quickly and customers were pleasantly surprised");
            }
        }
    }
}
