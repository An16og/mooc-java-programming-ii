import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Hand implements Comparable<Hand>{
private ArrayList<Card>hand;

public Hand(){
    this.hand= new ArrayList<>();
}

public int value(){
    return hand.stream()
    .mapToInt(x->x.getValue())
    .sum();
    
}
public void add(Card card){
    hand.add(card);
}
public void sort(){
    Comparator<Card> comparator= Comparator.comparing(Card::getValue).thenComparing(Card::getSuit);
    Collections.sort(hand,comparator);
}
public void print(){
    hand.stream()
    .forEach(System.out::println);
}
public void sortBySuit(){
    Collections.sort(hand,new BySuitInValueOrder());
}
@Override 
public int compareTo(Hand hand){
    return this.value()-hand.value();

}
}
