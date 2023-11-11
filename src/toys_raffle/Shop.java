package toys_raffle;
import java.util.ArrayList;

public class Shop implements IShop {

    ArrayList<Toy> toys;

    public Shop() {
        toys = new ArrayList<>();
    }

    public int getId(){
        int max_id = 0;
        for (Toy t: toys) {
            if (t.id > max_id) {
                max_id = t.id;            }
        }
        return max_id;
    }
    @Override
    public void addToy(Toy toy) {
        if (!toys.contains(toy)) {
            toys.add(toy);
            System.out.println(toy.name + "  is added");
        }
        else System.out.println("Такая игрушка уже есть.");
    }

    public ArrayList<Toy> getToysList(){return toys;}
    public void printToyList(){
        if (!toys.isEmpty()) {
            for (Toy toy : toys) {
                System.out.println(toy.toString());
            }
        }
        else System.out.println("Магазин пуст.");
    }

    @Override
    public void changeWeight(int chId, Double newWeight) {
        try {
            for (Toy t : toys) {
                if (t.id == chId) {
                    t.weight = newWeight;
                    System.out.println();
                    System.out.println("Вес игрушки скорректирован");
                    System.out.println(t);
                    break;
                }
            }
        } catch (NotFoundToyException e){
            System.out.println("Игрушки с таким id нет.");
        }
    }



}
