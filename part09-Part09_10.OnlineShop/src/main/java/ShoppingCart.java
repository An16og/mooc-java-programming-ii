import java.util.List;
import java.util.ArrayList;;

public class ShoppingCart {
    private List<Item>mist;
    public ShoppingCart(){
        mist= new ArrayList<>();
    }
public void add(String product, int price){
    Item a = new Item(product, 1, price);
    for(Item i:mist){
        if(i.equals(a)){
        i.increaseQuantity();
        return;
    }   
    }mist.add(a);

}
    public int price(){
        int price=0;
        for(Item i:mist){
            price+=i.price();
        }
        return price;
    }
    public void print(){
        for(Item i:mist){
            System.out.println(i+": "+i.price());
        }
    }
}