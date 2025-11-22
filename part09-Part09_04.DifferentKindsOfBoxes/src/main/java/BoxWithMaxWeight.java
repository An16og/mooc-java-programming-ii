import java.util.ArrayList;

public class BoxWithMaxWeight extends Box{
    private int capacity;
    private ArrayList<Item> lis;

    public BoxWithMaxWeight(int capacity){
        this.capacity=capacity;
        this.lis= new ArrayList<>();
    }
    public void add(Item item){
        if(capacity>= item.getWeight()){
            capacity-=item.getWeight();
            lis.add(item);
        }
    }
    public boolean isInBox(Item item){
        if(lis.contains(item)){
            return true;
        }
        return false;
    }
}
