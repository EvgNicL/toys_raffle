package Toys;

import java.util.ArrayList;

public class Presenter {
    Shop shop = new Shop();
    Winners winners = new Winners();

    public void startApp(){
        shop.addToy(new Toy(1, "Заясь ", 0.1, 5));
        shop.addToy(new Toy(2, "Кукла", 0.2, 3));
        shop.addToy(new Toy(3, "Пупсик", 0.1, 7));
        shop.addToy(new Toy(4, "Машинка", 0.6, 10));

        shop.printToyList();

        shop.changeWeight(3,0.3);

        Toy winner =  winners.getPrize(winners.getWinnersList(shop.getToysList()));

        String file = "winners.txt";
        winners.saveWinnerToFile(file, winner);


    }
}
