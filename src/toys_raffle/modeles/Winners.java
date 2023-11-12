package toys_raffle.modeles;

import toys_raffle.modeles.IWinners;
import toys_raffle.modeles.Toy;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Winners implements IWinners {
    ArrayList<Toy> winners;
    public Winners(){
        winners = new ArrayList<>();
    }
    public ArrayList<Toy> getWinnersList(ArrayList<Toy> toys){
        if (!toys.isEmpty()){
            int r = getRandom(toys);
            int l = winners.size();
            int w = 0;
            while (l < 11){
                for (Toy t: toys) {
                    int w0 = w + 1;
                    w += (int) (t.count * t.weight * 100);
                    if (w0 <= r &&  r <= w){
                        winners.add(t);
                        toys.remove(t);
                        break;
                    }
                }
                l += 1;
            }
            return winners;
        }
        else System.out.println("Магазин пуст!");

        return null;
    }

    private int getRandom(ArrayList<Toy> toys){
        int totalW = 0;
        Random random = new Random();
        for (Toy toy: toys){
            totalW += (int) (toy.count * toy.weight * 100);
        }
        return random.nextInt(0,totalW);
    }

    public Toy getPrize(ArrayList<Toy> winners){
        if (!winners.isEmpty()){
            return winners.getFirst();
        }
        else System.out.println("Магазин пуст!");
        return null;
    }

    public void saveWinnerToFile(String file, Toy winner){
        try (FileWriter fw = new FileWriter(file, false)){
            System.out.println();
            System.out.println("Ваш приз !!!! (((...");
            System.out.println("id: " + winner.id + "  name:  " + winner.name);
            fw.write("id: " + winner.id + "  name:  " + winner.name);
            fw.append('\n');
        }
        catch (IOException e) {
            System.out.println("Ошибка записи в файл.");
        }
    }



}
