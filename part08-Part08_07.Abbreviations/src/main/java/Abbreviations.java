import java.util.HashMap;

public class Abbreviations {
    private HashMap <String,String>h;

    public Abbreviations(){
    h=new HashMap<>();
}
public void addAbbreviation(String abbreviation, String explanation){
    h.put(abbreviation, explanation);
}
public boolean hasAbbreviation(String abbreviation){
    boolean n= h.containsKey(abbreviation);
    return n;
}
public String findExplanationFor(String abbreviation){
   return h.get(abbreviation);
}

}
