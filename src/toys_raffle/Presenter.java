package toys_raffle;

import toys_raffle.modeles.Shop;
import toys_raffle.modeles.Toy;
import toys_raffle.modeles.Winners;

public class Presenter {
    Shop shop;
    Winners winners;
    View view;

    public Presenter(){
        this.shop = new Shop();
        this.view = new View();
        this.winners = new Winners();
    }
    String file = "winners.txt";
    public void startApp(){
        int x = 1;
        while (x == 1){
            menu();
            x = view.startRqw();
        }
    }
    private void menu() {
        switch (view.menuRqw()) {
            case 1:
                shop.addToy(new Toy(shop.getId(), "Заясь ", 0.1, 5));
                shop.addToy(new Toy(shop.getId(), "Кукла", 0.2, 3));
                shop.addToy(new Toy(shop.getId(), "Пупсик", 0.1, 7));
                shop.addToy(new Toy(shop.getId(), "Машинка", 0.6, 10));
                break;
            case 2:
                shop.printToyList();
                break;
            case 3:
                shop.changeWeight(1,0.2);
                break;
            case 4:
                Toy winner = winners.getPrize(winners.getWinnersList(shop.getToysList()));
                winners.saveWinnerToFile(file, winner);
                break;
            default:
                System.out.println("____");
        }
    }
}
