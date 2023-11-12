package toys_raffle;

import toys_raffle.modeles.Shop;
import toys_raffle.modeles.Toy;
import toys_raffle.modeles.Winners;


public class Presenter {
    Shop shop = new Shop();
    Winners winners = new Winners();
    View view = new View();

    public void menu(){
        switch (view.menuRqw()){
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
                shop.changeWeight(view.idRqw(), view.weightRqw());
                break;
            case 4:
                Toy winner =  winners.getPrize(winners.getWinnersList(shop.getToysList()));
                String file = "winners.txt";
                winners.saveWinnerToFile(file, winner);
                break;
            default:
                System.out.println("-------");
        }
    }
    public void startApp(){
        int w = 1;
        while (w == 1){
            menu();
            w = view.startRqw();
        }
    }
}
