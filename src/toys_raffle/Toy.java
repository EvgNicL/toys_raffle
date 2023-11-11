package toys_raffle;

public class Toy {
    protected int id;
    protected String name;
    Double weight;
    int count;

    public Toy (int id, String name, Double weight, int count){
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.count = count;
    }
    @Override
    public String toString() {
        return "toy {" +
                "id= " + id +
                ", name= '" + name + '\'' +
                ", weight= " + weight +
                ", count= " + count +
                '}';
    }
}
