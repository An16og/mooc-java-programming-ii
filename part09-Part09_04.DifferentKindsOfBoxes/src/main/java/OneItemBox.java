import java.util.ArrayList;

public class OneItemBox extends Box {
    private boolean token;
    private ArrayList<Item> items;

    public OneItemBox(){
        items= new ArrayList<>();
        this.token=false;
    }
    public void add(Item item){
        if(token==false){
            items.add(item);
            token=true;

        }

    }
    public boolean isInBox(Item item){
        if (items.contains(item)){
            return true;
        }
        return false;
    }
}
