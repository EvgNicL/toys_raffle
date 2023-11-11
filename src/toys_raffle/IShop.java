package toys_raffle;

import java.util.ArrayList;

public interface IShop {
    void addToy(Toy toy);
    void changeWeight(int chId, Double newWeight);

    void printToyList();
    ArrayList<Toy> getToysList();
    int getId();


}