import java.util.HashMap;

public class Order {
    private int id;
    private HashMap<String,Integer> fruitmap;

    public Order() {
        this.fruitmap = new HashMap<String,Integer>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public HashMap<String, Integer> getFruitmap() {
        return fruitmap;
    }

    public void setFruitmap(String fruitkind,int quantity) {
        this.fruitmap.put(fruitkind,quantity);
    }
}
