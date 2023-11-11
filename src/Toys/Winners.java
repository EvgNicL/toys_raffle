package Toys;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Winners implements IWinners{
    ArrayList<Toy> winners;
    public Winners(){
        winners = new ArrayList<>();
    }
    public ArrayList<Toy> getWinnersList(ArrayList<Toy> toys){
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
    public void printWinnersList(){
        for (Toy t: winners){
            System.out.println(t.toString());
        }
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
        return winners.getFirst();
    }

    public void saveWinnerToFile(String file, Toy winner){
        try (FileWriter fw = new FileWriter(file, false)){
            System.out.println();
            System.out.println("Ваш приз !!!! (((...");
            System.out.println("id: " + winner.id + "  name:  " + winner.name);
            fw.write(String.valueOf(String.valueOf("id: " + winner.id + "  name:  " + winner.name)));
            fw.append('\n');
        }
        catch (IOException e) {
            System.out.println("Ошибка записи в файл.");
        }
    }



}
