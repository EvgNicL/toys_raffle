package toys_raffle.modeles;

import java.util.ArrayList;

public interface IWinners {
    void saveWinnerToFile(String file, Toy winner);
    Toy getPrize(ArrayList<Toy> winners);
    ArrayList<Toy> getWinnersList(ArrayList<Toy> toys);
}
