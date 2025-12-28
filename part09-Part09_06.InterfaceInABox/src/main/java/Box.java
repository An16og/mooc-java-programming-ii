import java.util.ArrayList;

public class Box implements Packable{
    private double cap;
    private ArrayList<Packable>pack;

public Box(double cap){
this.cap=cap;
pack= new ArrayList<>();

}

public void add(Packable p){
if(this.cap>=p.weight()){
    pack.add(p);
    cap-=p.weight();
}}

public double weight(){
    double w=0;
for(Packable p:pack){
    w+=p.weight();
}
return w;}
@Override
public String toString(){
    return "Box: "+pack.size()+ " items, total weight "+weight()+" kg"; 
}

}
