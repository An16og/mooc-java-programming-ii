import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable {
    private List<Movable>hehe;
    public Herd(){
        hehe= new ArrayList<>();
    }
    public void addToHerd(Movable movable){
        hehe.add(movable);
    }
    public void move(int dx, int dy){
        for(Movable m:hehe){
            m.move(dx, dy);
        }
    }
    @Override
    public String toString(){
        String s="";
        for(Movable m:hehe){
            s+=m.toString();
            s+="\n";
        }
        return s;
    }



}
