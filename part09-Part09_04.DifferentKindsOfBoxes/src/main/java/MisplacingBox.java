import java.util.ArrayList;
public class MisplacingBox extends Box{
    private ArrayList<Item> lis;

public MisplacingBox(){
    lis= new ArrayList<>();
}
public void add(Item item){
    lis.add(item);
}
public boolean isInBox(Item item){
    return false;
}}
